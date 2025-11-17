public class ShortCircuitEvaluation {
    public static void main(String[] args) {

        String[] names = {"Jutin", "Morgan", "Owen", "James", "Daniel", "Levi", null};

        // count how many students are in the list

        int count = 0;

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].length() > 0) {
                count++;
            }
        }

        System.out.println(count);


        // short circuit evaulation
        // T && T
        // F && ?? -> False (skips second condition)

        // T || ?? -> True (Skips second condition)
        // F || T -> true
    }
}
