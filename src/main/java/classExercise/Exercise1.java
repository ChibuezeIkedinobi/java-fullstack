package classExercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your First name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your Last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Your full name is "+ firstName +" "+ lastName);
        scanner.close();
    }
}
