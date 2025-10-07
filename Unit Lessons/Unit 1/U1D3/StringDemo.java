public class StringDemo{

    // in the AP only use these methods from this class

    public static void main(String[] args) {
        // String are objects
        String fullName = "Owen Fua";
        String fullName2 = "Owen Fua";
        fullName2 = "Owen Kung Fua";
        String fullName3 = new String("Owen Fua");

        // fullName3 += ":)";

        // STRINGS ARE IMMUTALBE ( THEY CAN"T CHANGE)
        // any change creates a new string object
        // Dog dog1 = new Dog();
        // Dog dog2 = new Dog();

        System.out.println(fullName == fullName3);
        System.out.println(fullName.equals(fullName3));


        // methods
        // charAt() -> returns the index of a char value
        System.out.println(fullName.charAt(3)); // 3

        // indexOf() -> returns the index of a char value
        System.out.println(fullName.indexOf("n")); // 3, returns the first one

        // substring() -> returns a piece of string given a starting and ending index

        // "Owen Fua"
        int firstSpace = fullName2.indexOf(""); // finds the index of the first space

        String middleLastName = fullName2.substring(firstSpace); // create substring of first space to the end

        System.out.println(middleLastName.indexOf("n")); // 3
        String middleName = fullName2.substring(5, 10); 
        System.out.println(middleName); // kung
        System.out.println(middleLastName.indexOf("z")); // -1,

        // compareTo() -> returns a number depending on the order
        String string1 = "abc";
        // String def = "def";
        String string2 = "ab";

        System.out.println(string2.compareTo(string1));
        // returns negative if abc is "before" abd
        // returns positive if abc is "after"
        // returns 0 if strings are equal


;    }
}