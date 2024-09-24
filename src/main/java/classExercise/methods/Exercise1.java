package classExercise.methods;

import java.util.Scanner;

public class Exercise1 {
    public void names(String firstname, String lastname) {
        System.out.println(firstname + lastname);
    }

    public static void name(String firstname, String lastname) {
        System.out.println(firstname + lastname);
    }
    public static void main(String[] args) {
        // non static
        Exercise1 exercise1 = new Exercise1();
        exercise1.names("Ikedinobi ", "Chibueze");

        // static
        name("Ngozichukwu", "Adadioramma");
    }
}
