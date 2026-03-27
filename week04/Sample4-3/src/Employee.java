import java.io.IOException;
import java.util.Scanner;

public class Employee extends Person{
    private String employeeId;
    private Department department;
    private Grade grade;
    private int extraPay;

    public Employee(String name, Date birthday, String employeeId, Department department, Grade grade) {
        super(name, birthday);
        this.employeeId = employeeId;
        this.department = department;
        this.grade = grade;
    }

    public void inputExtraPay() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님의 수당 입력:", super.getname);
            extraPay = keyboard.nextInt();
            if (extraPay >= 0 && extraPay <= 1000000) {
                break;
            } else {
                System.err.print("error 수당오류");
                System.in.read();
            }
        }
    }

    private int gross() {
        return salry() + extraPay;
    }

    private int tax() {
        int tax = 0;
        if (gross() < 1700000)
            tax = (int) (gross() * (5.0f / 100));
        else if (gross() < 2300000)
            tax = (int) (gross() * (8.0f / 100));
        else
            tax = (int) (gross() * (10.0f / 100));
        tax = tax / 10 * 10;
        return tax;
    }

    private int net() {
        return gross() - tax();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%4s %3s %2c %,10d원 %,10원 %,10d원 %,8d원 %,10d원",
                employeeId, department.getDepartName(), grade.getGrade(), grade.getSalary(), gross(), tax(), net());
    }
}
