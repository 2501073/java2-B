public abstract class Employee {
    protected String employeeID;
    protected String name;
    protected String birthday;

    public Employee(String employeeID, String name, String birthday) {
        this.employeeID = employeeID;
        this.name = name;
        this.birthday = birthday;
    }

    public abstract long calculateBaseSalary();
    public abstract long calculateBonus();
    public abstract String getJobTitle();

    public long getTotalPay() {
        return calculateBaseSalary() + calculateBonus();
    }

    public long calculateTax() {
        long totalPay = getTotalPay();
        double taxRate;

        if (this instanceof Temporary) {
            taxRate = 0.066;
        } else {
            if (totalPay <= 2000000) taxRate = 0.066;
            else if (totalPay <= 4000000) taxRate = 0.073;
            else taxRate = 0.085;
        }
        return (long) (totalPay * taxRate);
    }

    public long getNetPay() {
        return getTotalPay() - calculateTax();
    }
}

