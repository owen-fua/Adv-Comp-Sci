public class CatTester {
    public static void main(String[] args) {
        // creating cat
        Cat morgan = new Cat("Morgan", "Justin", 7, "1234");
        PurrfectUtils.bootUp(morgan);
        // changing values and verifiying change
        morgan.setName("Owen");
        morgan.setCatId("2467");
        morgan.setMoodLevel(4);
        PurrfectUtils.bootUp(morgan);
        // new cat
        Cat owen = new Cat("Owen", "Justin", 4, "2467");
        System.out.println("Testing equals should be true: ");
        System.out.println(morgan.equals(owen)); // true
        PurrfectUtils.bootUp(owen);
        System.out.println("Petting Owen");
        PurrfectUtils.pet(owen);
        owen.setMoodLevel(10);
        System.out.println("\nTesting trimming claws\n");
        for (int i = 0; i < 4; i++) {
            PurrfectUtils.trimClaws(owen);
        }
        // litterbox
        System.out.println("\n");
        PurrfectUtils.cleanLitterBox(owen);
        // feed
        System.out.println("\n");
        PurrfectUtils.feed(owen);

        System.out.println(PurrfectUtils.validateMoodLevel(7));

    }
}
