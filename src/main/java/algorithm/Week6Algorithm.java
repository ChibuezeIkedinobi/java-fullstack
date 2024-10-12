package algorithm;

public class Week6Algorithm {

    public static int smallestPositiveInteger(int[] numbers) {

        int lengthOfArray = numbers.length;

        for (int i = 0; i < lengthOfArray; i++) {
            while ( numbers[i] > 0  &&  numbers[i] <= lengthOfArray  &&  numbers[numbers[i] -1] != numbers[i] ) {
                int temp = numbers[numbers[i] - 1];
                numbers[numbers[i] - 1] = numbers[i];
                numbers[i] = temp;
            }
        }
        for (int i = 0; i < lengthOfArray; i++) {
            if (numbers[i] != i + 1) {
                return i + 1;
            }
        }
        return lengthOfArray + 1;
    }


    public static void main(String[] args) {

//        int[] sample1 = {1,2,0};     // Output: 3
        int[] sample2 = {3,4,-1,1};     // Output: 2
//        int[] sample3 = {17,8,9,11,12};     // Output: 1

//        System.out.println(smallestPositiveInteger(sample1));
        System.out.println(smallestPositiveInteger(sample2));
//        System.out.println(smallestPositiveInteger(sample3));

    }
}
