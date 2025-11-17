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
        String message = "== Computer Science ==";
        for (int i = 1; i < enrolledStudents.length + 1; i++) {
            message += i + ".)" + enrolledStudents.getName() + 
        }
    }
 

}
