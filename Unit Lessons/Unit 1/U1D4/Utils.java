public class Utils {
    public static void main(String[] args) {
        // A class that contains a list of characters to form words

        // it gives strings methods that we can use!
        String x = "hello";
        String.valueOf("123");// converts integer string into int.

        int y = 10; // primitive and DO Not have any methods
        Integer yWrapper = 10; // value 10 has methods now!

        yWrapper.toString();
        Integer.parseInt("123"); // converts strigs to ints

        // boolean wrapper
        boolean isFalse = false;
        Boolean isTrue = true;

        isTrue.toString();
        System.out.println(Boolean.parseBoolean("hello")); // "true" is true, anything else is false

        // Double wrapper
        double decimal = 1.1;
        Double decimalWrapper = 1.1;

        System.out.println(Double.parseDouble("13.76"));

    }
}
