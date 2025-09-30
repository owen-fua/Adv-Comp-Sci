public class Student {
    // Instance variables
    private String id;
    private String name;
    private int grade;
    private String recentOpp;
    private String recentFriend;


    Student(String name, int grade, String recentOpp) {
        this.grade = grade;
        this.name = name;
        this.id = generateId();
        this.recentOpp = recentOpp;
    }

    Student(String name, String recentOpp) {
        this.grade = 10;
        this.id = generateId();
        this.name = name;
        this.recentOpp = recentOpp;
    }

    // getters and setters
    public String getId() {
        return id;
    }

    public void setId(String input) {
        id = input;
    }

    public String getName() {
        return name;
    }

    public void setName(String input) {
        name = input;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int input) {
        grade = input;
    }

    public String getRecentOpp() {
        return id;
    }

    public void setRecentOpp(String input) {
        id = input;
    }

    public String getRecentFriend() {
        return id;
    }

    public void setRecentFriend(String input) {
        id = input;
    }

    // randomly generating an id
    public static int getRandomNum(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }


    public String generateId() {
        String number =
                getRandomNum(1, 9) * 100 + getRandomNum(1, 9) * 10 + getRandomNum(1, 9) + "-";
        int number2 = getRandomNum(0, 10) * 1000 + getRandomNum(0, 10) * 100
                + getRandomNum(0, 10) * 10 + getRandomNum(0, 10);
        return number + number2;
    }

    // Printing out data in a readable form
    public String toString() {
        return name + " is a " + grade + "th grade student. Their id is " + id;
    }

    // Checking if students are equal to each other in every way.
    public boolean equals(Student other) {
        if (grade == other.grade && id == other.id && name.equals(other.name)) {
            return true;
        } else {
            return false;
        }
    }

    // Challenge
    // Checking if students friends because they have the same Opp
    public String vibeCheck(Student other) {
        if (recentOpp.equals(other.recentOpp)) {
            setRecentFriend(other.name);
            return name + " and " + other.name + " are now friends. They both dislike "
                    + other.recentOpp;
        } else {
            return "";
        }

    }

}


