public class BobaShop {
    String shopName;
    BobaShopMember[] registeredMembers;

    BobaShop(String shopName, BobaShopMember[] registeredMembers) {
        this.shopName = shopName;
        this.registeredMembers = registeredMembers;
    }

    BobaShop(String shopName, int initialCapacity) {
        this.shopName = shopName;
        this.registeredMembers = new BobaShopMember[initialCapacity];
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public BobaShopMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public void setRegisteredMembers(BobaShopMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    public boolean isFull() {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        BobaShopMember[] newArray = new BobaShopMember[registeredMembers.length * 2];
        for (int i = 0; i < registeredMembers.length; i++) {
            newArray[i] = registeredMembers[i];
        }
        for (int i = registeredMembers.length; i < newArray.length; i++) {
            newArray[i] = null;
        }
        registeredMembers = newArray;
    }

    public void registerMember(BobaShopMember member) {
        if (isFull()) {
            BobaShopMember[] newArray = new BobaShopMember[registeredMembers.length + 1];
            for (int i = 0; i < registeredMembers.length; i++) {
                newArray[i] = registeredMembers[i];
            }
            newArray[newArray.length - 1] = member;
        } else {
            for (int i = 0; i < registeredMembers.length; i++) {
                if (registeredMembers[i] == null) {
                    registeredMembers[i] = member;
                    return;
                }
            }
        }
    }

    public String toString() {
        String output = "== Boba " + shopName + " Members ==\n";
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] != null) {
                output += i + 1 + ".) " + registeredMembers[i].toString();
                output += "\n";
            }
        }
        return output;
    }

    public boolean deleteMember(BobaShopMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i].equals(member)) {
                registeredMembers[i] = null;
                return true;
            }
        }
        return false;
    }
}
