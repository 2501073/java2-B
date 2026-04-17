import java.util.Scanner;

public class Setting implements MyProject{

    protected int selectType() {
        Scanner keyboard = new Scanner(System.in);
        int type = 0;
        while (true) {
            System.out.print("타입 입력:\n" + "1 = 고등학교, 2 = 대학교");
            type = keyboard.nextInt();
            if (isValid2(type))
                break;
            else
                error("타입오류(1 or 2)");
        }
        return type;
    }

    protected Student[] prepare(int type, Person[] persons) {
        Student[] students = new Student[];
        if (type == 1) {
            for (int i = 0; i < persons.length; i++)
                students = new HighSchool(persons[i].getStudentID(), persons[i].getName());
        } else {
            for (int i = 0; i < persons.length; i++)
                students = new HighSchool(persons[i].getStudentID(), persons[i].getName());
        }
    }
}
