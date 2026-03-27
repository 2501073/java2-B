//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee("홍길동", "1234", new Date(1999, 3, 26),'1', '3'),
                new Employee("일동", "1234", new Date(1999, 3, 26),'2', '3'),
                new Employee("이동", "1234", new Date(1999, 3, 26),'3', '3'),
                new Employee("삼동", "1234", new Date(1999, 3, 26),'4', '3'),
                new Employee("사동", "1234", new Date(1999, 3, 26),'5', '3'),
                new Employee("오동", "1234", new Date(1999, 3, 26),'1', '3'),
                new Employee("육동", "1234", new Date(1999, 3, 26),'2', '3'),
                new Employee("칠동", "1234", new Date(1999, 3, 26),'3', '3'),
                new Employee("팔동", "1234", new Date(1999, 3, 26),'4', '3'),
                new Employee("구동", "1234", new Date(1999, 3, 26),'5', '3')};
        Company company = new Company(employees);
        company.inputData();
        company.display();
    }
}