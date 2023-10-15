import java.util.Scanner;
class BankAccount{
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double checkBalance() {
        return balance;
    }
}

class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void displayOptions() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayOptions();
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = Double.parseDouble(scanner.nextLine());
                    if (userAccount.withdraw(withdrawAmount)) {
                        System.out.println("Withdrew Rs." + withdrawAmount + ". New balance: Rs." + userAccount.checkBalance());
                    } else {
                        System.out.println("Withdrawal failed. Insufficient balance or invalid amount.");
                    }
                    break;

                case "2":
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = Double.parseDouble(scanner.nextLine());
                    if (userAccount.deposit(depositAmount)) {
                        System.out.println("Deposited 	Rs." + depositAmount + ". New balance: Rs." + userAccount.checkBalance());
                    } else {
                        System.out.println("Deposit failed. Invalid amount.");
                    }
                    break;

                case "3":
                    System.out.println("Your account balance is Rs." + userAccount.checkBalance());
                    break;

                case "4":
                    System.out.println("Thank you for using the ATM");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

public class AtmInterface{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your initial account balance: ");
        double initialBalance = Double.parseDouble(scanner.nextLine());
        BankAccount userAccount = new BankAccount(initialBalance);
        ATM atm = new ATM(userAccount);
        atm.start();
        scanner.close();
    }
}
