package tasks;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guessCount = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        while (true) {
            guessCount++;

            System.out.println("Enter your guess(1-100) : ");
            int guess = sc.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid guess. Please enter a number between 1 and 100.");
                continue;
            }
            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number in " + guessCount + " tries.");
                break;
            } else if (guess > secretNumber) {
                System.out.println("Too high! Guess lower.");
            } else {
                System.out.println("Too low! Guess higher.");
            }
        }
    }
}