public class Classroom {
    private Teacher teacher;
    private Student student;

    public Classroom(Teacher teacher, Student student) {
        this.teacher = teacher;
        this.student = student;
    }

    public void startClass(Book book) {
        teacher.teach();
        student.study(book);
    }

    public void closeClass() {
        teacher.close();
    }
}
