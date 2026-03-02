import java.util.ArrayList;
import java.util.Arrays;

public class ShelterTester {
    public static void main(String[] args) {
        // some good dogs
        Dog dog1 = new Dog("Fido", 3);
        Dog dog2 = new Dog("Spot", 4);
        Dog dog3 = new Dog("Rex", 2);
        Dog dog4 = new Dog("Fido", 4);

        // taking the good dogs, and putting them in a list
        ArrayList<Dog> goodDogs = new ArrayList<Dog>(Arrays.asList(dog1, dog2, dog3, dog4));

        // creating a shelter
        Shelter shelter = new Shelter();

        // setting the shelter's kennels to a 3x3 array of dogs, note that some kennels are empty
        Dog[][] starterKennels =
                new Dog[][] {{dog1, null, null}, {null, dog2, null}, {dog3, null, dog4}};
        shelter.setKennels(starterKennels);


        // extra dogs for you to use
        Dog dog5 = new Dog("Growlithe", 5);
        Dog dog6 = new Dog("Inu", 2);
        Dog dog7 = new Dog("Cerberus", 3);


        // method that displays the shelter's current status
        shelter.displayStatus();



        // to-do: it is recommended that you test the following methods before you submit your code:
        System.out.println("\n");
        shelter.add(dog5);
        shelter.displayStatus();
        System.out.println("\n");

        shelter.add(dog6, 0, 2);
        shelter.displayStatus();
        System.out.println("\n");
        shelter.add(dog7, 0, 2);
        shelter.displayStatus();

        System.out.println("\n");
        shelter.add(goodDogs);
        shelter.displayStatus();

        // add a list of animals to the shelter at the first available location
        // then display the shelter's status
        // add(ArrayList<Dog> animals)
        System.out.println("\n");
        System.out.println(shelter.adopt(0, 0));
        shelter.displayStatus();
        try {
            shelter.adopt(0, 0);
        } catch (Exception e) {
            System.out.println(e);
        }

        // remove an animal from the shelter at a specific location
        // then display the shelter's status
        // adopt(int row, int col)


        // search the kennel for animals with a specific name
        // then print the list
        System.out.println(shelter.search("Fido"));

        // search the kennel for animals with a specific age
        // then print the list
        System.out.println("\n");
        shelter.displayStatus();
        System.out.println(shelter.search(4));

        try {
            System.out.println(shelter.adopt(-1, 2));
        } catch (Exception e) {
            System.out.println(e);
        }



    }
}
