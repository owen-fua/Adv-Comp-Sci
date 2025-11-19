public class Course {
    String courseName;
    StudentRecord[] enrolledStudents;

    Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public String toString() {
        String message = "== " + courseName + " ==";
        for (int i = 0; i < enrolledStudents.length; i++) {
            message += "\n" + (i + 1) + ".) " + enrolledStudents[i].toString();
        }
        return message + "\n";
    }

    public String findBestStudent() {
        double highestAvg = 0;
        String bestStudent = "";
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i].getFinalAverage() > highestAvg) {
                highestAvg = enrolledStudents[i].getFinalAverage();
                bestStudent = enrolledStudents[i].getName();
            }
        }
        return bestStudent;
    }

    public double calculateTestAverage(int testNumber) {
        double sum = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            int[] scores = enrolledStudents[i].getScores();
            sum += scores[testNumber];
        }
        return sum / enrolledStudents.length;
    }


}
