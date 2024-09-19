package classExercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your First name: ");
        String firstName = scan.nextLine();

        System.out.println("Enter your Surname: ");
        String surName = scan.nextLine();

        if (firstName.length() == surName.length()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scan.close();
    }
}
