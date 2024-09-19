package classExercise;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the First Number");
        int num1 = scanner.nextInt();

        System.out.println("Please, enter the Second Number");
        int num2 = scanner.nextInt();

        boolean num3 = num1 == num2;
        String result = (num3) ? "Correct" : "Incorrect";
        System.out.println(result);
    }
}
