public class SkyviewTester {
    public static void main(String[] args) {
        double[] scanner = {0.0, 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 1.0, 1.1};
        Skyview skyview = new Skyview(3, 4, scanner);
        System.out.println(skyview.toString());
    }

}
