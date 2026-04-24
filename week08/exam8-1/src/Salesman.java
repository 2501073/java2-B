public class Salesman extends Regular{
    private long salesAmount;
    private double commissionRate;

    public Salesman(String id, String name, String birth, int grade, int step, long sales, double rate) {
        super(id, name, birth, grade, step);
        this.salesAmount = sales;
        this.commissionRate = Math.min(rate, 5.0);
    }

    @Override
    public long calculateBonus() {
        return (long) (salesAmount * (commissionRate / 100.0));
    }

    @Override
    public String getJobTitle() { return "영업직"; }

    public long getSalesAmount() { return salesAmount; }
    public double getCommissionRate() { return commissionRate; }
}
