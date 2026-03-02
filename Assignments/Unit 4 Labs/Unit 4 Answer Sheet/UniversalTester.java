import java.util.ArrayList;

public class UniversalTester {
    public static void main(String[] args) {
        ArrayList<String> answers = new ArrayList<String>();
        answers.add("red");
        answers.add("blue");
        answers.add("green");
        answers.add("purple");
        answers.add("?");

        ArrayList<String> answers2 = new ArrayList<String>();
        answers2.add("red");
        answers2.add("blue");
        answers2.add("green");
        answers2.add("yellow");
        answers2.add("orange");
        ArrayList<String> key = new ArrayList<String>();
        key.add("red");
        key.add("blue");
        key.add("green");
        key.add("yellow");
        key.add("orange");
        StudentAnswerSheet sas = new StudentAnswerSheet("owen", answers);
        StudentAnswerSheet sas2 = new StudentAnswerSheet("bob", answers2);
        System.out.println(sas.getGrade(key)); // 2.75

        ArrayList<StudentAnswerSheet> submissions = new ArrayList<StudentAnswerSheet>();
        submissions.add(sas);
        submissions.add(sas2);

        TestResults tr = new TestResults(key, submissions);
        System.out.println(tr.highestScoringStudent()); // bob
    }
}
