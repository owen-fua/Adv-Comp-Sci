public class PawesomeUtils {

    public static String generateDogTag(int dogId, char dogChar) {
        return "" + dogId + dogChar;
    }

    public static char generateDogChar(int dogId) {
        return (char) ('F' + ((dogId / 100 + dogId / 10 + (dogId - (dogId / 10 * 10))) % 10));
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.ownerName.equals(personName)) {
            dog.setStillInFacility(false);
            return dog.name + " has been picked up by their owner " + dog.ownerName;
        } else {
            return "Safety First! Dog can't leave, this is not their owner";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        if (validateDogTag(dog)) {
            dog.setStillInFacility(true);
            dog.setOwnerName(personName);
        } else {
            System.out.println("This is a counterfeit dog and was denied entry.");
        }

    }

    public static int getRandomNum(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            return getRandomNum(100, 1000);
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int dogid = dog.getDogId();
        String dogtag = dog.getDogTag();
        validateDogId(dogid);
        char dogchar = generateDogChar(dogid);
        String newDogTag = "" + dogid + dogchar;
        if (newDogTag.equals(dogtag)) {
            return true;
        } else {
            return false;
        }
    }

    public static int convertAgeToHumanAge(Dog dog) {
        if (dog.age == 1) {
            return 15;
        } else if (dog.age == 2) {
            return 24;
        } else {
            return 24 + (dog.age * 5);
        }
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } else if (humanYears > 15 && humanYears <= 24) {
            return 2;
        } else {
            return (humanYears - 24) / 5;
        }
    }
}
