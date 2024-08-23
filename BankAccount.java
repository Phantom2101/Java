import java.util.Scanner;

public class BankAccount {
    // Instance variables
    private String accountNumber;
    private double balance;

    // Static variables
    private static String bankName;
    private static double interestRate;

    // Constructor to initialize instance variables
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter and Setter for static variable bankName
    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String name) {
        bankName = name;
    }

    // Getter and Setter for static variable interestRate
    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    // Method to display details of the account
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println();
    }

    // Main method to test the BankAccount class with user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for static variables
        System.out.print("Enter the bank name: ");
        String name = scanner.nextLine();
        BankAccount.setBankName(name);

        System.out.print("Enter the interest rate: ");
        double rate = scanner.nextDouble();
        BankAccount.setInterestRate(rate);

        // Clear the scanner buffer
        scanner.nextLine();

        // Input for account details
        System.out.print("Enter the number of bank accounts you want to create: ");
        int numberOfAccounts = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        BankAccount[] accounts = new BankAccount[numberOfAccounts];

        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.println("Enter details for account " + (i + 1) + ":");
            System.out.print("Account Number: ");
            String accountNumber = scanner.nextLine();

            System.out.print("Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // Clear the buffer

            accounts[i] = new BankAccount(accountNumber, balance);
        }

        // Print details of each account
        System.out.println("\nAccount Details:");
        for (BankAccount account : accounts) {
            account.displayAccountDetails();
        }

        scanner.close();
    }
}
