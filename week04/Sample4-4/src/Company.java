public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    protected void inputData() {
        for (int i = 0; i < employees.length; i++)
            employees[i].inputExtraPay();
    }

    protected void display() {
        line();
        System.out.println("  이름(생일)  사번  부서  호봉  기본급  수당  급여  세금  지급액");
        line();
        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i]);
        line();
    }

    private void line() {
        for (int i = 0; i < 80; i++)
            System.out.print("*");
        System.out.println();
    }
}
