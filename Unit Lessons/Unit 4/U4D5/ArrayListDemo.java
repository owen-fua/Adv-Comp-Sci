import java.util.ArrayList;
public class ArrayListDemo {
    // arrays -> objcts that represent a list of elements
    // the size of an array can not be changed once initialized(size is immutable)
    // if I want to expand the array, I'd have to create an entirely new array and copy the old values

    // ArrayList class
    // expandable list w methods
    // must be imported
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        // array list reserve 10 empty slots in your memory. 
        
        names.add("owen");
        // if u add more then 10, it just adds one, but to save space it just doubles
        // so if u add like 11,, it becomes 20, then 40, then 80
        // formating is correct, like in sout
        // names.size() is the size lol
        // names.get(index) gives u the value


        // draw back is you can't use Arraylist on primative data types
        // we can use interger in the Integer wrapper class
        // Integer.ParseInt()
        ArrayList<Integer> myFavNums = new ArrayList<Integer>(); 
        myFavNums.add(6);
        myFavNums.add(7);
        myFavNums.add(21);
        System.out.println(myFavNums);
        myFavNums.add(1, 10); // index then number, it's overloaded
        System.out.println(myFavNums);

        myFavNums.set(1, 11); //replace
        System.out.println(myFavNums);

        System.out.println(myFavNums.remove(1));// removes and returns element removes
        System.out.println(myFavNums.get(2));
    }

}
