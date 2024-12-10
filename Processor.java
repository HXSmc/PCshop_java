

public class Processor implements Component{
     private String brand;
    private String model;
    private int id;
    private int coreCount;
    private String socketType;
    private double price;

    public Processor(String brand, String model, int coreCount, String socketType, double price,int id) {
        this.brand = brand;
        this.model = model;
        this.coreCount = coreCount;
        this.socketType = socketType;
        this.price = price;
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public String getSocketType() {
        return socketType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", coreCount=" + coreCount +
                ", socketType='" + socketType + '\'' +
                ", price=" + price +
                '}';
    }
}
