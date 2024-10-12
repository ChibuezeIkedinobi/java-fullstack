package algorithm;

public class SumArray {
    public static void main(String[] args) {

        int[] arr = {9,2,3,4,5};

        // index = 0 to 4
        // value of the index
        // length of the array = 5

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of the array is: "+sum);

    }
}
