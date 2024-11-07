import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        int randomNumber = 50; 
        int maxTries = 8;      
        int tryCount = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Try to guess the number (between 1 and 100). You have " + maxTries + " tries.");

            while (tryCount < maxTries) {
                System.out.print("Enter your guess: ");
                int userNumberGuess = scanner.nextInt();
                tryCount++;

                if (userNumberGuess == randomNumber) {
                    System.out.println("Congratulations! You are correct!");
                    System.out.println("It took you " + tryCount + " tries.");
                    break;
                } else if (userNumberGuess < randomNumber) {
                    System.out.println("The number is higher. Try again.");
                } else {
                    System.out.println("The number is lower. Try again.");
                }

                if (tryCount == maxTries) {
                    System.out.println("Your tries are up! Better luck next time.");
                }
            }
        }
    }
}
