
import java.util.Scanner;

public class SEATWORK12 {

    public static void checkBalance(int[] balances, int accountNumber) {
      
          System.out.println("Your current balance is: " + balances[accountNumber]);
    }
      public static void deposit(int[] balances, int accountNumber, int amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount. Try again.");
            return;
        }
        balances[accountNumber] += amount;
        System.out.println("Deposit successful! New balance: " + balances[accountNumber]);
    }

    public static void withdraw(int[] balances, int accountNumber, int amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Try again.");
            return;
        }
        if (amount > balances[accountNumber]) {
            System.out.println("Insufficient balance. Try again.");
            return;
        }
        balances[accountNumber] -= amount;
        System.out.println("Withdrawal successful! New balance: " + balances[accountNumber]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] balances = new int[10];
        for (int i = 0; i < balances.length; i++) {
            balances[i] = 100;
        }

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            int option = scanner.nextInt();

            if (option == 4) {
                System.out.println("Exiting...");
                break;
            }

            System.out.println("Enter account number:");
            int accountNumber = scanner.nextInt();

            if (accountNumber < 0 || accountNumber >= balances.length) {
                System.out.println("Invalid account number. Try again.");
                continue;
            }

            switch (option) {
                case 1:
                    checkBalance(balances, accountNumber);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    int depositAmount = scanner.nextInt();
                    deposit(balances, accountNumber, depositAmount);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw:");
                    int withdrawAmount = scanner.nextInt();
                    withdraw(balances, accountNumber, withdrawAmount);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
              }
              
