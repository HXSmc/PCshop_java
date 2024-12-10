import java.util.Scanner;
import java.util.ArrayList;

public class run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Administrator admin = new Administrator(0, "admin1", "securePassword123");
        int customerIdCounter = 0, componIdCounter = 1;
        Customer customer = null;
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Administrator.addComponent(new Motherboard("ASUS ROG STRIX", "LGA1151", "ATX", 64, 150.00,++componIdCounter));
        Administrator.addComponent(new Processor("Intel", "i7-9700K", 8, "LGA1151", 300.00,++componIdCounter));
        Administrator.addComponent(new RAM("Corsair", 16, 80.00,++componIdCounter));
        Administrator.addComponent(new Storage("Samsung", 1000, "SSD", 120.00,++componIdCounter));
        Administrator.addComponent(new GPU("NVIDIA GTX 1660", 6, 200.00,++componIdCounter));
        Administrator.addComponent(new PowerSupply("Cooler Master", 650, true, 90.00,++componIdCounter));
        Administrator.addComponent(new Case("NZXT", "H510", "ATX", 70.00,++componIdCounter));

        System.out.println("Welcome to PC Builder System!");

        while (true) {
            System.out.println("\n1. You are Customer");
            System.out.println("2. New Customer");
            System.out.println("3. You are Administrator");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int mainChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (mainChoice == 1) { // Existing Customer
                System.out.print("Username: ");
                String username = scanner.nextLine();
                for(Customer c : customers){
                    if(c.getUsername().equals(username)){
                        customer = c;
                    }
                }
                System.out.print("Password: ");
                String password = scanner.nextLine();

                if (customer != null && customer.Login(username, password)) {
                    while (true) {
                        System.out.println("\n1. Build PC");
                        System.out.println("2. Order History");
                        System.out.println("3. Exit");
                        System.out.print("Enter your choice: ");
                        int customerChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        if (customerChoice == 1) { // Build PC
                            Motherboard motherboard = (Motherboard) Administrator.viewComponents().get(0);
                            Processor processor = (Processor) Administrator.viewComponents().get(1);
                            RAM ram = (RAM) Administrator.viewComponents().get(2);
                            Storage storage = (Storage) Administrator.viewComponents().get(3);
                            GPU gpu = (GPU) Administrator.viewComponents().get(4);
                            PowerSupply powerSupply = (PowerSupply) Administrator.viewComponents().get(5);
                            Case pcCase = (Case) Administrator.viewComponents().get(6);
                            PCBuilder pcBuilder = new PCBuilder(motherboard, processor, ram, storage, gpu, powerSupply, pcCase);
                            System.out.println("Item: \n" + pcBuilder);
                            System.out.print("Total Price: $" + pcBuilder.getTotalPrice() + "\nDo you need it? (yes/no): ");
                            String needIt = scanner.nextLine();

                            if (needIt.equalsIgnoreCase("yes")) {
                                Order order = new Order(customer.getCustomerId(), customer.getUsername(), customer.getPassword(), 1, pcBuilder.getTotalPrice(), "Pending");
                                customer.addOrder(order);
                                System.out.println("Order added successfully!");

                                System.out.print("Do you need another PC? (yes/no): ");
                                String anotherPC = scanner.nextLine();
                                if (!anotherPC.equalsIgnoreCase("yes")) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else if (customerChoice == 2) { // Order History
                            System.out.println("Order History: ");
                            for (Order order : customer.viewOrderHistory()) {
                                System.out.println(order);
                            }
                        } else if (customerChoice == 3) {
                            break;
                        }
                    }
                } else {
                    System.out.println("Invalid credentials!");
                }
            } else if (mainChoice == 2) {
                System.out.print("Enter Username: ");
                String username = scanner.nextLine();
                System.out.print("Enter Password: ");
                String password = scanner.nextLine();
                customer = new Customer(++customerIdCounter, username, password);
                System.out.println("your customer ID is : " + customer.getCustomerId());
                customers.add(customer);
                customer = null;
                System.out.println("Customer created successfully!");
            } else if (mainChoice == 3) { // Administrator
                System.out.print("Username: ");
                String username = scanner.nextLine();
                System.out.print("Password: ");
                String password = scanner.nextLine();

                if (admin.Login(username, password)) {
                    while (true) {
                        System.out.println("\n1. Add Component");
                        System.out.println("2. Remove Component");
                        System.out.println("3. View Components");
                        System.out.println("4. Exit");
                        System.out.print("Enter your choice: ");
                        int adminChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        if (adminChoice == 1) { // Add Component
                            System.out.println("Adding a component (example: Motherboard)..."); 
                            Motherboard motherboard = new Motherboard("ASUS ROG STRIX", "LGA1151", "ATX", 64, 150.00,++componIdCounter);
                            Administrator.addComponent(motherboard);
                            System.out.println("Component added successfully!");
                        } else if (adminChoice == 2) { // Remove Component
                            System.out.println("Enter Component Id");
                            // For simplicity, removing the previously added motherboard
                            Administrator.removeComponent(Administrator.viewComponents().get(0));
                            System.out.println("Component removed successfully!");
                        } else if (adminChoice == 3) { // View Components
                            System.out.println("Components: ");
                            for (Object component : Administrator.viewComponents()) {
                                System.out.println(component);
                            }
                        } else if (adminChoice == 4) {
                            break;
                        }
                    }
                } else {
                    System.out.println("Invalid credentials!");
                }
            } else if (mainChoice == 4) { // Exit
                System.out.println("Exiting the system. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }
}
