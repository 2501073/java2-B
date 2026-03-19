//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Android", "김철수");
        Book book1 = new Book("Bible", "작자미상");


        System.out.println(book);
        System.out.println(book1);
    }
}