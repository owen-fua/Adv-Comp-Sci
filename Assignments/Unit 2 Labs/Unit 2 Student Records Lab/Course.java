public class Course {
    String courseName;
    StudentRecord[] enrolledStudents;

    Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        this.enrolledStudents = new StudentRecord[maxEnrollment];
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

    public boolean isFull() {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                enrolledStudents[i] = student;
                return;
            }
        }
    }

    public boolean dropStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null
                    && enrolledStudents[i].getName().equals(student.getName())) {
                enrolledStudents[i] = null;
                return true;
            }
        }
        return false;
    }

    public int countEnrolledStudents() {
        int count = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        int index = 0;
        StudentRecord[] newArray = new StudentRecord[enrolledStudents.length + sizeIncrease];
        for (int i = 0; i < enrolledStudents.length; i++) {
            newArray[i] = enrolledStudents[i];
            index++;
        }
        for (int i = 0; i < sizeIncrease; i++) {
            newArray[index + i] = null;
        }
        enrolledStudents = newArray;
    }


}
