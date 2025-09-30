// A class is a collection of related attributes and behaviors

public class HelloWorld {

    // Main -> an entrypoint for your computer to start running code
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("My name is Owen");

        System.out.print("My favorite pizza topping is cheese.");
        System.out.print("My favorite caffeinated drink is boba.");

        // 8 primitive data types
        int number = 5; // integer
        char letter = 'a'; // character
        boolean isTrue = true; // true or false
        float decimal = 50.0f; // 32 bit int
        double bigdecimal = 0.6; // 64 bit decimal
        // INT Alternatives(use int)
        byte age = 25;
        short population = 3200;
        long bigInt = 100;

        String myName = "owen"; // String is a class, not a primitive datatype
        // Collection of primitive characters to describe text

        // print out the length of the string using the length() method
        System.out.println(myName.length());

        // conditional statements
        // if this happens then that happens
        // conditions are always BOOLEAN meaning true/false
        int value = 5;
        if (value == 5) {
            System.out.println(value);
        }

        boolean isCompSciFun = true;
        if (isCompSciFun == false) {
            System.out.println("Comp Sci sucks");
        } else if (isCompSciFun == true) {
            System.out.println("Comp Sci is fun");
        }

        // shorter
        if (isCompSciFun) {
            System.out.println("Comp Sci is really fun");
        } else {
            System.out.println("Comp sci stresses me out");
        }

        // Challenge: Write a conditional if else statment where you do something if you ate 5
        // apples vs 10, it should print something if neither condtion is true
        int appleCount = 5;

        if (appleCount == 5) {
            System.out.println("You have 5 apples.");
        } else if (appleCount == 10) {
            System.out.println("You have 10 apples.");
        } else {
            System.out.println("You have neither 5 nor 10 apples.");
        }
    }

}
