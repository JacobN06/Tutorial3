public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean isLoyalCustomer;

    public Customer(String customerId,String firstName, String lastName, String email, Boolean isLoyalCustomer)  {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isLoyalCustomer = isLoyalCustomer;
    }
    public String getId() {
        return customerId;
    }
    public void setId(String id) {
        this.customerId = customerId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Boolean getIsLoyalCustomer() {
        return isLoyalCustomer;
    }
    public void setIsLoyalCustomer(Boolean isLoyalCustomer) {
        this.isLoyalCustomer = isLoyalCustomer;
    }
    // method for customer identifiction
    public String customerInfo() {
        System.out.println("Customer ID: " + customerId + " First Name: " + firstName + " Last Name: " + lastName + " Email: " + email + " isLoyalCustomer: " + isLoyalCustomer);
        return "Customer ID: " + customerId + " First Name: " + firstName + " Last Name: " + lastName + " Email: " + email + " isLoyalCustomer: " + isLoyalCustomer;


    };
}
