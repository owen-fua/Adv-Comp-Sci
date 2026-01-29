import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[nums.length - n + i])
                return false;
        }
        return true;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                return true;
            }
            if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        int[] output = new int[end - start];
        for (int i = 0; i < output.length; i++) {
            output[i] = start + i;
        }
        return output;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        String[] output = new String[end - start];
        for (int i = 0; i < output.length; i++) {
            int num = start + i;
            if (num % 15 == 0) {
                output[i] = "FizzBuzz";
            } else if (num % 5 == 0) {
                output[i] = "Buzz";
            } else if (num % 3 == 0) {
                output[i] = "Fizz";
            } else {
                output[i] = String.valueOf(num);
            }
        }
        return output;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        int[] output = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                output[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                output[index] = nums[i];
                index++;
            }
        }
        return output;
    }


    // ArrayList Methods

    // Method 1: noNegatives
    // public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
    //     ArrayList<Interger?new
    //     for (Integer ints : nums) {
    //         if()
    //     }
    //     // to-do: implement the method
    //     return new ArrayList<>(); to do

    //}

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

}
