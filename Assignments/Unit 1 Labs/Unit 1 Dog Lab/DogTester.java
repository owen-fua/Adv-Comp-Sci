public class DogTester {
    public static void main(String[] args) {
        // constructing dogs
        Dog Shaprio = new Dog();
        Dog James = new Dog("James", "Morgan", 15, 226);
        Dog Ryan = new Dog("Ryan", "Owen", 14, 227);
        // printing
        System.out.println(Shaprio.toString());
        System.out.println(James.toString());
        System.out.println(Ryan.toString());
        Shaprio.setAge(16);
        Shaprio.setOwnerName("Jim");
        System.out.println(Shaprio.toString()); // owner should be Jim
        // char stuff
        System.out.println("The dog chars of an id with 123, 693, and 789 are: ");
        System.out.print(PawesomeUtils.generateDogChar(123)); // should return 'L'
        System.out.print(PawesomeUtils.generateDogChar(693)); // should return 'N'
        System.out.println(PawesomeUtils.generateDogChar(789)); // should return 'idk'
        // equals
        System.out.println("Are Shaprio and Ryan equal? " + Shaprio.equals(Ryan)); // false
        System.out.println("Are Shaprio and Shaprio equal? " + Shaprio.equals(Shaprio)); // true
        // pickup
        Dog Bob = new Dog("Bob", "Maria", 14, 227);
        System.out.println(PawesomeUtils.pickup(Bob, "Maria"));
        System.out.println("Still in facilty = " + Bob.getStillInFacility()); // in facilty false
        System.out.println(PawesomeUtils.pickup(Bob, "John"));
        Bob.setStillInFacility(true); // set back to true
        System.out.println("Still in facilty = " + Bob.getStillInFacility()); // in facility true
        // check in
        Bob.setStillInFacility(false);
        PawesomeUtils.checkIn(Bob, "NewOwner");
        System.out.println(Bob.toString());


    }

}
