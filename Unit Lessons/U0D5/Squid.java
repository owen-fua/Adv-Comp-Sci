public class Squid {
    private int tentacleCount;
    private double inkMeter;
    private String funFact;

    // constructor
    // default constructor
    public Squid() {
        tentacleCount = 10;
        inkMeter = 100.0;
        funFact = "you can use pieces of squid as fish bait!";
    }

    // getters
    public int getTentacleCount() {
        return tentacleCount;
    }

    // setters
    public void setTentacleCount(int value) {
        tentacleCount = value;
    }

    // a built in method that returns all of the avlues of an object in a nice sentence
    public String toString() {
        return "This is a squid. It has " + tentacleCount
                + "tentacles, and it's current ink level is" + inkMeter
                + ". Also, did you know that " + funFact;
    }

    public boolean equals(Squid other) {
        return tentacleCount == other.tentacleCount && inkMeter == other.inkMeter
                && funFact.equals(other.funFact);


    }
}
