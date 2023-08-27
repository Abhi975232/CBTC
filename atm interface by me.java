import java.util.Scanner;

class atminterface {
    private static final String ACCOUNT_NUMBER = "123456";
    private static final String PIN = "1234";
    private static double balance = 10000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");
        System.out.print("Enter your account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter your PIN: ");
        String pin = scanner.nextLine();

        if (accountNumber.equals(ACCOUNT_NUMBER) && pin.equals(PIN)) {
            displayMenu();
        } else {
            System.out.println("Invalid account number or PIN. Exiting...");
        }

        scanner.close();
    }

    private static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawn $" + withdrawAmount);
                    } else {
                        System.out.println("Invalid amount or insufficient balance.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposited $" + depositAmount);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    public static String getAccountNumber() {
        return ACCOUNT_NUMBER;
    }

    public static String getPin() {
        return PIN;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        Object main;
        main.balance = balance;
    }
}
