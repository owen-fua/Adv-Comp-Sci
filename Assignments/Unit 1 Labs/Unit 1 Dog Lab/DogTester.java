public class DogTester {
    public static void main(String[] args) {
        // constructing dogs
        Dog shaprio = new Dog();
        Dog james = new Dog("James", "Morgan", 15, 226);
        Dog ryan = new Dog("Ryan", "Owen", 14, 227);
        // printing
        System.out.println(shaprio.toString());
        System.out.println(james.toString());
        System.out.println(ryan.toString());
        shaprio.setAge(16);
        shaprio.setOwnerName("Jim");
        System.out.println(shaprio.toString()); // owner should be Jim
        // char stuff
        System.out.println("The dog chars of an id with 123, 693, and 789 are: ");
        System.out.print(PawesomeUtils.generateDogChar(123)); // should return 'L'
        System.out.print(PawesomeUtils.generateDogChar(693)); // should return 'N'
        System.out.println(PawesomeUtils.generateDogChar(789)); // should return 'idk'
        // equals
        System.out.println("Are Shaprio and Ryan equal? " + shaprio.equals(ryan)); // false
        System.out.println("Are Shaprio and Shaprio equal? " + shaprio.equals(shaprio)); // true
        // pickup
        Dog bob = new Dog("Bob", "Maria", 14, 227);
        System.out.println(PawesomeUtils.pickup(bob, "Maria"));
        System.out.println("Still in facilty = " + bob.getStillInFacility()); // in facilty false
        System.out.println(PawesomeUtils.pickup(bob, "John"));
        bob.setStillInFacility(true); // set back to true
        System.out.println("Still in facilty = " + bob.getStillInFacility()); // in facility true
        // check in
        bob.setStillInFacility(false);
        PawesomeUtils.checkIn(bob, "NewOwner");
        System.out.println(bob.toString());
        // Validate dog Id
        System.out.println("Testing dog ids 123 and 55(should be different): ");
        System.out.println(PawesomeUtils.validateDogId(123)); // should be 123
        System.out.println(PawesomeUtils.validateDogId(55)); // should be diff
        // validateDogTag()
        System.out.println("Are the dog's tags valid?");
        System.out.println(PawesomeUtils.validateDogTag(shaprio)); // true for all
        System.out.println(PawesomeUtils.validateDogTag(james));
        System.out.println(PawesomeUtils.validateDogTag(ryan));
        // checking Dog tag
        System.out.println("Shaprio with a wrong tag is: ");
        shaprio.setDogTag("123P");
        System.out.println(PawesomeUtils.validateDogTag(shaprio)); // false
        // Convert to human age
        System.out.println("Human age for dogs aged 1, 2, and 5 are: ");
        james.setAge(1);
        System.out.println(PawesomeUtils.convertAgeToHumanAge(james)); // 15
        james.setAge(2);
        System.out.println(PawesomeUtils.convertAgeToHumanAge(james)); // 24
        james.setAge(5);
        System.out.println(PawesomeUtils.convertAgeToHumanAge(james)); // 49
        // convert to dog age
        System.out.println("Dog age for humans aged 5 and 67 are:");
        System.out.println(PawesomeUtils.convertAgeToDogYears(5)); // 1
        System.out.println(PawesomeUtils.convertAgeToDogYears(67)); // 8

    }

}
