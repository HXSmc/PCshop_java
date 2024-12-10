

public class RAM implements Component{
     private String brand;
    private int capacity;
    private double price;
    private int id;

    public RAM(String brand, int capacity, double price,int id) {
        this.brand = brand;
        this.capacity = capacity;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                "GB, price=" + price +
                '}';
    }
}
