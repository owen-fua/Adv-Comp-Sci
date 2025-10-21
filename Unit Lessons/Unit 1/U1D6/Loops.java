public class Loops {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }
        // loop 2
        boolean isRunning = true;
        while (isRunning) {
            count++;
            if (count == 100) {
                isRunning = false;
            }
        }
        // loop 3
        for (int count2 = 0; count2 < 10;) {
            System.out.println(count2);
            count2++;
        }

        // a for-loop is best when you know the exatct number of iteratiosn (repetitions)
        // a for-loop is more compact

        // a while llop is best when you don't know the extact number of repetitions
        // a while loop requires the initialization to be outside the loop, and the
        // iterator to be updated inside the loop

        // loop 4 - do while loop
        do {
            System.out.println("Do this first");
            System.out.println("then check condition");
        } while (isRunning);

        // loop 5 do while loops
        System.out.println("do this first");
        System.out.println("then chekc condition ");
        while (isRunning) {
            System.out.println("do this first");
            System.out.println("then check condition");
        }

        // loops (int i = 0; i < 10; i++;)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println("All work and no play makes jack a dull boy");
                }

            }
        }

        // keep max level of nested loops to 2

    }
}
