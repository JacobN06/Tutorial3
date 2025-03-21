public class Order {
    private int orderID;
    private Customer customer;
    private product [] products;
    private int [] quantitys;
    private String orderDate;
    private String status;

    public Order(int orderID, Customer customer, product [] products, String orderDate, String status) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = products;
        this.orderDate = orderDate;
        this.status = status;
    }

    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public product[] getProducts() {
        return products;
    }
    public void setProducts(product[] products) {
        this.products = products;
    }
    public int[] getQuantitys() {
        return quantitys;
    }
    public void setQuantitys(int[] quantitys) {
        this.quantitys = quantitys;
    }
    public String getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    public String getStatus() {
        return status;
    }
}
