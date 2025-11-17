public class Car {
    // instance variables
    String model;
    String ownerName;
    String username;
    int cleanlinessLevel;
    boolean needsOilChange;

    // constructors
    Car(String model, String ownerName, int cleanlinessLevel) {
        this.model = model;
        this.ownerName = AutoUtils.fixName(ownerName);
        this.username = AutoUtils.generateUsername(ownerName);
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.needsOilChange = false;
    }

    Car() {
        this.model = "Honda";
        this.ownerName = "Owen Fua";
        this.username = AutoUtils.generateUsername(ownerName);
        this.cleanlinessLevel = 10;
        this.needsOilChange = false;
    }

    // getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = AutoUtils.fixName(ownerName);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public boolean isNeedsOilChange() {
        return needsOilChange;
    }

    public void setNeedsOilChange(boolean needsOilChange) {
        this.needsOilChange = needsOilChange;
    }

    // methods
    public String toString() {
        String part1 = "== ABOUT CAR ==";
        String part2 = "\nModel: " + model + "\nOwner: " + ownerName + "\nUsername: " + username;
        String part3 = "\nCleanlinessLevel: " + cleanlinessLevel + "\nDoes car need oil change? ";
        if (needsOilChange) {
            part3 += "Yes";
        } else {
            part3 += "No";
        }
        return part1 + part2 + part3;
    }

    public boolean equals(Car other) {
        if (model.equals(other.model) && ownerName.equals(other.ownerName)
                && username.equals(other.username) && cleanlinessLevel == other.cleanlinessLevel
                && needsOilChange == other.needsOilChange) {
            return true;
        } else {
            return false;
        }
    }

}
