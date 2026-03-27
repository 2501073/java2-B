import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees;

    public Company(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    protected void inputData() {
        for (int i = 0; i < employees.size(); i++)
            employees.get(i).inputExtraPay();
    }



    protected void display() {
        line();
        System.out.println("이름(생일) 사번 부서 호봉 기본급 수당 급여 세금 지급액");
        line();
        for (int i = 0; i < employees.size(); i++)
            System.out.println(employees.get(i).toString());
        line();
    }

    private void line() {
        for (int i = 0; i < 80; i++)
            System.out.print("*");
        System.out.println();
    }
}
