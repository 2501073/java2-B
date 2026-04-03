import java.util.Scanner;

public class Customer extends Person {
    private String waterNo;
    protected Type type;
    protected float usage;
    private final int BASIC;

    public Customer(String name, String waterNo) {
        super(name);
        this.waterNo = waterNo;
        this.type = type;
        this.usage = 0.0f;
        this.BASIC = 1200;
    }

    @Override
    public String toString() {
        return String.format(" %4s %3s %3s %6.2f\u33A5 %,8d원 %,6d원 %,8d원 %s",
                waterNo, super.toString(), type.typeName, usage, fee(), tax(), charge(), type.typeName.equals("군기관") == '5' ? "일괄징수" : "");
    }

    protected void inputUsage() {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("[%s] %s 님 수도 사용량 입력:", type.typeName, super.name);
            usage = keyboard.nextFloat();
            if (usage >= 0.0f && usage <= 999.9f) {
                break;
            } else {
                System.err.print("error");
            }
        }
    }

    protected int charge() {
        return BASIC + fee() + tax();
    }

    protected int tax() {
        int result = 0;
        int temp = BASIC + fee();

        result = (int) (temp * (type.taxRate / 100));
    }


    protected int fee() {
        int result = 0;
        int temp = (int) (usage + 0.5f);
                result = temp * type.unitPrice;
        }
    }





