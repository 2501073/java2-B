public class Contract extends Employee{
    public Contract(String id, String name, String birth) {
        super(id, name, birth);
    }

    @Override
    public long calculateBaseSalary() { return 2000000; }

    @Override
    public long calculateBonus() { return 0; }

    @Override
    public String getJobTitle() { return "계약직"; }


}
