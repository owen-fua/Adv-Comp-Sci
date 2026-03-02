import java.util.ArrayList;

class StudentAnswerSheet {
    String name;
    double testScore;
    ArrayList<String> answers = new ArrayList<String>();

    StudentAnswerSheet(String name, ArrayList<String> answers) {
        if (answers == null) {
            throw new IllegalArgumentException("Answers is null");
        }
        this.name = name;
        this.answers = answers;
        this.testScore = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public double getGrade(ArrayList<String> key) {
        if (key == null) {
            throw new IllegalArgumentException("Key is null");
        }
        if (key.size() != answers.size()) {
            return 0.0;
        }
        double total = 0.0;
        int index = 0;
        for (String answer : key) {
            if (answer.equals(answers.get(index))) {
                total += 1;
            } else if (answers.get(index).equals("?")) {
                total += 0;
            } else {
                total -= 0.25;
            }
            index++;
        }
        return total;
    }


}
