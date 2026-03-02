import java.util.ArrayList;

public class TestResults {
    ArrayList<String> answerKey = new ArrayList<String>();
    ArrayList<StudentAnswerSheet> submissions = new ArrayList<StudentAnswerSheet>();

    TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        if (key == null) {
            throw new IllegalArgumentException("Key is null");
        }
        if (submissions == null) {
            throw new IllegalArgumentException("Submissions is null");
        }
        this.answerKey = key;
        this.submissions = submissions;
    }

    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }

    public void submit(StudentAnswerSheet student) {
        submissions.add(student);
    }

    public void gradeTests() {
        for (StudentAnswerSheet submission : submissions) {
            submission.setTestScore(submission.getGrade(answerKey));
        }
    }

    public String highestScoringStudent() {
        if (submissions.size() == 0) {
            return "";
        }

        StudentAnswerSheet best = submissions.get(0);
        double highestScore = best.getGrade(answerKey);
        for (StudentAnswerSheet submission : submissions) {
            if (submission.getGrade(answerKey) > highestScore) {
                highestScore = submission.getGrade(answerKey);
                best = submission;
            }
        }
        return best.getName();
    }
}
