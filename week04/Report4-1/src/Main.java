import java.util.ArrayList;
import java.util.List;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        SalaryCalculator calc = new SalaryCalculator();
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("11111", "홍길동", 1, false, 1, 1, 200000));
        list.add(new Employee("12231", "한국민", 3, false, 2, 3, 300000));
        list.add(new Employee("13156", "이대한", 4, true, 2, 4, 200000));
        list.add(new Employee("13211", "한아름", 5, false, 3, 3, 100000));
        list.add(new Employee("16171", "새로움", 4, false, 3, 5, 200000));
        list.add(new Employee("17778", "이기쁨", 3, false, 2, 3, 200000));
        list.add(new Employee("18567", "정동진", 1, true, 2, 2, 200000));
        list.add(new Employee("19129", "김진우", 4, false, 1, 1, 200000));
        list.add(new Employee("19891", "이나래", 3, false, 3, 4, 200000));
        list.add(new Employee("21190", "박명길", 2, false, 2, 5, 300000));

        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.printf("%-6s %-6s %-8s %-4s %-6s %-10s %-8s %-8s %-8s %-8s %-10s\n",
                "이름", "사번", "부서명", "원호", "급-호", "본봉", "업무수당", "직급수당", "공제금액", "세금", "수령액");
        System.out.println("---------------------------------------------------------------------------------------------------------");

        for (Employee e : list) {
            int base = calc.getBaseSalary(e.getGrade(), e.getClassNo());
            int partAllow = calc.getPartAllowance(e.getPartCode());
            int gradeAllow = calc.getGradeAllowance(e.getGrade());
            int deduction = calc.calculateDeduction(base, e.getAid());

            int taxableAmount = (base + partAllow + gradeAllow) - deduction;
            int tax = calc.calculateTax(taxableAmount, base, e.isSpecial());
            int netPay = (base + partAllow + gradeAllow) - tax - deduction;

            System.out.printf("%-6s %-7s %-8s %-4s %d - %d  %,10d %,8d %,8d %,8d %,8d %,10d\n",
                    e.getName(), e.getId(), calc.getPartName(e.getPartCode()),
                    e.isSpecial() ? "O" : "X", e.getGrade(), e.getClassNo(),
                    base, partAllow, gradeAllow, deduction, tax, netPay);
        }
        System.out.println("---------------------------------------------------------------------------------------------------------");
    }
}