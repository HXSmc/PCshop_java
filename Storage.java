
public class Storage implements Component{
     private String brand;
    private int capacity;
    private int id;
    private String type;
    private double price;

    public Storage(String brand, int capacity, String type, double price,int id) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }
    public int getId(){
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                "GB, type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
