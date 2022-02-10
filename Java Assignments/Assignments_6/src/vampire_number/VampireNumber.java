package vampire_number;

import java.util.HashMap;
import java.util.Map;

/*
  Steps to check whether a number is vampire number or not
  1. Check if the count of numbers in the number is even or not. If odd, then its not a vampire number
  2. Find the factors of the number.
  3. Combine the factors of the number to create the other number maybe or may not have same number in it
  4. If the numbers present in the actual number and the created number after finding factors is same irrespective
     // of the position. Then the number is vampire number.
 */

public class VampireNumber {
    public static Map<Integer, Integer> countNumberRepeationAndStoreInHashMap(int number){
        int num = number;
        Map<Integer, Integer> storeNumberCountInHashMap = new HashMap<>();

        while(num != 0){
            int res = num % 10;
            if(storeNumberCountInHashMap.containsKey(res)){
                storeNumberCountInHashMap.put(res, storeNumberCountInHashMap.get(res) + 1);
            }
            else{
                storeNumberCountInHashMap.put(res, 1);
            }
            num /= 10;
        }

        return storeNumberCountInHashMap;
    }
    public static boolean isVampireNumber(int number){
        // 1. First we need to check if the number of digits in the number is even or not
        int numOfDigits = 0;
        boolean flag = true;

        int temp = number;
        while(temp != 0){
            numOfDigits++;
            temp /= 10;
        }

        if(numOfDigits % 2 == 1){
            flag = false;
            return flag;
        }

        // counting num in numbers ans storing in hashmap
        Map<Integer, Integer> countNumbers;
        countNumbers = countNumberRepeationAndStoreInHashMap(number);

        // 2. Finding the factors of the number
        // basic math analogy is that any number having a length of n, it's factors will lie in the range
        // 10^(n/2)-1 to 10^(n/2)
        for(int i = (int)Math.pow(10, ((numOfDigits/2) - 1)); i < (int)Math.pow(10, (numOfDigits/2)); i++){
            //first factor corresponds to i and the second one to j

            // first factor is the number which is divisible by i
            if(number % i == 0){
                // second factor should be divisble by j
                int j = number / i;

                if(j >= (int)Math.pow(10, ((numOfDigits/2) -1)) && j < (int)Math.pow(10, (numOfDigits/2))){

                    //if there are any tailing zeros to the number
                    if(i % 10 == 0 && j % 10 == 0){
                        continue;
                    }

                    // 3. creating the generated number from the factors i, j
                    int generatedNumber = (i * (int)Math.pow(10, numOfDigits / 2)) + j;

                    // 4. checking if the same numbers are present in the generated number
                    Map<Integer, Integer> generatedCountNumbers = new HashMap<>();
                    generatedCountNumbers = countNumberRepeationAndStoreInHashMap(generatedNumber);
                    // if the count of numbers in both the hashmaps are same then it is a vampire number
                    if(countNumbers.equals(generatedCountNumbers)){
                        flag = false;
                        return true;
                    }
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        // print the first 100 vampire numbers
        int i = 1;
        int counter = 0;
        while(counter <= 100){
            if(isVampireNumber(i)){
                System.out.println(i);
                counter++;
            }
            i++;
        }
    }
}
