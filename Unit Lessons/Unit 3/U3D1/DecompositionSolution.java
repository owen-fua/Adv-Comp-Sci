public class DecompositionSolution {

    public static void run() {
        int[] hours = hoursArray();
        int[] steps = stepsArray();
        int[] activeMinutes = activeMinutesArray();
        // validator
        if (!lengthValidator(hours, steps, activeMinutes)) {
            System.out.println("Invalid input: arrays must be the same length.");
            return;
        }
        // total steps
        int totalSteps = sum(steps);
        double average = average(steps);

        // active min
        int totalActiveMinuites = sum(activeMinutes);
        int averageActiveMinuites = average(activeMinutes);
        int activeHalfHourCount = countHalfHours(activeMinutes);

    }

    public static int[] hoursArray() {
        return new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    }

    public static int[] stepsArray() {
        return new int[] {120, 90, 60, 50, 80, 300, 1200, 2200, 2800, 2500, 1800, 900};
    }

    public static int[] activeMinutesArray() {
        return new int[] {2, 1, 0, 0, 1, 10, 35, 50, 55, 48, 32, 15};
    }

    public static boolean lengthValidator(int[] array1, int[] array2, int[] array3) {
        return (array1.length == array2.length && array1.length == array3.length);
    }

    public static int sum(int[] array) {
        int sumTotal = 0;
        for (int i = 0; i < array.length; i++) {
            sumTotal += array[i];
        }
        return sumTotal;
    }

    public static int average(int[] array) {
        int total = sum((array));
        return total / array.length;
    }

    public static int countHalfHours(int[] array) {
        int activeHourCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 30) {
                activeHourCount += 1;
            }
        }
        return activeHourCount;
    }

    public static int[] subArray(int[] array, int start, int end) {
        int[] resultArray = new int[end - start];
    }
    public static int morningAverage(int[] array, int[] array2) {
        int sumMorning = 0, cntMorning = 0;
        int sumMidday = 0, cntMidday = 0;
        int sumAfternoon = 0, cntAfternoon = 0;
        for (int i = 0; i < array.length; i++) {
            if (i <= 3) {
                sumMorning += array2[i];
                cntMorning += 1;
            } else if (i <= 7) {
                sumMidday += array2[i];
                cntMidday += 1;
            } else {
                sumAfternoon += array2[i];
                cntAfternoon += 1;
            }
        }
        double avgMorning = cntMorning == 0 ? 0 : (sumMorning / (double) cntMorning);
        double avgMidday = cntMidday == 0 ? 0 : (sumMidday / (double) cntMidday);
        double avgAfternoon = cntAfternoon == 0 ? 0 : (sumAfternoon / (double) cntAfternoon);
        return 0;
    }
}
