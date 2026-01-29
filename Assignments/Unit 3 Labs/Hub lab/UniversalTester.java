public class UniversalTester {
    public static void main(String[] args) {
        Student justin = new Student("Justin", "12834", "jyu1@hwemail.com");
        Student levi = new Student("Levi", "Fortnite battle pass", "losman1@hwemail.com");
        // constuctor issues
        System.out.println("constructor");
        try {
            Student bob = new Student("b@b", "Fortnite battle pass", "losman1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when @ was included, as intended");
        }

        try {
            Student bob = new Student("Justin", "Fortnite battle pass", "losman1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when name was taken, as intended");
        }

        try {
            Student bob = new Student(null, "Fortnite battle pass", "losman1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when name was null, as intended");
        }

        try {
            Student bob = new Student("", "Fortnite battle pass", "losman1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when name was blank, as intended");
        }

        try {
            Student bob = new Student("bob", null, "losman1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exeception when password was null, as intended");
        }
        try {
            Student bob = new Student("bob", "", "losman1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exeception when password was blank, as intended");
        }

        try {
            Student bob = new Student("Bob", "Fortnite battle pass", "asdflkj");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exeception when email was invalid, as intended");
        }



        // change name
        System.out.println("\nchange name");

        try {
            justin.changeName("Justin@");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when @ was included, as intended");
        }

        try {
            justin.changeName("Levi");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when name was taken, as intended");
        }

        try {
            justin.changeName("");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when name was blank, as intended");
        }
        // reset password
        System.out.println("\n reset password");
        try {
            justin.name = "";
            justin.resetPassword();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when name was missing, as intended");
        }
        System.out.println("Password generator failed execption impossible to catch. ");

        // submit assingment
        System.out.println("\nsubmit assignment");
        try {
            justin.assignments = null;
            justin.submitAssignment("Math HW 1", "math");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exeception when assignments was null, as intended");
        }

        try {
            justin.assignments = new Assignment[5];
            justin.assignmentCount = 20;
            justin.submitAssignment("Math HW 1", "math");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exeception when there were too many assignments, as intended");
        }

        try {
            levi.submitAssignment("", "math HW");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when title was blank, as intended");
        }
        try {
            levi.submitAssignment("Math HW", "");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exeception when discription was blank, as intended");
        }
        // Hub register student
        Hub hub = new Hub();
        hub.registerStudent("justin", "pass", "jyu1@hwemail.com");
        System.out.println("\nregister student");
        try {
            hub.registerStudent(null, "pass", "ofua1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when name was null, as intended");
        }

        try {
            hub.registerStudent("", "pass", "ofua1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when name was blank, as intended");
        }
        try {
            hub.registerStudent("@", "pass", "ofua1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when name was @, as intended");
        }


        try {
            hub.registerStudent("owen", null, "ofua1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exeception when password was null, as intended");
        }
        try {
            hub.registerStudent("owen", "", "ofua1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exeception when password was blank, as intended");
        }

        try {
            hub.registerStudent("owen", "pass", null);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when email was null, as intended");
        }

        try {
            hub.registerStudent("owen", "pass", "");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when email was blank, as intended");
        }
        try {
            hub.registerStudent("owen", "pass", "abcd");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exeception when email was invalid, as intended");
        }

        try {
            hub.registerStudent("justin", "pass", "ofua1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when name was taken, as intended");
        }

        // login student
        System.out.println("\nlogin student");
        try {
            hub.loginStudent("not found", "pass");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exeception when student wasn't found, as intended");
        }
        try {
            hub.loginStudent("justin", "incorrect pass");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exeception when pass was incorrect, as intended");
        }

        try {
            hub.doesStudentExist("justin");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exeception when student already exists, as intended");
        }

        // bad storage stuff
        System.out.println(
                "\nbad storage not possible through a tester bc I can't change the private variables");
        // hub.studentCount = -1; prove i can't access private variables

        // assignment class
        System.out.println("\nassignment");
        try {
            Assignment assignment = new Assignment(null, "math HW");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when title was null, as intended");
        }
        try {
            Assignment assignment = new Assignment("123456789123456789", "math HW");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exeception when title was too long, as intended");
        }
        try {
            Assignment assignment = new Assignment("Math HW", "deez nuts");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when deez was said, as intended");
        }
        try {
            Assignment assignment = new Assignment("Math HW", "math67");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exeception when 67 was said, as intended");
        }
    }
}

