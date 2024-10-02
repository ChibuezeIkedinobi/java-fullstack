package assignment;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = scanner.nextLine();

        //  Convert the string to uppercase.
        String upper = input.toUpperCase();

        System.out.println("-------------------------");
        System.out.println(upper);
        System.out.println("-------------------------");

        //   Reverse the string.
        String reverse = "";
        for (int i = 0; i < input.length(); i++) {
            reverse =  input.charAt(i) + reverse;

        }
        System.out.println(reverse);
        System.out.println("-------------------------");

        //   Check if the string is a palindrome.
        if (input.equalsIgnoreCase(reverse)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }
        System.out.println("-------------------------");

        //   Count the number of vowels in the string.
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> count++;
            }
        }
        System.out.println(count+ " vowels in "+ input);
        System.out.println("-------------------------");


    }

}


//Write a program that accepts a string input from the user and then performs the following operations using different methods:
//Convert the string to uppercase.
//Reverse the string.
//Count the number of vowels in the string.
//Check if the string is a palindrome.
//Learning Objective: Practice using string methods like toUpperCase(), length(), charAt(), and looping through characters.
