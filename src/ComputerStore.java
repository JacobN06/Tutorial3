public class ComputerStore {
    private Product []  products;
    private Customer[] customers;
    private Order[] orders;
    private int productCount;
    private int customerCount;
    private int orderCount;

    public ComputerStore() {
        products = new Product[10];
        customers = new Customer[10];
        orders = new Order[10];
        productCount = 0;
        customerCount = 0;
        orderCount = 0;
    }
    public Product getProduct(int id) {
        return products[id];
    }
    public Customer getCustomer(int id) {
        return customers[id];
    }
    public Order getOrder(int id) {
        return orders[id];
    }
    public int getProductCount() {
        return productCount;
    }
    public int getCustomerCount() {
        return customerCount;
    }
    public int getOrderCount() {
        return orderCount;
    }
}
