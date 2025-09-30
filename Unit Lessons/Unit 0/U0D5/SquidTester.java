public class SquidTester {
    public static void main(String[] args) {
        Squid larry = new Squid();


        System.out.println(larry.getTentacleCount());

        System.out.println(larry.toString());


        String s1 = "hello";
        String s2 = "h";
        String s3 = s2 + "ello";

        System.out.println(s1 == s3); // false

        // == is comparing the "id", in other words the "reference address"
        // The == sign doesn't compare content.

        // if you want compare content use the equals method
        System.out.println(s1.equals(s3));

        // Math Functions

        System.out.println(Math.sqrt(9)); // returns double, 3.0
        System.out.println(Math.max(5, 9));// returns 9
        System.out.println(Math.min(5, 9));// returns 5
        System.out.println(Math.abs(-9));// returns 9
        System.out.println(Math.abs(-9.0));// returns 9.0

        // Math.sin, Math.cos, Math.tan, Math.pi approx 3.14159
        // Math.toRadians(180), returns radian of degree


    }

}
