package classExercise;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the First Number");
        double num1 = scanner.nextDouble();

        System.out.println("Please, enter the Second Number");
        double num2 = scanner.nextDouble();

        double addition = num1 + num2;
        double subtraction  = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1/num2;


        System.out.println("Numbers Entered: "+num1+", "+num2);
        System.out.println("Addition: "+ addition + "\nSubtraction: "+ subtraction+ "\nMultiplication: "+ multiplication+ "\nDivision: "+ division);

    }
}
