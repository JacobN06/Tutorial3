public class Main {
    public static void main(String[] args) {
        ComputerStore store = new ComputerStore();


        // PRODUCTS String name, double price, int quantity, int id
        Product product1 = new Product("dell laptop", "Laptops",3000.00,10,1);
        Product product2 = new Product("iphone", "iphones",300.00,10,2);
        Product product3 = new Product("windows computer", "Computers",3500.00,10,3);

        // Customers int id, String firstName, String lastName, String email, Boolean isLoyalCustomer
        Customer customer1 = new Customer(1,"andrew","Nowak","email@email.com",true);
    }
}