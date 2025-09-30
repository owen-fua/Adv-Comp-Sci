public class Bank {
    // instance variables
    int numberOfTellers;
    int numberOfLoanOfficers;

    // constructors
    Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    // getters and setters
    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    // methods
    public int computeTotalEmployees() {
        return numberOfLoanOfficers + numberOfTellers;
    }

    public String toString() {
        return "This bank has " + numberOfLoanOfficers + " Loan Officers and " + numberOfTellers
                + " Tellers.";
    }

    public boolean equals(Bank other) {
        if (numberOfLoanOfficers == other.numberOfLoanOfficers
                && numberOfTellers == other.numberOfTellers) {
            return true;
        } else {
            return false;
        }
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers += numberToHire;
        } else {
            numberOfTellers += numberToHire;
        }
    }
    // challenge

    public double getEmployeeRatio() {
        return (double) numberOfLoanOfficers / numberOfTellers;
    }

    public void fireMembers(int numberToFire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers -= numberToFire;
            if (numberOfLoanOfficers < 0) {
                numberOfLoanOfficers = 0;
            }
        } else {
            numberOfTellers -= numberToFire;
            if (numberOfTellers < 0) {
                numberOfTellers = 0;
            }
        }
    }

    public void transferEmployee(boolean fromLoanOfficer) {
        if (fromLoanOfficer) {
            numberOfLoanOfficers -= 1;
            numberOfTellers += 1;
        } else {
            numberOfLoanOfficers += 1;
            numberOfTellers -= 1;
        }
    }

    public int calcTotalSalary() {
        return numberOfLoanOfficers * 75000 + numberOfTellers * 45000;
    }
}
