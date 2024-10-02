package classExercise;

public class LoopsExercise {
    public static void main(String[] args) {

        System.out.println("Exercise 2A1");
        for (int i = 10; i > 0; i--) {
            System.out.print(i +", ");
        }
        System.out.println("");
        System.out.println("Exercise 2A2");

        for (int i = 0; i <= 10 ; i++) {
            if (i%2 == 0) {
                System.out.print(i +", ");
            }
        }

        System.out.println("");
        System.out.println("Exercise 2A3");

        int temp = 0;
        for (int i = 1; i <= 5 ; i++) {
            temp+=i;
        }
        System.out.println("Sum: "+ temp);



        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
