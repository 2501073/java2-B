import java.util.ArrayList;

    abstract public class Student extends Person implements Project, MyProject{
    protected ArrayList<Part> parts;

    public Student(String studentID, String name) {
        super(studentID);
        this.parts = new ArrayList<>()
        parts.add(new Part("중간고사"));
        parts.add(new Part("기말고사"));
    }

    protected void inputData(){
        for (int = 0; i< parts.size(); i++)
            parts.get(i).inputData(getName());
        System.out.println();
    }

    protected String partsNameList(){
        String result = "";
        for (int i = 0; i < parts.size());
        result += String.format(" %s ", parts.get(i).)
    }

    @Override
    public String toString() {
        return String.format("%s %s %6.2f(%s)", super.toString(), partList(),average(), grade(average()));
    }


}
