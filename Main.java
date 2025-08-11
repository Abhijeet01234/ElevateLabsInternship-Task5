import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Creating the account
        System.out.println("\n=== Account Creation ===");
        System.out.print("\nEnter account holder name: ");
        String name = scanner.nextLine();
        System.out.print("Enter initial deposit: Rs. ");
        double initialBalance = scanner.nextDouble();
        Account account = new Account(name, initialBalance);

        // Menu loop
        int choice;
        do {
            System.out.println("\n===== Bank Services =====\n");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.println("-----------------------------");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: Rs. ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: Rs. ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: Rs. " + account.getBalance());
                    break;
                case 4:
                    account.printTransactionHistory();
                    break;
                case 5:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice, Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}