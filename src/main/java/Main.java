public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println(account.getCustomerName());
        account.depositFunds(5);
        account.depositFunds(10);
        account.checkAccount();
        account.withdrawFunds(7);
        account.checkAccount();
        account.withdrawFunds(20);
        account.checkAccount();
        account.withdrawFunds(50);
        account.checkAccount();

        BankAccount timsAccount = new BankAccount("Tim", "tim@test.fd", "0030600");
        System.out.println("Account No: " + timsAccount.getNumber() + ", name: " + timsAccount.getCustomerName());

    }
}
