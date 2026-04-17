import java.util.Scanner;

    public class Part implements MyProject{
    private String partName;
    private int score;

    public Part(String partName) {
        this.partName = partName;
        this.score = 0;
    }



    protected void inputData(String name) {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님 %s 성적 입력:", name, partName);
            score = keyboard.nextInt();
            if (partName.equals("출석")) {
                if (isValid(score))
                    break;
            } else {
                if (isValid(score))
                    break;
                else {
                    error("성적 입력 오류(0 ~ 100점");
                    System.in.read();
                }
            }
        }
    }
}

    public int getScore() {
        return getScore();
    }

    public String getPartName() {
        return getPartName();
    }

