public class Manager extends Regular{
    public Manager(String id, String name, String birth, int grade, int step) {
        super(id, name, birth, grade, step);
    }

    @Override
    public long calculateBonus() {
        long base = calculateBaseSalary();
        double rate;
        if (base <= 1800000) rate = 0.06;
        else if (base <= 2400000) rate = 0.05;
        else rate = 0.04;
        return (long) (base * rate);
    }

    @Override
    public String getJobTitle() { return "점장직"; }
}
