public class AutoUtils {
    public static String fixName(String word) {
        String trimmedWord = word.trim();
        int space = trimmedWord.indexOf(" ");
        String secondWordWithSpace = trimmedWord.substring(space);
        String secondWord = secondWordWithSpace.trim();
        String finalWord = trimmedWord.substring(0, space) + " " + secondWord;
        return finalWord;

    }

    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel > 10) {
            return 10;
        } else if (cleanlinessLevel < 0) {
            return 0;
        } else {
            return cleanlinessLevel;
        }
    }

    public static double getRandomNum(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static String generateUsername(String name) {
        String lowerName = name.toLowerCase();
        int space = lowerName.indexOf(" ");
        String lastName = lowerName.substring(space + 1);
        String firstName = lowerName.substring(0, space);
        return "@" + firstName + "_" + lastName + "_" + (int) getRandomNum(1950, 2050);
    }

    public static void cleanCar(Car car) {
        car.setCleanlinessLevel(car.getCleanlinessLevel() + 2);
    }
}
