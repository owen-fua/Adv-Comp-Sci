// camel case -> a way to write variable names, and it's a standard,
// first letter is lowercase if it's a variable name 
// otherwise captial for class names

// a class is just a blueprint for a data type
// -> it's not the object itself, but rather a plan 
public class Spaceship {


    // instance variables
    private String description;

    private int passengerCount;

    private double fuelLevel;

    private boolean shieldsActive;
    // constructors
    public Spaceship(String inputdescription, int inputpassengerCount, double inputFuelLevel, boolean inputShieldsActive) { 
        description = inputdescription;
        passengerCount = inputpassengerCount;
        fuelLevel = inputFuelLevel;
        shieldsActive = inputShieldsActive;
    }

    // methods 
    // getters (aka accessors)
    public String getDescription() {
        return description;
    }
    public int getPassengerCount() {
        return passengerCount;
    }
    public double getFuelLevel() {
        return fuelLevel;
    }
    public boolean getShieldsActive() {
        return shieldsActive;
    }
    // setters
    public void setDescription(String input) {
        description = input;
    }
    public void setPassengerCount(int input) {
        passengerCount = input;
    }
    public void setFuelLevel(double input) {
        fuelLevel = input;
    }
    public void setShiedldsActive(boolean input) {
        shieldsActive = input;
    }


    // challenge: use 3 setters to update the value of 3 different instance variales, make sure to print before and after update. 

}