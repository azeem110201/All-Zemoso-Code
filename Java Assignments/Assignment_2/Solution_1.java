import java.util.Scanner;

class Solution_1 {
    public static String removeWhiteSpaces(String text) {
        String[] textArray = text.split(" ");
        StringBuilder str = new StringBuilder();
        for (String _string : textArray) {
            str.append(_string);
        }
        return str.toString();
    }

    public static String removeWhiteSpacesUsingRegex(String text) {
        return text.replaceAll("\\s+", "");
    }

    public static boolean checkIfAllAlphabetsPresent(String text) {
        /*
         * -Checks if the all the characters are present in a string or not
         * 
         * Working of the function described below:
         * 1. If the string is null return false.
         * 2. First as the text can be case-insensitive, we can convert the text
         * characters into lower case characters.
         * 3. Removing white spaces it present. We have used two function for removing
         * white spaces. First one splits the string and join it string array. Second is
         * by using regex
         * 4. With the help of visited array, take track of the characters visited.
         * 5. If all the elements in the visited array is true, then return true else
         * false.
         * 
         * - The Time Complexity of this function is O(n) where n is the length of the text
         * - The Space Complexity of this function is O(n) where n is the length of the text
         */
        if (text.length() == 0 || text == null) {
            return false;
        }

        text = removeWhiteSpaces(text);

        text = text.toLowerCase();

        boolean[] visited = new boolean[26];

        for (int i = 0; i < text.length(); i++) {
            int index = text.charAt(i) - 'a';
            visited[index] = true;
        }

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == false) {
                return false;
            }
        }

        return true;

    }

    public static boolean checkIfAllAlphabetsPresentOptimized(String text) {
        /*
         * 
         * -Checks if the all the characters are present in a string or not(Optimized)
         * 
         * Working of the function described below:
         * 1. Removing white spaces it present. We have used two function for removing
         * white spaces. First one splits the string and join it string array. Second is
         * by using regex
         * 2. First as the text can be case-insensitive, we can convert the text
         * characters into lower case characters.
         * 3. If the length of the text is equal to total number of character in English
         * Alphabet i.e 26, the
         * return true else false
         * 
         * - The Time Complexity of this function is O(1) which is constant time complexity
         * - The Space Complexity of this function is O(1) which is constant space complexity
         */
        if (text.length() == 0 || text == null) {
            return false;
        }
        text = removeWhiteSpacesUsingRegex(text);
        if (text.toLowerCase().length() == 26) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the text:");
        String text = scr.nextLine();

        
        System.out.println(checkIfAllAlphabetsPresent(text));

        System.out.println(checkIfAllAlphabetsPresentOptimized(text));
    }
}