public class Unit4ExercisesTester {
    public static void main(String[] args) {
        // matching end sequencess
        System.out.println("Tesing MatchingEndSequences");
        int[] testArray = {5, 6, 45, 99, 13, 5, 6};
        System.out.println(Unit4Exercises.matchingEndSequences(testArray, 1)); // false
        int[] testArray2 = {5, 6, 45, 99, 13, 5, 6};
        System.out.println(Unit4Exercises.matchingEndSequences(testArray, 2)); // true
        int[] testArray3 = {1, 2, 3, 4, 5, 6, 8, 10};
        System.out.println(Unit4Exercises.matchingEndSequences(testArray3, 2)); // false
        // has 3 consecutive
        System.out.println("\nTesting hasThreeConsecutive");
        System.out.println(Unit4Exercises.hasThreeConsecutive(testArray)); // true
        System.out.println(Unit4Exercises.hasThreeConsecutive(testArray3)); // true
        int[] testArray4 = {1, 2, 3};
        System.out.println(Unit4Exercises.hasThreeConsecutive(testArray4)); // false
        // generate number sequence
        System.out.println("\nTesting generateNumberSequence");
        printIntArray(Unit4Exercises.generateNumberSequence(2, 4));
        printIntArray(Unit4Exercises.generateNumberSequence(1, 5));
        printIntArray(Unit4Exercises.generateNumberSequence(7, 9));
        // fizz buzz
        System.out.println("\nTesting fizzbuzz");
        printStringArray(Unit4Exercises.fizzBuzz(1, 16));
        printStringArray(Unit4Exercises.fizzBuzz(5, 10));
        printStringArray(Unit4Exercises.fizzBuzz(3, 7));
        // even before odd
        System.out.println("\nTesting moveEvenBeforeOdd");
        printIntArray(Unit4Exercises.moveEvenBeforeOdd(testArray));
        printIntArray(Unit4Exercises.moveEvenBeforeOdd(testArray2));
        printIntArray(Unit4Exercises.moveEvenBeforeOdd(testArray3));

    }

    public static void printIntArray(int[] array) {
        String output = "[";
        for (int i = 0; i < array.length - 1; i++) {
            output += array[i] + ", ";
        }
        output += array[array.length - 1] + "]";
        System.out.println(output);
    }

    public static void printStringArray(String[] array) {
        String output = "[";
        for (int i = 0; i < array.length - 1; i++) {
            output += array[i] + ", ";
        }
        output += array[array.length - 1] + "]";
        System.out.println(output);
    }
}
