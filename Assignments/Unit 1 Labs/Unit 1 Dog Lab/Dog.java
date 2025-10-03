public class Dog {
    // instance variables
    String name;
    String ownerName;
    int age;
    int dogId;
    char dogChar;
    String dogTag;
    boolean stillInFacility = true;

    // getters and setters
    Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        this.dogChar = Dog.generateDogChar(this.dogId);
        dogTag = generateDogTag();
    }

    Dog() {
        name = "Justin";
        ownerName = "Ben";
        age = 15;
        dogId = 229;
        this.dogChar = Dog.generateDogChar(this.dogId);
        dogTag = generateDogTag();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public char getDogChar() {
        return dogChar;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public boolean getStillInFacility() {
        return stillInFacility;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public String toString() {
        if (stillInFacility) {
            String part1 = name + " is a good dog. They are " + age + " years old and belong to "
                    + ownerName;
            String part2 = ". They are currently in our facility. For employee use only: DogTag is "
                    + dogId + dogChar;
            return part1 + part2;
        } else {
            String part1 = name + " is a good dog. They are " + age + " years old and belong to "
                    + ownerName;
            String part2 =
                    "They are not currently in our facility. For employee use only: DogTag is "
                            + dogId + dogChar;
            return part1 + part2;
        }
    }

    public boolean equals(Dog other) {
        if (name.equals((other.name)) && ownerName.equals(other.ownerName) && age == other.age
                && dogId == other.dogId && dogChar == other.dogChar && dogTag.equals(other.dogTag)
                && (stillInFacility && other.stillInFacility)) {
            return true;
        } else {
            return false;
        }
    }

    public String generateDogTag() {
        return "" + dogId + dogChar;
    }

    public static char generateDogChar(int dogId) {
        return (char) ('F' + ((dogId / 100 + dogId / 10 + (dogId - (dogId / 10 * 10))) % 10));
    }

    public static String pickup(Dog dog, String personName) {
        if(dog.ownerName.equals(personName)) {
            dog.setStillInFacility(false);
            return dog.name + " has been picked up by their owner " + dog.ownerName; 
        } else {
            return "Safety First! Dog can't leave, this is not their owner";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.setStillInFacility(true);
        dog.setOwnerName(personName);
    }

}
