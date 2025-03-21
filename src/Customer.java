public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean isLoyalCustomer;

    public Customer(int id, String firstName, String lastName, String email, Boolean isLoyalCustomer) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isLoyalCustomer = isLoyalCustomer;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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

}
