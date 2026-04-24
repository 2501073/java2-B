public class Researcher extends Regular{
    private final long RESEARCH_ALLOWANCE = 300000;

    public Researcher(String id, String name, String birth, int grade, int step) {
        super(id, name, birth, grade, step);
    }

    @Override
    public long calculateBonus() {
        return RESEARCH_ALLOWANCE; // 연구 수당 반환
    }

    @Override
    public String getJobTitle() {
        return "연구직";
    }

    @Override
    public long calculateTax() {
        long taxablePay = calculateBaseSalary();
        double taxRate;

        if (taxablePay <= 2000000) taxRate = 0.066;
        else if (taxablePay <= 4000000) taxRate = 0.073;
        else taxRate = 0.085;

        return (long) (taxablePay * taxRate);
    }
}
