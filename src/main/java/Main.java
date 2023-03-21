public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.depositFunds(5);
        account.depositFunds(10);
        account.checkAccount();
        account.withdrawFunds(7);
        account.checkAccount();
        account.withdrawFunds(20);
        account.checkAccount();
        account.withdrawFunds(50);
        account.checkAccount();
    }
}
