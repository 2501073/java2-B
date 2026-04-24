public class Regular extends Employee{
    protected int grade;
    protected int step;

    protected static final int[][] SALARY_TABLE = {
            {2600, 2800, 3100, 3400, 3800},
            {2650, 2860, 3170, 3480, 3890},
            {2700, 2920, 3240, 3560, 3980},
            {2750, 2980, 3310, 3640, 4070},
            {2800, 3040, 3380, 3720, 4160}
    };

    public Regular(String id, String name, String birth, int grade, int step) {
        super(id, name, birth);
        this.grade = grade;
        this.step = step;
    }

    @Override
    public long calculateBaseSalary() {
        return (long) SALARY_TABLE[step - 1][grade - 1] * 1000;
    }

    @Override
    public long calculateBonus() { return 0; }

    @Override
    public String getJobTitle() { return "정규직"; }
}
