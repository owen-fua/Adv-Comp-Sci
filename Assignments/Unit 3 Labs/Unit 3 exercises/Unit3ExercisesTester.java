public class Unit3ExercisesTester {
    public static void main(String[] args) {
        testCalculateStringLengthAverage();
        testreverseString();
        testFindMaxValue();
        testIsPalindrome();
        testSumEvenNumbers();
        testCalculateSumOfSquares();
        testgetNthFibonacci();
        testSortArrayDescending();
        testFindLongestWord();
        testCalculateInterest();
        testParsePositiveInteger();
        testGetArrayElement();
        testCalculateSquareRoot();
        testSumArrayElements();
        testCalculatePower();
    }

    public static void testCalculateStringLengthAverage() {
        // Test Case - Main Case
        String[] letters = {"abc", "cde", "efg", "hij"};
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null element in array
        letters = new String[] {"abc", "cde", "efg", null, "hij"};
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null array
        try {
            letters = null;
            System.out.println(
                    "Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testreverseString() {
        // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with spaces at the end and in the middle
        testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with special characters
        testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: Null string
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }
    }

    public static void testFindMaxValue() {
        // Test Case - Main Case
        int[] testArray = {1, 2, 3};
        System.out.println("Expected 3:" + Unit3Exercises.findMaxValue(testArray));
        // Test Case - Edge Case: Zeros and negatives
        int[] testArray2 = {0, -1, 2};
        System.out.println("Expected 2:" + Unit3Exercises.findMaxValue(testArray2));
        // Test Case - Edge Case: Only negatives
        int[] testArray3 = {-3, -1, -2};
        System.out.println("Expected -1:" + Unit3Exercises.findMaxValue(testArray3));
        // Test Case - Edge Case: Null string
        try {
            testArray = null;
            System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(testArray));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }
    }

    public static void testIsPalindrome() {
        // Test Case - Main Case
        String testString = "racecar";
        System.out.println("Expected True:" + Unit3Exercises.isPalindrome(testString));
        // Test Case - Edge Case, not a pali
        testString = "hello";
        System.out.println("Expected False:" + Unit3Exercises.isPalindrome(testString));
        // Test Case - Edge Case: null
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.isPalindrome(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }
        // Test Case - Edge Case: Empty String
        testString = "";
        System.out.println("Expected True:" + Unit3Exercises.isPalindrome(testString));
    }

    public static void testSumEvenNumbers() {
        // Test Case - Main Case
        int[] testArray = {1, 2, 3};
        System.out.println("Expected 2:" + Unit3Exercises.sumEvenNumbers(testArray));
        // Test Case - Edge Case: negatives
        int[] testArray2 = {-1, -2, -3, -4};
        System.out.println("Expected -6:" + Unit3Exercises.sumEvenNumbers(testArray2));
        // Test Case - Edge Case: Even and Odd Negative and postitive
        int[] testArray3 = {1, 2, 3, -1, -2, -3, -4};
        System.out.println("Expected -4:" + Unit3Exercises.sumEvenNumbers(testArray3));
        try {
            int[] testArray4 = null;
            System.out.println(Unit3Exercises.sumEvenNumbers(testArray4));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testCalculateSumOfSquares() {
        // Test Case - Main Case
        int[] testArray = {1, 2, 3};
        System.out.println("Expected 14:" + Unit3Exercises.calculateSumOfSquares(testArray));
        // Test Case - Edge Case: negatives
        int[] testArray2 = {-1, -2, -3, -4};
        System.out.println("Expected 30:" + Unit3Exercises.calculateSumOfSquares(testArray2));
        // Test Case - Edge Case: Empty
        int[] testArray3 = {};
        System.out.println("Expected 0:" + Unit3Exercises.calculateSumOfSquares(testArray3));
        try {
            int[] testArray4 = null;
            System.out.println(Unit3Exercises.calculateSumOfSquares(testArray4));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testgetNthFibonacci() {
        // Test Case - Main Case
        int testNum = 3;
        System.out.println("Expected 2:" + Unit3Exercises.getNthFibonacci(testNum));
        // Test Case - Main Case, 2
        testNum = 7;
        System.out.println("Expected 13:" + Unit3Exercises.getNthFibonacci(testNum));
        // Test Case - Edge Case: negative
        try {
            testNum = -1;
            System.out.println(Unit3Exercises.getNthFibonacci(testNum));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the int was negative, as intended");
        }
        // Test Case - Edge Case: 0
        testNum = 0;
        System.out.println("Expected 0:" + Unit3Exercises.getNthFibonacci(testNum));
    }

    public static void printIntArray(int[] arr) {
        String output = "{";
        for (int i = 0; i < arr.length - 1; i++) {
            output += arr[i];
            output += ", ";
        }
        output += arr[arr.length - 1];
        System.out.println(output + "}");
    }

    public static void testSortArrayDescending() {
        // Test Case - Main Case
        int[] testArray = {3, 2, 7, 4, 1,};
        Unit3Exercises.sortArrayDescending(testArray);
        System.out.print("Expected {1, 2, 3, 4, 7}:");
        printIntArray(testArray);
        // Test Case - Edge Case, Negatives
        int[] testArray2 = {-3, -2, -7, -4, -1,};
        Unit3Exercises.sortArrayDescending(testArray2);
        System.out.print("Expected {-7, -4, -3, -2, -1}:");
        printIntArray(testArray2);
        // Test Case - Edge Case, Null
        try {
            int[] testArray3 = null;
            Unit3Exercises.sortArrayDescending(testArray3);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testFindLongestWord() {
        // Test Case - Main Case
        String testString = "I have a dog";
        System.out.println("Expected have:" + Unit3Exercises.findLongestWord(testString));
        // Test Case - Main Case 2
        testString = "I have a brother";
        System.out.println("Expected brother:" + Unit3Exercises.findLongestWord(testString));
        // Test Case - Edge Case, multiple longest words
        testString = "My name is Owen";
        System.out.println("Expected name:" + Unit3Exercises.findLongestWord(testString));
        // Test Case - Edge Case, Null
        try {
            testString = null;
            System.out.println(Unit3Exercises.findLongestWord(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }
    }

    public static void testCalculateInterest() {
        // Test Case - Main Case
        double testDub = 100;
        double testDub2 = 10;
        int testInt = 3;
        System.out.println(
                "Expected 133.1:" + Unit3Exercises.calculateInterest(testDub, testDub2, testInt));
        // Test Case - Main Case
        testDub = 1000;
        testInt = 5;
        System.out.println(
                "Expected 1610.51:" + Unit3Exercises.calculateInterest(testDub, testDub2, testInt));
        // Test Case - Edge Case: principal negative
        try {
            testDub = -100;
            System.out.println(Unit3Exercises.calculateInterest(testDub, testDub2, testInt));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the principal was negative, as intended");
        }
        // Test Case - Edge Case: rate negative
        try {
            testDub = 100;
            testDub2 = -100;
            System.out.println(Unit3Exercises.calculateInterest(testDub, testDub2, testInt));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the rate was negative, as intended");
        }
        // Test Case - Edge Case: principal negative
        try {
            testDub2 = 100;
            testInt = -100;
            System.out.println(Unit3Exercises.calculateInterest(testDub, testDub2, testInt));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the years was negative, as intended");
        }
    }

    public static void testParsePositiveInteger() {
        // Test Case - Main Case
        String testString = "4";
        System.out.println("Expected 4:" + Unit3Exercises.parsePositiveInteger(testString));
        // Test Case - Edge Case: negatvive
        try {
            testString = "-5";
            System.out.println(Unit3Exercises.parsePositiveInteger(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the string was negative, as intended");
        }

    }

    public static void testGetArrayElement() {
        // Test Case - Main Case
        String[] testArray = {"abc", "cde", "efg", "hij"};
        System.out.println("Expected efg:" + Unit3Exercises.getArrayElement(testArray, 2));
        // Test Case - Edge Case, out of bounds
        try {
            System.out.println(Unit3Exercises.getArrayElement(testArray, 9));
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the index was out of bounds, as intended");
        }
        // Test Case - Edge case, negative
        try {
            System.out.println(Unit3Exercises.getArrayElement(testArray, -9));
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the index was negative, as intended");
        }
    }

    public static void testCalculateSquareRoot() {
        // Test Case - Main Case
        int testInt = 9;
        System.out.println("Expected 3.0:" + Unit3Exercises.calculateSquareRoot(testInt));
        // Edge Case - negative
        try {
            testInt = -9;
            System.out.println(Unit3Exercises.calculateSquareRoot(testInt));
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the number was negative, as intended");
        }
    }

    public static void testSumArrayElements() {
        // Test Case - Main Case
        int[] testArray = {3, 2, 7, 4, 1,};
        System.out.println("Expected 17:" + Unit3Exercises.sumArrayElements(testArray));
        // Test Case - Edge Case null
        try {
            testArray = null;
            System.out.println(Unit3Exercises.sumArrayElements(testArray));
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testCalculatePower() {
        // Test Case - Main Case
        double testDub = 10;
        int testInt = 2;
        System.out.println("Expected 100:" + Unit3Exercises.calculatePower(testDub, testInt));
        // Test Case - Edge Case
        try {
            testInt = -2;
            System.out.println(Unit3Exercises.calculatePower(testDub, testInt));
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the power was negative, as intended");
        }
    }

}


