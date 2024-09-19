package classExercise;

import java.util.Random;
import java.util.Scanner;

public class SimpleGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(20) + 1;  //random number between 1 and 20
        int guessedNum;

        while (true) {
            System.out.print("Enter a number(1-20): ");
            guessedNum = scanner.nextInt();

            if (guessedNum < 1 || guessedNum > 20) {
                System.out.println("Invalid Number. Please enter a number between 1 and 20.");
                continue;
            }

            if (guessedNum == num) {
                System.out.println("Sharp!! You're a smart guy. " + num + " is Correct.");
                break;
            }

            if (num % 2 == 0) {
                System.out.println("Hint: The number is even.");
            } else {
                System.out.println("Hint: The number is odd.");
            }

            if (guessedNum < num && num > 9) {
                System.out.println("Too Low. Random number is above 9.");
            } else if (guessedNum > num && num < 10) {
                System.out.println("Too High. Random number is below 10.");
            } else if (guessedNum < num) {
                System.out.println("Lower than Random number. Try again.");
            } else if (guessedNum > num) {
                System.out.println("Higher than Random number. Try again.");
            }
            System.out.println("--------------------------------------");
        }

        scanner.close();
    }
}
