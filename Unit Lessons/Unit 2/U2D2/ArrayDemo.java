public class ArrayDemo {
    public static void main(String[] args) {

        // pokemon
        // max team size of 6, max index is 5

        // Pokemon[] team = new Pokemon[6];
        // {0, 1, 2, 3, 4, 5}

        // team[3] = new Pokemon("Charizard");
        /// {0, 1, 2, "Charizard", 4, 5}


        // this code created a list of size 6, so the max index is 5

        // pokemon[] box = new Pokemon[30];

        // pokemon[] box2 = new Pokemon[1000];

        int[] myFavoriteNumbers = new int[4];
        myFavoriteNumbers[0] = 7;
        myFavoriteNumbers[1] = 8;
        myFavoriteNumbers[2] = 13;
        myFavoriteNumbers[3] = 5;

        // 7,8,13,5

        myFavoriteNumbers[0] = 6;
        // {6, 8, 13, 5}

        System.out.println(myFavoriteNumbers[3]);
        // print out one


        // print out whole list
        for (int i = 0; i < myFavoriteNumbers.length; i++) {
            System.out.println(myFavoriteNumbers[i]);
        }

        // list sizes are immutable <- can't change it without creating a new object;
        // Strings are a list (array) of characters! They are also immutable.
        // {'h', 'e', 'l', 'l', o}

        // String[] beatles = new String[4];
        // beatles[0] = "John Lennon";
        // beatles[1] = "Paul McCartney";

        // or you could do

        String[] beatles = {"John Lennon", "Paul Mccartney", "Ringo Starr", null};

        // challenge: update beatles list to include you as the fifth beatle

        String[] beatles2 = new String[5];
        for (int i = 0; i < beatles.length; i++) {
            beatles2[i] = beatles[i];
            if (beatles[i] != null) {
                System.out.println(beatles[i].length());
            } else {
                System.out.println("This element is null.");
            }

        }
        beatles2[4] = "Owen Fua";
    }


}
