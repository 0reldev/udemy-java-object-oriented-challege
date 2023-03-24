public class BankAccount {

    private String number;
    private double balance = 0;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        phoneNumber = phone;
    }

    private String getNumber() {
        return number;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    private double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    private void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private String getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        balance += amount;
        System.out.println(amount + " have been deposited in the account.");
    }

    public void withdrawFunds(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println(amount + " have been withdrawn from the account.");
        } else {
            System.out.println("There is not enough money on the account. Cash can't be withdrawn.");
        }
    }

    public void checkAccount() {
        System.out.println("There is " + balance + " in the account.");
    }
}
