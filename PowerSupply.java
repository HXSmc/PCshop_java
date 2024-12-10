
public class PowerSupply implements Component{
     private String brand;
    private int wattage;
    private int id;
    private boolean modular;
    private double price;

    public PowerSupply(String brand, int wattage, boolean modular, double price,int id) {
        this.brand = brand;
        this.wattage = wattage;
        this.modular = modular;
        this.price = price;
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getWattage() {
        return wattage;
    }

    public boolean isModular() {
        return modular;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PowerSupply{" +
                "brand='" + brand + '\'' +
                ", wattage=" + wattage +
                ", modular=" + modular +
                ", price=" + price +
                '}';
    }
}
