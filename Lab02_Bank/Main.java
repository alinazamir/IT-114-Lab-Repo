import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        System.out.println("Please enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter initial deposit: ");
        double deposit = scanner.nextDouble();

        System.out.println("Choose Account:");
        System.out.println("1. Checking");
        System.out.println("2. Savings");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();


        if (choice == 1) {
            account = new CheckingAccount(name, deposit);
        } 
        else if (choice == 2) {
            account = new SavingsAccount(name, deposit);
        } 
        else {
            System.out.println("Invalid choice. Exiting.");
            return;
        }

        int menuChoice = 0;

        while (menuChoice != 4) {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1: 
                    System.out.print("Amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                
                case 2:
                    System.out.print("Amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current Balance: $" + account.getBalance());
                    break;

                case 4:
                    System.out.println("Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");

            }
        }

        scanner.close();
    }
}
