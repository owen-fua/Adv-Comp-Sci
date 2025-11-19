public class CourseTester {
    public static void main(String[] args) {
        int[] owenScores = {12, 15, 50, 70};
        int[] anaScores = {90, 89, 91, 95}; // scores
        int[] bobScores = {90, 91, 92, 95}; // scores

        StudentRecord owen = new StudentRecord("Owen", owenScores);
        StudentRecord ana = new StudentRecord("Ana", anaScores); // students
        StudentRecord bob = new StudentRecord("Bob", bobScores);

        StudentRecord[] enrolledStudents = {ana, bob}; // course
        Course compSci = new Course("Computer Science", enrolledStudents);

        System.out.println(owen.toString());
        System.out.println(ana.toString()); // Student Record toString

        // testing functions
        System.out.println("What is the average of Ana's scores?");
        System.out.println(ana.getAverage(0, 3)); //
        System.out.println("What is Ana's second score?");
        System.out.println(ana.getTestScore(1)); //

        // setters
        owen.setScores(anaScores);
        owen.setName("Ana");
        System.out.println("Testing equals, Should be true:");
        System.out.println(owen.equals(ana));

        System.out.println("Final averages for ana and bob: ");
        System.out.println(ana.getFinalAverage()); // not improved
        System.out.println(bob.getFinalAverage()); // imporved

        // testing course toString
        System.out.println(compSci.toString());
        System.out.println("best student:");
        System.out.println(compSci.findBestStudent()); // bob
        System.out.println("Average of test one: ");
        System.out.println(compSci.calculateTestAverage(1));

    }
}
