


public class GPU implements Component{
     private String Brand;
    private int memory;
    private int id;
    private double price;

    public GPU(String Brand, int memory, double price,int id) {
        this.Brand = Brand;
        this.memory = memory;
        this.price = price;
        this.id = id;
    }


    public int getId(){
        return id;
    }
    public String getBrand() {
        return Brand;
    }

    public int getMemory() {
        return memory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "GPU{" +
                "model='" + Brand + '\'' +
                ", memory=" + memory +
                "GB, price=" + price +
                '}';
    }
}
