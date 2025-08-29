public class ConditionalChallenge {
    public static void main(String[] args) {
        

        // Part 1: Temperature Converter
        System.out.println("--- Part 1: Temperature Converter ---");
        double temperature = 15;
        boolean isCold = true;
        if (isCold){
            temperature = temperature - 15;
            System.out.println("It's cold and the temperature is" + temperature + "degrees");
        } else {
            temperature = temperature + 10;
            System.out.println("It's not cold and the temperature is " + temperature + "  degrees");
        }
        

        // Part 2: Grade Calculator
        System.out.println("--- Part 2: Grade Calculator ---");
        int score = 95;
        if (score > 70) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        System.out.println("Your score was " + score);


        // Part 3: Season Determiner
        System.out.println("--- Part 3: Season Determiner ---");
        int seasonTemp = 88;
        if (seasonTemp > 80) {
            System.out.println("Summer and the temp is " + seasonTemp);
        } else if (seasonTemp > 60 && seasonTemp < 80) {
            System.out.println("Spring and the temp is " + seasonTemp);
        } else if (seasonTemp > 40 && seasonTemp < 59) {
            System.out.println("Fall and the temp is " + seasonTemp);
        } else {
            System.out.println("Winter and the temp is " + seasonTemp);
        }


        // Part 4: Number Classifier
        System.out.println("--- Part 4: Number Classifier ---");
        int number = 68;
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else if (number == 0) {
            System.out.print("Zero");
        } else if (number > 100) {
            System.out.println("Large");
        } else {
            System.out.println("Very Negative");
        }



    }
}

