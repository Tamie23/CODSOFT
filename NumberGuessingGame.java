import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        int chosenNumber = 35; 

        try (Scanner scanner = new Scanner(System.in)) {
            int tryCount = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Try to guess the chosen number!");

            while (true) {
                System.out.print("Enter your guess: ");
                int playerGuess = scanner.nextInt();
                tryCount++;

                if (playerGuess == chosenNumber) {
                    System.out.println("Correct! You Win! Congratulations!");
                    System.out.println("It took you " + tryCount + " tries.");
                    break;
                } else if (playerGuess < chosenNumber) {
                    System.out.println("The number is higher. Guess again.");
                } else {
                    System.out.println("The number is lower. Guess again.");
                }
            }
        } 
    }
}