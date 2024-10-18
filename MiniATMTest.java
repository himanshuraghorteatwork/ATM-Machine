import java.util.Scanner;

// Class for ATM
class MiniATM {
    float balance = 0;  // Initial balance set to 0
    int PIN = 1234;     // Default PIN

    Scanner sc = new Scanner(System.in);  // Single Scanner instance

    // Method to check PIN
    public void checkPin() {
        System.out.println("Enter your PIN:");
        int enteredPin = sc.nextInt();
        if (enteredPin == PIN) {
            menu();  // If PIN is correct, display the menu
        } else {
            System.out.println("Invalid PIN. Please try again.");
            checkPin();  // Re-ask for PIN if incorrect
        }
    }

    // Main menu
    public void menu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        int option = sc.nextInt();

        if (option == 1) {
            checkBalance();
        } else if (option == 2) {
            withdrawMoney();
        } else if (option == 3) {
            depositMoney();
        } else if (option == 4) {
            System.out.println("Thank you for using the ATM. Goodbye!");
            return;  // Exit the program
        } else {
            System.out.println("Invalid choice. Please try again.");
            menu();  // Return to menu for invalid options
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
        menu();  // Return to the menu
    }

    // Method to withdraw money
    public void withdrawMoney() {
        System.out.println("Enter the amount to withdraw:");
        float amount = sc.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
        menu();  // Return to the menu
    }

    // Method to deposit money
    public void depositMoney() {
        System.out.println("Enter the amount to deposit:");
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("Money deposited successfully.");
        menu();  // Return to the menu
    }
}

// Main class to run the MiniATM
public class MiniATMTest {
    public static void main(String[] args) {
        MiniATM atm = new MiniATM();  // Create an instance of MiniATM
        atm.checkPin();  // Start by checking the PIN
    }
}
