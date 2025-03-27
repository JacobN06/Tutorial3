public class Product {
    private String productName;
    private String category;
    private int id;
    private double price;
    private int quantityInStock;

    public Product(String newName, String newCategory, double newPrice, int newQuantityInStock, int newId) {
        productName = newName;
        category = newCategory;
        price = newPrice;
        quantityInStock = newQuantityInStock;
        id = newId;
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
    public int getQuantityInStock() {
        return quantityInStock;
    }
    public void setQuantityInStock(int newQuantity) {
        this.quantityInStock = newQuantity;
    }

    public String displayInfo() {
        System.out.println("Product Name: " + productName + " ID: " + id + " Price: " + price + " Quantity: " + quantityInStock);
        return "Product Name: " + productName + " ID: " + id + " Price: " + price + " Quantity: " + quantityInStock;
    }

}
