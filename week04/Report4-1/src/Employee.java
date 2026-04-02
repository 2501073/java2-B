public class Employee {
    private String id;
    private String name;
    private int partCode;
    private boolean special;
    private int grade;
    private int classNo;
    private int aid;

    public Employee(String id, String name, int partCode, boolean special, int grade, int classNo, int aid) {
        this.id = id;
        this.name = name;
        this.partCode = partCode;
        this.special = special;
        this.grade = grade;
        this.classNo = classNo;
        this.aid = aid;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getPartCode() { return partCode; }
    public boolean isSpecial() { return special; }
    public int getGrade() { return grade; }
    public int getClassNo() { return classNo; }
    public int getAid() { return aid; }
}
