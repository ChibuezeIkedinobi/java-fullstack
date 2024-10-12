package algorithm;

public class SearchNum {
    public static void main(String[] args) {
        int[] num = {4, 2, 6, 8, 9};
        int target = 600;
        System.out.println(search_num(num, target));
    }

    public static int search_num(int[] num, int target) {
        int index = -1000;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }
}
