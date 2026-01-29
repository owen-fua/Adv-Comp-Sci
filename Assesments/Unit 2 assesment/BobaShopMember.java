public class BobaShopMember {
    String name;
    boolean[] loyaltyCredits;


    BobaShopMember(String name) {
        this.name = name;
        loyaltyCredits = new boolean[10];
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }


    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    public void grantLoyaltyCredit() {
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == false) {
                loyaltyCredits[i] = true;
                return;
            }
        }
    }

    public int countLoyaltyCredits() {
        int count = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                count++;
            }
        }
        return count;
    }

    public String determineMembershipStatus() {
        int amountOfCredits = countLoyaltyCredits();
        if (amountOfCredits >= 6) {
            return "Gold Member";
        } else if (amountOfCredits >= 3 && amountOfCredits < 6) {
            return "Silver Member";
        } else {
            return "Plus Member";
        }
    }

    public String loyaltyHistory() {
        String output = "[";
        for (int i = 0; i < loyaltyCredits.length - 1; i++) {
            if (loyaltyCredits[i] == true) {
                output += "X, ";
            } else {
                output += "-, ";
            }
        }
        if (loyaltyCredits[loyaltyCredits.length - 1] == true) {
            output += "X";
        } else {
            output += "-";
        }
        return output + "]";
    }

    public String toString() {
        return name + " (" + determineMembershipStatus() + "), Loyalty History: "
                + loyaltyHistory();
    }

    public boolean equals(BobaShopMember other) {
        if (loyaltyCredits.length != other.loyaltyCredits.length) {
            return false;
        }
        for (int i = 0; i < loyaltyCredits.length - 1; i++) {
            if (loyaltyCredits[i] != other.loyaltyCredits[i]) {
                return false;
            }
        }
        return (name.equals(other.name));
    }
}
