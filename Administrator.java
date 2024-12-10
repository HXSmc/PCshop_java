import java.util.ArrayList;
public class Administrator extends Customer {
    private static ArrayList<Component> components = new ArrayList<Component>();
    
    public Administrator(int customerId, String username, String password){
        super(customerId, username, password);
    }

    public static void addComponent(Component component){
        components.add(component);
    }

    public static ArrayList<Component> viewComponents(){
        return components;
    }

    public static void removeComponent(Component component){
        for(int i=0; i<components.size(); i++){
            if(components.get(i) == component){
                components.remove(i);
            }
        }
    }
}
