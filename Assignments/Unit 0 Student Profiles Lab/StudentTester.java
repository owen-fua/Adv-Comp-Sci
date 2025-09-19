public class StudentTester {
    public static void main(String[] args) {
        // creating 4 students
        Student sandra = new Student("Sandra", "Will");
        Student michelle = new Student("Michelle", "Will");
        Student bob = new Student("Bob", 11, "Sandra");
        Student will = new Student("Will", 11, "Sandra");
        // printing their info
        System.out.println(sandra.toString()); // 10th, Sandra, Random Id
        System.out.println(michelle.toString()); // 10th, Michelle, Random Id
        System.out.println(will.toString()); // 11th, Will, Random Id
        System.out.println(bob.toString()); // 11th, Bob, Random Id
        // moving everyone up a grade
        System.out.println("\n1 year later\n");
        sandra.setGrade(11);
        michelle.setGrade(11);
        bob.setGrade(12);
        will.setGrade(12);
        // Printing out again
        System.out.println(sandra.toString()); // 11th, Sandra, Random Id
        System.out.println(michelle.toString()); // 11th, Michelle, Random Id
        System.out.println(will.toString()); // 12th, Will, Random Id
        System.out.println(bob.toString()); // 12th, Bob, Random Id,
        // checking if bob and will are the same
        System.out.println("Are Bob and will the same person?: " + bob.equals(will));
        // Outputs false, they have different names and IDs

        // challenge check. They're now friends, they both dislike Sandra
        System.out.println(will.vibeCheck(bob));
    }

}
