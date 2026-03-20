public class Classroom {
    private Student student;
    private Teacher teacher;

    public Classroom(Student student, Teacher teacher) {
        this.student = student;
        this.teacher = teacher;
    }

    public void startClass(Book book) {
        teacher.teach();
        student.study(book);

    }
}
