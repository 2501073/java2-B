import java.time.LocalDate;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2000, 6, 11);
        Student student = new Student("홍길동", 2501073, "소프트웨어융합과", birthday);

        System.out.println(student);

    }
}