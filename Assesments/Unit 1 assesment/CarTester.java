public class CarTester {
    public static void main(String[] args) {
        System.out.println(AutoUtils.fixName("  bob     sally      "));
        System.out.println(AutoUtils.generateUsername("Owen Fua"));

        Car car = new Car();
        System.out.println(car.toString());
        car.setCleanlinessLevel(15);
        System.out.println(car.getCleanlinessLevel());
        Car car2 = new Car();
        car.setUsername("@owen_fua_2000");
        car2.setUsername("@owen_fua_2000");
        System.out.println(car.equals(car2));
    }
}
