public class Classroom {
    private Student[] students;

    public Classroom(Student[] students) {
        this.students = students;
    }

    protected void inputData() {
        for (int i = 0; i < students.length; i++) {
            students[i].inputData();
            System.out.println();
        }
    }

    protected void display(int type) {
        if (type == 1) {
            System.out.println("\t\t\t\t 고등학교 성적표");
            line(50);
            System.out.printf("    학번 이름  %s  총점  성적 등수\n", students[0] partsNameList());
            line(50);
            for (int i = 0; i < students.length; i++)
                System.out.println(students[i]);
        } else {
            System.out.println("\t\t\t\t 대학교 성적표");
            line(80);
            System.out.printf("    학번 이름  %s   성적 등수\n", students[0] partsNameList());
            line(80);
            for (int i = 0; i < students.length; i++)
                System.out.println(students[i]);
        }
    }

    private void line(int i) {
        for (int i = 0; i < count; i++)
            System.out.print("*");
    }
}
