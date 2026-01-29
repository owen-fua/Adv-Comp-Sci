public class Unit3Exercises {
    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        int sum = 0;
        int counted = 0;
        int i = 0;

        while (i < strs.length) {
            if (strs[i] != null) { // added a skip over nulls
                sum += strs[i].length();
                counted++;
            }
            i++;
        }

        return sum / counted;
    }

    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp; // subtle misplaced assignment shifts one character // fix, don't
                                 // minus 1
            left++;
            right--;
        }
        if (chars.length > 2 && chars[0] == chars[chars.length - 1]) {
            chars[0] = Character.toLowerCase(chars[0]); // unnecessary tweak can hide mis-ordering
        }
        return new String(chars);
    }

    // Intended: return the largest value found in the array.
    public static int findMaxValue(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) { // make 0 to run an extra time
            if (numbers[i] > max) {
                max = numbers[i]; // fix bc i starts at 0 now
            } // else if breaks code and doesn't do anything
        }
        return max;
    }

    // Intended: check whether the input string reads the same forwards and
    // backwards.
    public static boolean isPalindrome(String str) {
        if (str.length() == 0) {
            return true; // add edge case for empty
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char a = str.charAt(left);
            char b = str.charAt(right); // no minus 1
            if (a != b) {
                return false; // false
            }
            left++;
            right--;
        }
        return true; // true
    }

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i]; // no plus 1
            }
            // don't need else
        }
        if (numbers[numbers.length - 1] % 2 == 0) {
            sum += numbers[numbers.length - 1];
        }
        if (sum == 0) {
            return 0;
        }
        return sum;
    }

    public static int calculateSumOfSquares(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    }

    public static int getNthFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Integer must be positive");
        } else if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void sortArrayDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static double calculateInterest(double principal, double rate, int years) {
        if (principal < 0) {
            throw new IllegalArgumentException("Principal must be positive");
        }

        if (rate < 0) {
            throw new IllegalArgumentException("Rate must be positive");
        }

        if (years < 0) {
            throw new IllegalArgumentException("Years must be positive");
        }
        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    }

    public static int parsePositiveInteger(String str) {
        int number = Integer.parseInt(str);
        if (number < 0) {
            throw new NumberFormatException("String must be positive");
        }
        return number;

    }

    public static String getArrayElement(String[] arr, int index) {
        if (index > arr.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        if (index < 0) {
            throw new NumberFormatException("Index must be positive");
        }
        return arr[index];

    }

    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(
                    "You can't take a square root of a negative number, result would be "
                            + Double.NaN);
        }
        return Math.sqrt(number);
    }

    public static int sumArrayElements(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double calculatePower(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be positive");
        }
        return Math.pow(base, exponent);
    }

}


