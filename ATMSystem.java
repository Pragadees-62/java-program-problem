import java.util.Scanner;
class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private int pin;
    private double balance;
    public BankAccount(String accountHolder, String accountNumber, int pin, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }
    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposited: " + amount);
        } else {
            System.out.println("❌ Invalid deposit amount!");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ Withdrawn: " + amount);
        } else {
            System.out.println("❌ Insufficient balance or invalid amount!");
        }
    }
    public void checkBalance() {
        System.out.println("💰 Current Balance: " + balance);
    }
    public String getAccountHolder() {
        return accountHolder;
    }
}
class ATM {
    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account) {
        this.account = account;
        sc = new Scanner(System.in);
    }

    public void start() {
        System.out.println("===== Welcome to the HDFC ATM =====");
        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (!account.validatePin(enteredPin)) {
            System.out.println("❌ Invalid PIN! Access Denied.");
            return;
        }

        int choice;
        do {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("👋 Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
public class ATMSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Akash", "1234567890", 1234, 5000.0);
        ATM atm = new ATM(account);
        atm.start();
    }
}