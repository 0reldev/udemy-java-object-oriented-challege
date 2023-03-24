public class Customer {

    private String name;

    private double creditLimit;

    private String emailAddress;

    public Customer() {
        this("Default Name", 100.00, "defaultadresse@test.com");
    }

    public Customer(String name, String emailAddress) {
        this(name, 100.00, emailAddress);
    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void printInformation() {
        System.out.println("Customer " + name + ", address: " +  emailAddress + ", credit limit: €" + creditLimit + ".");
    }
}
