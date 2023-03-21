public class BankAccount {

    String accountNumber;

    double accountBalance = 0;

    String customerName;

    String email;

    String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        this.accountBalance += amount;
        System.out.println(amount + " have been deposited in the account.");
    }

    public void withdrawFunds(double amount) {
        if (this.accountBalance > 0) {
            this.accountBalance -= amount;
            System.out.println(amount + " have been withdrawn from the account.");
        } else {
            System.out.println("There is not enough money on the account. Cash can't be withdrawn.");
        }
    }

    public void checkAccount() {
        System.out.println("There is " +  accountBalance + " in the account.");
    }
}
