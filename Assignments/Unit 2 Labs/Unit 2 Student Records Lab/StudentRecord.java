public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // to-do: implement getters
    // to-do: implement getTestScore

    public int getTestScore(int testNumber) {
        if (scores[testNumber] == null) {
            return 0;
        } else {
            return scores[testNumber];
        }

    }

    // inherited methods
    // to-do: implement toString
    public String toString() {
        String base = name + "'s scores: [";
        for (int i = 0; i < scores.length; i++) {
            base += "" + i;
        }
        return base + "]";
    }

    // methods
    public boolean equals(StudentRecord other) {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == other.scores[i]) {
                return false;
            }
        }
        return (name == other.name);
    }

    /*
     * returns the average (arithmetic mean) of the values in scores precondition: 0 <= first < last
     * < scores.length
     * 
     * @param first - the first index of the scores array
     * 
     * @param last - the last index of the scores array
     * 
     * @return the double average of the values in scores
     */
    public double getAverage(int first, int last) {
        return (scores[first] + scores[last]) / 2;
    }



    /*
     * Determines if each successive value in scores is greater than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */
    public boolean hasImproved() {
        int highestNum = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < highestNum) {
                return false;
            }
            highestNum = scores[i];
        }
        return true;
    }

    /*
     * The method determines if the student has improved and returns the average score
     * appropriately: If the student has improved, returns the average of the top half of the scores
     * array. Otherwise, returns the average of all of the values in scores
     * 
     * @return the double average of test scores
     */

    public double getFinalAverage() {
        double average = 0;
        if (hasImproved()) {
            int index = scores.length / 2;
            while (index != scores.length) {
                double averageOne = getAverage(scores[index], scores[index]);
                average = getAverage((int) averageOne, scores[index]);
                index++;
            }
            return average;
        } else {
            for (int i = 0; i < scores.length - 1; i++) {
                average = getAverage(i, i + 1);
            }
            return average;
        }
    }

}
