package algorithm;

public class AllCharactersAreUnique {
    public static void main(String[] args) {
        System.out.println(hasUniqueChar("abcadef"));  //unique... true
//        System.out.println(hasUniqueChar("abbcdddef"));   //not unique... false
    }

    public static String hasUniqueChar(String str) {
        for (int i = 0; i < str.length(); i++) {

            for (int j = i+1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    return "There is a repetition in "+ str+ " at index "+ str.charAt(i) +" and "+ str.charAt(j);
                }
            }
        }
        return "There is no repetition in "+ str;

        /**
         * checking for uniqueness (no repetition)
         * create a class "AllCharactersAreUnique"
         * create a method "hasUniqueChar" that takes a string "str"
         * loop through the input string and starting with the index 0
         * compare the value with the rest of the values
         * if there is a repetition, the loop breaks and it returns false
         * else it returns true
         */
    }
}
