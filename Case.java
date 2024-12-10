



public class Case implements Component{
     private String brand;
    private String model;
    private int id;
    private String formFactor;
    private double price;

    public Case(String brand, String model, String formFactor, double price,int id) {
        this.brand = brand;
        this.model = model;
        this.formFactor = formFactor;
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

    public String getFormFactor() {
        return formFactor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Case{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", formFactor='" + formFactor + '\'' +
                ", price=" + price +
                '}';
    }
}
