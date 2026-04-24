import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Researcher("424561", "최명길", "2012년 4월 20일", 3, 2, 56789000, 3.6));
        employees.add(new Salesman("124655", "정통파", "2013년 12월 20일", 2, 3, 34678990, 2.7));
        employees.add(new Regular("348967", "진집읍", "1987년 6월 22일", 4, 5));
        employees.add(new Salesman("124567", "한송이", "2011년 4월 19일", 3, 4, 5678900, 2.6));
        employees.add(new Manager("245778", "한민국", "2012년 12월 20일", 3, 1));
        employees.add(new Temporary("456213", "이대한", "1999년 5월 13일", 34500, 25));
        employees.add(new Temporary("123456", "경복대", "1993년 10월 5일", 26700, 23));

        employees.sort((e1, e2) -> Long.compare(e2.getTotalPay(), e1.getTotalPay()));

        DecimalFormat df = new DecimalFormat("#,###");
        String header = "사번\t이름(생일)\t\t급-호\tday\t일당\t기본급\t수당\t급여액\t세금\t지급액\t비고";

        System.out.println("\n\t\t\t\t[ 경복주식회사 급여 대장 ]");
        System.out.println("=".repeat(110));
        System.out.println(header);
        System.out.println("-".repeat(110));

        long totalNetPaySum = 0; // 전체 실지급액 합계

        for (Employee e : employees) {
            String nameWithBirth = e.name + "(" + e.birthday + ")";
            String gradeStep = "0급-0호";
            int day = 0;
            long dailyPay = 0;
            long bonus = e.calculateBonus();

            if (e instanceof Regular) {
                Regular re = (Regular) e;
                gradeStep = re.grade + "급-" + re.step + "호";
            }

            if (e instanceof Temporary) {
                Temporary te = (Temporary) e;
                day = 25;
                dailyPay = te.calculateBaseSalary() / day;
            }

            System.out.printf("%s\t%s\t%s\t%d\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
                    e.employeeID,
                    nameWithBirth,
                    gradeStep,
                    day,
                    df.format(dailyPay),
                    df.format(e.calculateBaseSalary()),
                    df.format(bonus),
                    df.format(e.getTotalPay()),
                    df.format(e.calculateTax()),
                    df.format(e.getNetPay()),
                    e.getJobTitle()
            );

            totalNetPaySum += e.getNetPay();
        }

        System.out.println("-".repeat(110));
        System.out.println("\t\t\t\t\t총 지급액 합계 : " + df.format(totalNetPaySum) + "원");
        System.out.println("=".repeat(110));
    }
}