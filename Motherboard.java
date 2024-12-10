


public class Motherboard implements Component{
    private String Brand;
    private String socketType;
    private int id;
    private String formFactor;
    private int maxMemory;
    private double price;

    public Motherboard(String Brand, String socketType, String formFactor, int maxMemory, double price,int id) {
        this.Brand = Brand;
        this.socketType = socketType;
        this.formFactor = formFactor;
        this.maxMemory = maxMemory;
        this.price = price;
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getBrand() {
        return Brand;
    }

    public String getSocketType() {
        return socketType;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public int getMaxMemory() {
        return maxMemory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "model='" + Brand + '\'' +
                ", socketType='" + socketType + '\'' +
                ", formFactor='" + formFactor + '\'' +
                ", maxMemory=" + maxMemory +
                ", price=" + price +
                '}';
    }
}
