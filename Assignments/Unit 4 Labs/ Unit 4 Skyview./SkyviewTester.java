public class SkyViewTester {
    public static void main(String[] args) {
        double[] scanner = {0.0, 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 1.0, 1.1};
        SkyView skyview = new SkyView(3, 4, scanner);
        try {
            SkyView skyview3 = new SkyView(1, 2, scanner);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an error, when the matrix was too small, as intended");
        }
        double[] scanner2 = {0.2, 1.1, 4.2, 3.8, 9.4, 4.3, 6.6, 7.7, 8.8, 9.9, 1.0, 1.1};
        SkyView skyview2 = new SkyView(3, 4, scanner2);
        // tostring
        System.out.println(skyview.toString());
        // equals
        System.out.println(skyview.equals(skyview)); // ture
        System.out.println(skyview.equals(skyview2)); // false
        // get average
        System.out.println(skyview.getAverage(0, 2, 0, 2)); // 3.85
        try {
            System.out.println(skyview.getAverage(2, 0, 2, 0)); // 3.85
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an error, when the values were wrong");
        }
    }

}
