public class Product {
    private String productName;
    private String category;
    private int id;
    private double price;
    private int quantity;

    public Product(String name, String category, double price, int quantity, int id) {
        this.productName = name;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String displayInfo() {
        System.out.println("Product Name: " + productName + " ID: " + id + " Price: " + price + " Quantity: " + quantity);
        return "Product Name: " + productName + " ID: " + id + " Price: " + price + " Quantity: " + quantity;
    }
}
