public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        boolean isWeekend = (day == 0 || day == 6);
        if (vacation) {
            if (isWeekend) {
                return "off";
            } else {
                return "10:00";
            }

        } else {
            if (isWeekend) {
                return "10:00";
            } else {
                return "7:00";
            }
        }
    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6 || Math.abs(a) - Math.abs(b) == 6 || a + b == 6) {
            return true;
        }
        return false;
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        }
        return 0;
    }

    public static String fizzString(String str) {
        if (str.length() == 0) {
            return str;
        }
        String first = str.substring(0, 1);
        String last = str.substring(str.length() - 1, str.length());
        if (first.equals("f") && last.equals("b")) {
            return "FizzBuzz";
        } else if (first.equals("f")) {
            return "Fizz";
        } else if (last.equals("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }

    public static String doubleChar(String str) {
        if (str.length() == 0) {
            return str;
        }
        String dubString = "";
        for (int i = 0; i < str.length() - 1; i++) {
            dubString += str.substring(i, i + 1);
            dubString += str.substring(i, i + 1);
        }
        dubString += str.substring(str.length() - 1, str.length());
        dubString += str.substring(str.length() - 1, str.length());
        return dubString;

    }

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count += 1;
            }
        }
        // to-do: implement this method
        return count;
    }

    public static boolean catDog(String str) {
        int dcount = 0;
        int ccount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                ccount += 1;
            }
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("dog")) {
                dcount += 1;
            }
        }
        return (dcount == ccount);
    }

    public static String mixString(String a, String b) {
        String mixedStr = "";
        if (a.length() > b.length()) {
            for (int i = 0; i < b.length(); i++) {
                mixedStr += a.substring(i, i + 1);
                mixedStr += b.substring(i, i + 1);
            }
            mixedStr += a.substring(mixedStr.length() / 2);
            return mixedStr;
        } else if (b.length() > a.length()) {
            for (int i = 0; i < a.length(); i++) {
                mixedStr += a.substring(i, i + 1);
                mixedStr += b.substring(i, i + 1);
            }
            mixedStr += b.substring(mixedStr.length() / 2);
            return mixedStr;
        } else {
            for (int i = 0; i < b.length(); i++) {
                mixedStr += a.substring(i, i + 1);
                mixedStr += b.substring(i, i + 1);
            }

            return mixedStr;

        }
    }

    public static String repeatEnd(String str, int n) {
        String endString = "";
        for (int i = 0; i < n; i++) {
            endString += str.substring(str.length() - n);
        }
        return endString;

    }

    public static boolean endOther(String a, String b) {
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();
        if (a.length() > b.length()) {
            if (lowerA.substring(a.length() - b.length()).equals(lowerB)) {
                return true;
            }
        } else {
            if (lowerB.substring(b.length() - a.length()).equals(lowerA)) {
                return true;
            }
        }
        return false;
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
                count += 1;
            }
        }
        return count;
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        int biggestNum = nums[0];
        int smallestNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > biggestNum) {
                biggestNum = nums[i];
            }
            if (nums[i] < smallestNum) {
                smallestNum = nums[i];
            }
        }
        return biggestNum - smallestNum;
    }

    public static int sum13(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                return sum;
            } else {
                sum += nums[i];
            }

        }
        return sum;
    }

    public static int[] fizzArray(int n) {
        int[] fzArray = new int[n];
        if (n <= 0) {
            return fzArray;
        }
        for (int i = 0; i < n; i++) {
            fzArray[i] = i;
        }
        return fzArray;
    }

    public static boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] == 3) {
                return false;
            }
            if (nums[i] == 3) {
                count += 1;
            }
        }
        if (nums[nums.length - 1] == 3 && nums[nums.length - 2] == 3) {
            return false;
        }
        if (nums[nums.length - 1] == 3) {
            count += 1;
        }
        if (count == 3) {
            return true;
        }
        // to-do: implement this method
        return false;

    }

    public static String[] fizzArray2(int n) {
        String[] fzArray = new String[n];
        for (int i = 0; i < n; i++) {
            fzArray[i] = String.valueOf(i);
        }
        // to-do: implement this method
        return fzArray;
    }

    public static int[] zeroFront(int[] nums) {
        int[] output = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            output[i] = 0;
        }
        int index = count;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                output[index] = nums[i];
                index++;
            }
        }
        return output;
    }

    public static String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                count++;
            }
        }
        String[] output = new String[words.length - count];
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                output[index] = words[i];
                index++;
            }
        }
        return output;
    }

    public static int scoresAverage(int[] scores) {
        int half = scores.length / 2;
        if (average(scores, 0, half) > average(scores, half, scores.length)) {
            return average(scores, 0, half);
        } else {
            return average(scores, half, scores.length);
        }
        // to-do: implement this method
    }

    public static int average(int[] scores, int start, int end) {
        int total = 0;
        int count = 0;
        for (int i = start; i < end; i++) {
            total += scores[i];
            count++;
        }
        return total / count;
    }

    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        int largestA = findLargestSpecialScore(a);
        int largestB = findLargestSpecialScore(b);
        // to-do: implement this method
        return largestA + largestB;
    }

    public static int findLargestSpecialScore(int[] input) {
        int largestNum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 10 == 0 && input[i] > largestNum) {
                largestNum = input[i];
            }
        }
        return largestNum;
    }

    public static String firstTwo(String str) {
        if (str.length() == 0) {
            return "**";
        } else if (str.length() == 1) {
            return str + "*";
        } else {
            return str.substring(0, 2);
        }
    }

    public static double divide(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        if (a > b) {
            return (double) a / b;
        } else {
            return (double) b / a;
        }
    }
}
