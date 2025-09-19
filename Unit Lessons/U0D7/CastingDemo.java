public class CastingDemo {
    public static void main(String[] args) {
        
        // implicit casting
        // storing smaller datatypes into larger ones
        // happens automatically 

        int smallNumber = 100;
        long bigNumber = smallNumber; // int to long
        float decimalNumber = bigNumber; // long to float
        double largeDecimal = decimalNumber; // float to doulbe

        // explicit casting
        // manually converting a data type, usually to a different data type that may incur data loss

        double pi = 3.14159;
        int engineerPi = (int) pi;
        System.out.println(engineerPi); // truncation - you lose all the decimals

        long population = 800000000L;
        int limitedPopulation = (int) population;

        int letterA = 'a';
        System.out.println(letterA + 3);

        // No casting between booleans and ints
        // casting objects is later



    }
}