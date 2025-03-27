import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ComputerStore store = new ComputerStore();


        // PRODUCTS String name, double price, int quantity, int id
        Product product1 = new Product("dell laptop", "Laptops",3000.00,10,1);
        Product product2 = new Product("samsung", "Laptops",5000.00,10,2);
        Product product3 = new Product("iphone", "iphones",300.00,10,3);
        Product product4 = new Product("windows computer", "Computers",3500.00,10,4);
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);

        // Customers int id, String firstName, String lastName, String email, Boolean isLoyalCustomer
        Customer customer1 = new Customer("1","andrew","Nowak","email@email.com",true);
        Customer customer2 = new Customer("2","daniel","danielowski","email2@email.com",false);

        // creating an order, with products and quantities
        List<Product> products = new ArrayList<>();
        List<Integer> quantitys = new ArrayList<>();
        //order1
        products.add(product1);
        quantitys.add(3);
        products.add(product2);
        quantitys.add(5);
        store.createOrder(customer1,products,quantitys);

        //second order
        products = new ArrayList<>();
        quantitys = new ArrayList<>();
        products.add(product3);
        quantitys.add(2);
        products.add(product4);
        quantitys.add(1);
        store.createOrder(customer2,products,quantitys);

        // order3, back to customer1
        products = new ArrayList<>();
        quantitys = new ArrayList<>();
        products.add(product3);
        quantitys.add(1);
        products.add(product4);
        quantitys.add(2);
        store.createOrder(customer1,products,quantitys);

        // changing an order status
        store.changeOrderStatus(store.getOrders().get(0).getOrderID());

        // displaying info
        System.out.println();
        store.displayCustomerOrders("1");
        System.out.println();
        store.displayCustomerOrders("2");
        System.out.println();
        store.displayProductsInCategory("Laptops");
        System.out.println();
        product3.displayInfo();
        System.out.println();
        customer1.customerInfo();
        System.out.println();



    }
}
