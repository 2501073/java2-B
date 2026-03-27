import java.util.ArrayList;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Department[] departments = new Department[]{
                new Department('0', ""),
                new Department('1', "인사팀"),
                new Department('2', "재무팀"),
                new Department('3', "영업팀"),
                new Department('4', "개발팀"),
                new Department('5', "생산팀")
    }

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("홍길동", "1234", new Date(2000, 3, 26), departments[1],grade[1]);
}