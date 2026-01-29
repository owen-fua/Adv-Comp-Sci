public class OrderProcessor {

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        int subtotal = OrderSolution.itemTotal(items);
        String[] expensiveItems = OrderSolution.isExpensive(items);
        int premiumCount = OrderSolution.premiumCount(items);
        OrderSolution.trimPremiumItems(premiumCount, expensiveItems);
        double tax = OrderSolution.calcTax(subtotal, taxRate);
        double total = OrderSolution.calcTotal(subtotal, tax);
        OrderSolution.toString(subtotal, tax, total, premiumCount);
        return new OrderSummary(total, subtotal, tax, expensiveItems);
    }
}
