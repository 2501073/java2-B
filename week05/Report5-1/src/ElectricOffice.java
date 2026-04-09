public class ElectricOffice {
    private Customer[] customers;

    public ElectricOffice(Customer[] customers) {
        this.customers = customers;
    }

    public void inputData() {
        for (Customer c : customers) {
            double totalUsageFee = 1660; // 기본 요금
            int calcUsage = c.usage;

            if (c.isSupport) {
                calcUsage = Math.max(0, c.usage - 100);
            }

            if (calcUsage <= 100) {
                totalUsageFee += calcUsage * 184.1;
            } else if (calcUsage <= 200) {
                totalUsageFee += (100 * 184.1) + (calcUsage - 100) * 223.8;
            } else if (calcUsage <= 300) {
                totalUsageFee += (100 * 184.1) + (100 * 223.8) + (calcUsage - 200) * 278.3;
            } else if (calcUsage <= 400) {
                totalUsageFee += (100 * 184.1) + (100 * 223.8) + (100 * 278.3) + (calcUsage - 300) * 353.6;
            } else if (calcUsage <= 500) {
                totalUsageFee += (100 * 184.1) + (100 * 223.8) + (100 * 278.3) + (100 * 353.6) + (calcUsage - 400) * 466.4;
            } else {
                totalUsageFee += (100 * 184.1) + (100 * 223.8) + (100 * 278.3) + (100 * 353.6) + (100 * 466.4) + (calcUsage - 500) * 643.9;
            }

            c.usageFee = (int) totalUsageFee;
            c.tax = (int) (c.usageFee * 0.07); // 세금 7%
            c.totalAmount = c.usageFee + c.tax;
        }
    }

    public void display() {
        for (int i = 0; i < customers.length - 1; i++) {
            for (int j = 0; j < customers.length - 1 - i; j++) {
                if (customers[j].totalAmount < customers[j + 1].totalAmount) {
                    Customer temp = customers[j];
                    customers[j] = customers[j + 1];
                    customers[j + 1] = temp;
                }
            }
        }

        System.out.println("*******************************************************************************");
        System.out.println("  번호     이름    사용량      사용요금      세금      납부금액      기타");
        System.out.println("*******************************************************************************");

        for (Customer c : customers) {
            String remark = c.isSupport ? "지원가구" : "";
            System.out.printf("%-8s %-5s %6dKw %,12d원 %,10d원 %,12d원  %s\n",
                    c.getId(),
                    c.getName(),
                    c.getUsage(),
                    c.getUsageFee(),
                    c.getTax(),
                    c.getTotalAmount(),
                    remark);
        }
        System.out.println("*******************************************************************************");
    }
}
