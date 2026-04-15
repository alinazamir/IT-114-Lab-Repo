public class SavingsAccount extends BankAccount {
    
    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();

        if (amount > currentBalance) {
            System.out.println("Transaction Denied: Insufficient funds");
        
        } else {
            currentBalance -= amount;
            setBalance(currentBalance);
        }

        System.out.println("New Balance: $" + getBalance());
    }


}
