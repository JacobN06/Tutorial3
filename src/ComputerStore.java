import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ComputerStore {
    private List<Product> productsInStore;
    private List<Customer> customers;
    private List <Order> orders;
    private int productCount;
    private int customerCount;
    private int orderCount;

    public ComputerStore() {
        this.productsInStore = new ArrayList<Product>();
        this.customers = new ArrayList<Customer>();
        this.orders = new ArrayList<Order>();
        productCount = 0;
        customerCount = 0;
        orderCount = 0;
    }
    public List<Order> getOrders() {
        return orders;
    }

    public void addProduct(Product product) {
        this.productsInStore.add(product);
        productCount++;
    }
    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }
    public void createOrder(Customer customer,List <Product> products,List<Integer> quantitys) {
        orderCount++;
        if (!customers.contains(customer)) {
            customers.add(customer);
            customerCount++;
        }
        else{
            customer.setIsLoyalCustomer(true);
        }
        Order order = new Order(customer.getId(),customer,products,quantitys,LocalDateTime.now().toString(),"In Progress", customer.getIsLoyalCustomer());
        updateProductsAfterOrder(order);
        orders.add(order);
        orderCount++;
        System.out.println("Order created");
    }
    public boolean updateProductsAfterOrder(Order order) {
        boolean result = true;
        int counter = 0;
        for(Product product : order.getProducts()) {
            int id = product.getId();
            for (Product productInStore : productsInStore) {
                if (productInStore.getId() == id) {
                    if (productInStore.getQuantityInStock() - order.getQuantitys().get(counter) <= -1) {
                        System.out.println("Not enough products in stock");
                        result = false;
                        break;
                    }
                    productInStore.setQuantityInStock(productInStore.getQuantityInStock() - order.getQuantitys().get(counter));
                    counter++;
                }
            }
        }
        return result;

    }
    public void changeOrderStatus(String orderID) {
        for (Order order : orders) {
            if(order.getOrderID() == orderID) {
                order.setStatus("complete");
            }
        }
    }
    public void displayProductsInCategory(String category) {
        System.out.println("Products in Category " + category);
        for (Product product : productsInStore) {
            if (product.getCategory().equals(category)) {
                product.displayInfo();
            }
        }
    }
    public void displayCustomerOrders(String customerID) {
        System.out.println("Customers Order " + customerID);
        for (Order order : orders) {
            if(customerID == order.getCustomer().getId()){
                order.displayOrderInfo();
            }
        }
    }

}
