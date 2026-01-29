public class BobaShopTester {
    public static void main(String[] args) {
        BobaShopMember test = new BobaShopMember("Tea");
        BobaShopMember test2 = new BobaShopMember("Tea");
        BobaShopMember test3 = new BobaShopMember("bob");

        BobaShopMember[] shop = {test, test2}; // course
        BobaShop bliss = new BobaShop("Bliss", shop);
        
        test.grantLoyaltyCredit();
        test.grantLoyaltyCredit();
        test.grantLoyaltyCredit();
        // test.grantLoyaltyCredit();
        // test.grantLoyaltyCredit();
        // test.grantLoyaltyCredit();
        test2.grantLoyaltyCredit();

        System.out.println(test.toString());
        System.out.println(test.countLoyaltyCredits());

        System.out.println(test.equals(test2));

        System.out.println(bliss.isFull());
        System.out.println(bliss.toString());
        bliss.increaseCapacity();
        System.out.println(bliss.toString());
        bliss.registerMember(test3);
        System.out.println(bliss.toString());
    }
}
