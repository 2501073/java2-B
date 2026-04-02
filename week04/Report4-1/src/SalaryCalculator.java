public class SalaryCalculator {
    private static final int[][] BASE_SALARY_TABLE = {
            {1250000, 950000, 750000},
            {1200000, 925000, 725000},
            {1150000, 900000, 700000},
            {1100000, 875000, 675000},
            {1050000, 850000, 650000}
    };

    public String getPartName(int code) {
        return switch (code) {
            case 1 -> "경리과";
            case 2 -> "인사과";
            case 3 -> "영업팀";
            case 4 -> "생산과";
            case 5 -> "A/S 팀";
            default -> "기타";
        };
    }

    public int getBaseSalary(int grade, int classNo) {
        return BASE_SALARY_TABLE[classNo - 1][grade - 1];
    }

    public int getPartAllowance(int code) {
        return switch (code) {
            case 1, 2 -> 250000;
            case 3, 4 -> 350000;
            case 5 -> 300000;
            default -> 0;
        };
    }

    public int getGradeAllowance(int grade) {
        return (grade == 1) ? 300000 : (grade == 2) ? 200000 : 100000;
    }

    public int calculateDeduction(int baseSalary, int aid) {
        int basicDeduction = (int)(baseSalary * 0.03);
        int personalSavings = Math.min(aid, 300000);
        return basicDeduction + personalSavings;
    }

    public int calculateTax(int taxableAmount, int baseSalary, boolean isSpecial) {
        double rate = 0;
        if (taxableAmount >= 1000000) rate = 0.09;
        else if (taxableAmount >= 800000) rate = 0.07;
        else if (taxableAmount >= 700000) rate = 0.05;

        int tax = (int)(taxableAmount * rate);
        if (isSpecial) {
            tax += (int)(baseSalary * 0.03);
        }
        return tax;
    }
}
