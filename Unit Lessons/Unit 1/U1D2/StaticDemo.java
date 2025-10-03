public class StaticDemo {
    public static void main(String[] args) {
        // if u have no constuctor, i'll make a default for you and assign
        // all instance variables to their null state. 
        StaticDemo object = new StaticDemo();

        object.firstIfTestt();
    }
    // this method belongs to the object of the class
    public void firstIfTestt() {
        int x = 4;
        int y = 3;
        int z = 4;
        if (x < y) {
            System.out.println("x is less than y");
        }
        if (x == z) {
            System.out.println("x is equal to z");
        }
    }
    // this method belongs to the class, no object is required. 
    // static methods are helper methods,
    public static String secondIfTest() {
        int x = 4;
        int y = 3;
        int z = 4;
        if (x < y) {
            return "x is less than y";
        }
        if (x == z) {
            return "x is equal to z";
        }
        return "hello there";
    }
}
