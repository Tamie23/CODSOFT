import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random rand = new Random();

        
        try (Scanner scanner = new Scanner(System.in)) {
            int randomNumber = rand.nextInt(100) + 1;
            int tryCount = 0;

            while(true) {
                System.out.println("Enter your guess (1-100):");
                int playerNumberGuess = scanner.nextInt();
                tryCount++;

                if (playerNumberGuess == randomNumber) {
                    System.out.println("This is correct! You Win! Congratulations");
                    System.out.println("It took you " + tryCount + " tries");
                    break;
                } else if (randomNumber > playerNumberGuess) {
                    System.out.println("The number is higher. Guess again.");
                } else {
                    System.out.println("The number is lower. Guess again.");
                }
            }
        } 
    }
}