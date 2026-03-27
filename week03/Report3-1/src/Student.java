import jdk.jfr.Period;

import java.time.LocalDate;
import java.util.Date;

public class Student {
    private String name;
    private int rollno;
    private String depart;
    private LocalDate birthday;

    public Student(String name, int rollno, String depart, LocalDate birthday) {
        this.name = name;
        this.rollno = rollno;
        this.depart = depart;
        this.birthday = birthday;
    }

    public int getAge() {
        int current = LocalDate.now().getYear();
        return current = current;

    }

    @Override
    public String toString() {
        return String.format("이름: %s" +
                "\t 학번: %d" +
                "\t 학과: %s" +
                "\t 생년월일: %s" +
                "\t 나이: %d", name, rollno, depart, birthday, getAge());
    }
}
