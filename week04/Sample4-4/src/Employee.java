import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Employee {
    private String[] person;  //person[0] = name 1 = employeeId
    private Date birthday;
    private Department department;
    private Grade grade;
    private int extraPay;

    public Employee(String[] person, Date birthday, Department department, Grade grade, int extraPay) {
        this.person = person;
        this.birthday = birthday;
        this.department = department;
        this.grade = grade;
        this.extraPay = extraPay;
    }

    public void inputExtraPay() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님의 수당 입력:", name);
            extraPay = keyboard.nextInt();
            if (extraPay >= 0 && extraPay <= 1000000) {
                break;
            } else {
                System.err.print("error 수당오류");
                System.in.read();
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
    }

    @Override
    public String toString() {
        return String.format("%3s%s %4s %3s %3c %,10d원 %,10d원 %,10d원 %,8d %,10d원", person[0], birthday, person[1], department.getDepartName(),
                grade.getGrade(), grade.getSalary(), extraPay, gross(), tax(), net());
    }
}
