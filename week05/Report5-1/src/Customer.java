public class Customer {
    private String id;
    protected String name;
    protected int usage;
    protected int usageFee;
    protected int tax;
    protected int totalAmount;
    protected boolean isSupport;

    public Customer(String id, String name, int usage) {
        this.id = id;
        this.name = name;
        this.usage = usage;
        this.isSupport = id.startsWith("9");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getUsage() {
        return usage;
    }

    public int getUsageFee() {
        return usageFee;
    }

    public int getTax() {
        return tax;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public boolean isSupport() {
        return isSupport;
    }
}
