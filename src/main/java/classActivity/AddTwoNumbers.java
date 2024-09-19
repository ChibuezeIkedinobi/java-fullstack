package classActivity;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = scanner.nextInt();

        int totalSum = num1 + num2;
        System.out.println("The sum of "+ num1 +" and "+ num2 +" is "+ totalSum);

        scanner.close();

    }
}
