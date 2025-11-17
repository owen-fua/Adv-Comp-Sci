public class Cat {
    String name;
    String ownerName;
    int moodLevel;
    String catId;
    char catChar;
    boolean isHungry;

    Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
        this.catId = PurrfectUtils.validateCatId(catId);
        this.catChar = PurrfectUtils.generateCatChar(catId);
        this.isHungry = true;
    }

    Cat() {
        this.name = "Morgan";
        this.ownerName = "Justin";
        this.moodLevel = 6;
        this.catId = "1234";
        this.catChar = PurrfectUtils.generateCatChar(catId);
        this.isHungry = true;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) { // com back
        this.catId = PurrfectUtils.validateCatId(catId);
        setCatChar(PurrfectUtils.generateCatChar(catId));
        generateCatTag();
    }

    public char getCatChar() {
        return catChar;
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public String generateCatTag() {
        return catId + catChar;
    }

    public String toString() {
        String p1 = "== ABOUT " + name.toUpperCase() + " ==\n" + name + " is a cat.";
        String p2 =
                "\nTheir tag is " + generateCatTag() + ". " + PurrfectUtils.determineCatMood(this);
        return p1 + p2;
    }

    public boolean equals(Cat other) {
        if (name.equals(other.name) && ownerName.equals(other.ownerName)
                && moodLevel == other.moodLevel && generateCatTag().equals(other.generateCatTag())
                && isHungry == other.isHungry) {
            return true;
        } else {
            return false;
        }
    }
}
