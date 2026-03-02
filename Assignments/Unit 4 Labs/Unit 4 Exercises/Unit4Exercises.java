import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[nums.length - n + i]) {
                return false;
            }
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
        if (start >= end) {
            return new int[0];
        }
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
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        for (Integer ints : nums) {
            if (ints >= 0) {
                output.add(ints);
            }
        }
        // to-do: implement the method
        return output;

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        for (Integer ints : nums) {
            if (ints >= 20 || ints <= 12) {
                output.add(ints);
            }
        }
        return output;
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        ArrayList<String> output = new ArrayList<String>();
        for (String string : strs) {
            if (string.length() == 0) {
                output.add("y");
            } else if (!string.substring(string.length() - 1).equals("y")) {
                output.add(string + "y");
            }
        }
        return output;
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        for (Integer ints : nums) {
            int num = ints * ints + 10;
            if (num % 10 != 5 && num % 10 != 6) {
                output.add(num);
            }
        }
        return output;
    }

}


