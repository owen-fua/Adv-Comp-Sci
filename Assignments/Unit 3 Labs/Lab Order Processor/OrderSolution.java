public class OrderSolution {
    public static int itemTotal(Item[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            double price = array[i].getPrice();
            int quantity = array[i].getQuantity();
            sum += price * quantity;
        }
        return sum;
    }

    public static String[] isExpensive(Item[] array) {
        String[] expensiveItemsTemp = new String[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getPrice() > 50.0) {
                expensiveItemsTemp[index] = array[i].getName();
                System.out.println(
                        array[i].getName() + " is a premium item at $" + array[i].getPrice());
                index++;
            } else {
                System.out.println(
                        array[i].getName() + " is a regular item at $" + array[i].getPrice());
            }
        }
        return expensiveItemsTemp;
    }

    // System.out.println(
    // array[i].getName() + " is a premium item at $" + array[i].getPrice());
    // System.out.println(
    // array[i].getName() + " is a regular item at $" + array[i].getPrice());
    public static int premiumCount(Item[] array) {
        int premiumCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getPrice() > 50.0) {
                premiumCount += 1;
            }
        }
        return premiumCount;
    }

    public static void trimPremiumItems(int premiumCount, String[] expensiveItemsTemp) {
        String[] expensiveItems = new String[premiumCount];
        for (int i = 0; i < premiumCount; i++) {
            expensiveItems[i] = expensiveItemsTemp[i];
        }
    }

    public static double calcTax(int subtotal, double taxRate) {
        double tax;
        if (subtotal > 0) {
            tax = subtotal * taxRate;
        } else {
            tax = 0;
        }
        return tax;
    }

    public static double calcTotal(int subtotal, double tax) {
        double total;
        if (subtotal > 0) {
            total = subtotal + tax;
        } else {
            total = 0;
        }
        return total;
    }

    public static void toString(int subtotal, double tax, double total, int premiumCount) {
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);

    }
}
