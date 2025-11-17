public class PurrfectUtils {
    public static String determineCatMood(Cat cat) {
        if (cat.getMoodLevel() >= 7) {
            return "Currently, " + cat.getName() + " is in a great mood.\nPetting is appreciated.";
        } else if (cat.getMoodLevel() <= 3) {
            return "Currently, " + cat.getName()
                    + " is reminiscing of a past life.\nPetting is acceptable.";
        } else {
            return "Currently, " + cat.getName()
                    + " is plotting revengeance.\nPetting is extremely risky.";
        }
    }

    public static char generateCatChar(String catId) {
        int sumOfId = 0;
        for (int i = 0; i < catId.length(); i++) {
            sumOfId += Integer.parseInt(catId.substring(i, i + 1));
        }
        return (char) ((sumOfId % 26) + 'A');
    }

    public static int generateRandomNumber(int low, int high) {
        return (int) (Math.random() * (high - low) + low);
    }

    public static String validateCatId(String catId) {
        if (Integer.parseInt(catId) >= 1000 && Integer.parseInt(catId) <= 9999) {
            return catId;
        } else {
            return "" + generateRandomNumber(1000, 9999);
        }
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel < 0) {
            return 0;
        } else if (moodLevel > 10) {
            return 10;
        } else {
            return moodLevel;
        }
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        if (cat.getMoodLevel() > 2 && cat.isHungry() == true) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println("Petting failed...");
        } else {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int oneOrTwo = generateRandomNumber(1, 3);
        if (oneOrTwo == 1) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println(cat.getName() + " did not like that...");
        } else {
            cat.setMoodLevel(cat.getMoodLevel() - 2);
            System.out.println(cat.getName() + " really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        System.out.println(
                "Cleaning the litter box...\nDone! \n" + cat.getName() + " appreciated that.");
    }

    public static void feed(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        System.out.println("Filling up " + cat.getName() + "'s bowl...\nDone!\n" + cat.getName()
                + " is eating...\n" + cat.getName() + " is full!");
    }
}
