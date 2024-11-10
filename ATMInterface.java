
import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {
        int balance = 15000, withdraw, deposit;
        final int PIN = 2468; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome! Please enter your secret number:");

        int enteredPin = sc.nextInt();
        if (enteredPin != PIN) {
            System.out.println("Incorrect PIN. Access denied.");
            System.exit(0); 
        }

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to be withdrawn: ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your cash.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to be deposited: ");
                    deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Your Money has been successfully deposited.");
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for banking with Nova!");
                    sc.close(); 
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}