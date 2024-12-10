
public class PCBuilder {
private Motherboard motherboard;
    private Processor processor;
    private RAM ram;
    private Storage storage;
    private GPU gpu;
    private PowerSupply powerSupply;
    private Case pcCase;
    private double totalPrice;

    public PCBuilder(Motherboard motherboard, Processor processor, RAM ram, Storage storage, GPU gpu, PowerSupply powerSupply, Case pcCase) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.powerSupply = powerSupply;
        this.pcCase = pcCase;
        calculateTotalPrice();
    }

    public boolean canBuild() {
        boolean canBuild = true;
        for(int i = 0; i < Administrator.viewComponents().size(); i++){
            if(motherboard != Administrator.viewComponents().get(i)){
                canBuild = false;
            }else{
                canBuild = true;
                break;
            }
        }
        for(int i = 0; i < Administrator.viewComponents().size(); i++){
            if(processor != Administrator.viewComponents().get(i)){
                canBuild = false;
            }else{
                canBuild = true;
                break;
            }
        }
        for(int i = 0; i < Administrator.viewComponents().size(); i++){
            if(ram != Administrator.viewComponents().get(i)){
                canBuild = false;
            }else{
                canBuild = true;
                break;
            }
        }
        for(int i = 0; i < Administrator.viewComponents().size(); i++){
            if(storage != Administrator.viewComponents().get(i)){
                canBuild = false;
            }else{
                canBuild = true;
                break;
            }
        }
        for(int i = 0; i < Administrator.viewComponents().size(); i++){
            if(gpu != Administrator.viewComponents().get(i)){
                canBuild = false;
            }else{
                canBuild = true;
                break;
            }
        }
        for(int i = 0; i < Administrator.viewComponents().size(); i++){
            if(pcCase != Administrator.viewComponents().get(i)){
                canBuild = false;
            }else{
                canBuild = true;
                break;
            }
        }
        for(int i = 0; i < Administrator.viewComponents().size(); i++){
            if(powerSupply != Administrator.viewComponents().get(i)){
                canBuild = false;
            }else{
                canBuild = true;
                break;
            }
        }
        return canBuild;
        
    }

    public void calculateTotalPrice() {
        this.totalPrice = motherboard.getPrice() + processor.getPrice() + ram.getPrice() +
                storage.getPrice() + gpu.getPrice() + powerSupply.getPrice() + pcCase.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "PCBuilder{" +
                "totalPrice=" + totalPrice +
                ", canBuild=" + canBuild() +
                '}';
    }
    
}
