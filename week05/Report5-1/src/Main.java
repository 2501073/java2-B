//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[] {
                new Customer("12345", "정상진", 7898),
                new Customer("92345", "일본인", 2345),
                new Customer("12345", "홍길동", 1234),
                new Customer("12345", "한국인", 789),
                new Customer("12345", "고길동", 678),
                new Customer("12345", "이대한", 563),
                new Customer("92345", "이기동", 567),
                new Customer("92345", "박종호", 563),
                new Customer("12345", "이니나", 456),
                new Customer("12345", "윤상열", 345)
        };

        ElectricOffice office = new ElectricOffice(customers);
        office.inputData();
        office.display();
    }
}