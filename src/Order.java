import java.util.List;
import java.util.UUID;

public class Order {
    private String orderID;
    private String customerId;
    private Customer customer;
    private List<Product> products;
    private List<Integer> quantitys;
    private String orderDate;
    private String status;
    private boolean isLoyalCustomer;
    int total = 0;

    public Order(String customerId, Customer customer, List<Product> products,List<Integer> quantitys, String orderDate,String status,boolean isLoyalCustomer) {
        orderID = customerId + UUID.randomUUID().toString();
        this.customerId = customerId;
        this.customer = customer;
        this.products = products;
        this.quantitys = quantitys;
        this.orderDate = orderDate;
        this.status = status;
        this.isLoyalCustomer = isLoyalCustomer;
    }

    public String getOrderID() {
        return orderID;
    }
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer newCustomer) {
        this.customer = newCustomer;
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> newProducts) {
        this.products = newProducts;
    }
    public List<Integer> getQuantitys() {
        return quantitys;
    }
    public void setQuantitys(List<Integer> newQuantitys) {
        this.quantitys = newQuantitys;
    }
    public String getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(String newOrderDate) {
        this.orderDate = newOrderDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String newstatus) {
        this.status = newstatus;
    }
    public boolean isLoyalCustomer() {
        return isLoyalCustomer;
    }
    public void setLoyalCustomer(boolean loyalCustomer) {
        isLoyalCustomer = loyalCustomer;
    }

    public int calculateTotalValue(){
        int total = 0;
        for (int i = 0; i < products.size(); i++) {
            total += products.get(i).getPrice() * quantitys.get(i);
        }
        if(customer.getIsLoyalCustomer()){
                int discountAmount = total % 10;
                total -= discountAmount;
        }
            return total;

    }
    public int applyDiscount(){
        if(customer.getIsLoyalCustomer()){
            int discountAmount = calculateTotalValue() % 10;
            total -= discountAmount;
        }
        return total;
    }
    public void displayOrderInfo(){
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer.getFirstName());
        System.out.println("Products: ");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).getProductName());
            System.out.print(" amount: " + quantitys.get(i));
            System.out.println();
        }

        System.out.println("Total cost (with loyalty discount if available): " + calculateTotalValue());


        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + status);
        System.out.println();
    }
}
