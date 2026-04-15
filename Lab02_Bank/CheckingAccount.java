public class CheckingAccount extends BankAccount {

    private static final double OVERDRAFT_FEE = 35.00;

    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();

        if (amount > currentBalance) {
            System.out.println("Overdraft! $35.00 fee");

            currentBalance -= amount;
            currentBalance -= OVERDRAFT_FEE;

            setBalance(currentBalance);
        }
        else {
            currentBalance -= amount;
            setBalance(currentBalance);
        }

        System.out.println("New Balance: $" + getBalance());
    }

}
