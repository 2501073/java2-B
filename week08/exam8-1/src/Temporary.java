public class Temporary extends Employee{
    private int dailyPay;
    private int workingDays;

    public Temporary(String id, String name, String birth, int dailyPay, int days) {
        super(id, name, birth);
        this.dailyPay = dailyPay;
        this.workingDays = days;
    }

    @Override
    public long calculateBaseSalary() {
        return (long) dailyPay * workingDays;
    }

    @Override
    public long calculateBonus() { return 0; }

    @Override
    public String getJobTitle() { return "일당제"; }
}
