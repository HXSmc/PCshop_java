

public class Order extends Customer {
    private static int orderId;
    private int numberOfPCs;
    private double totalAmount;
    private String status;
    

    public Order(int customerId, String username, String password, int numberOfPCs,
                 double totalAmount, String status) {
        super(customerId, username, password);
        orderId++;
        this.numberOfPCs = numberOfPCs;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getNumberOfPCs() {
        return numberOfPCs;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
