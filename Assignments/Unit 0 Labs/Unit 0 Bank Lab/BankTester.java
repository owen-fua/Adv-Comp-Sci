public class BankTester {
    public static void main(String[] args) {
        Bank bank1 = new Bank(3, 5); // instantiate a new Bank object

        Bank bank2 = new Bank(4, 5); // instantiate a new Bank object

        System.out.println(bank1.computeTotalEmployees()); // should print 8

        bank2.setNumberOfLoanOfficers(3); // bank2 now has 3 loan officers

        System.out.println(bank1.getNumberOfTellers()); // should print 5

        System.out.println(bank1.equals(bank2)); // should print true

        System.out.println(bank2); // prints "This bank has 3 loan officers
        // and 5 tellers."

        bank1.setNumberOfLoanOfficers(10); // set to 10
        System.out.println(bank1.toString()); // print 10 , 5
        System.out.println(bank1.getEmployeeRatio()); // 10/5 = 2.0


        bank2.fireMembers(4, false);
        // fire 4
        bank1.fireMembers(3, false);
        // fire 3
        System.out.println(bank1.toString());// print
        System.out.println(bank2.toString());

        bank1.transferEmployee(false);
        System.out.println(bank1.toString());

        System.out.println(bank1.calcTotalSalary());
    }
}
