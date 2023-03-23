public class BankAccount {

    private String accountNumber;

    private double accountBalance = 0;

    private String customerName;

    private String email;

    private String phoneNumber;

    private String getAccountNumber() {
        return accountNumber;
    }

    private void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    private double getAccountBalance() {
        return accountBalance;
    }

    private void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    private String getCustomerName() {
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
