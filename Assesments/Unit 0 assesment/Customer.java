public class Customer {
    private String name;
    private String address;
    private int rewardPoints;


    Customer(String name, String address, int rewardPoints) {
        this.name = name;
        this.address = address;
        this.rewardPoints = rewardPoints;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setName(String input) {
        name = input;
    }

    public void setAddress(String input) {
        address = input;
    }

    public void setRewardPoints(int input) {
        rewardPoints = input;
    }

    public String toString() {
        return "Customer Name: " + name + ", Address: " + address + ", Reward Points: "
                + rewardPoints;
    }

    public boolean equals(Customer other) {
        if (name.equals(other.name) && address.equals(other.address)
                && rewardPoints == other.rewardPoints) {
            return true;
        } else {
            return false;
        }
    }

    public void boostPoints(double precentage) {
        rewardPoints = (int) (precentage / 100) * rewardPoints + rewardPoints;
    }
}
