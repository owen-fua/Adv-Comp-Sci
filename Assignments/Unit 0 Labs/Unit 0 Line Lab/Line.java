public class Line {
    // instance variables
    private int a;
    private int b;
    private int c;

    // constructor
    Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // getters and setters
    public int getA() {
        return a;
    }


    public int getB() {
        return b;
    }


    public int getC() {
        return c;
    }

    public void setA(int input) {
        a = input;
    }

    public void setB(int input) {
        b = input;
    }

    // methods
    // slope
    public double calculateSlope() {
        return (double) -a / b;
    }

    // cord on line?
    public boolean isCoordinateOnLine(int x, int y) {
        if (a * x + b * y + c == 0) {
            return true;
        } else {
            return false;
        }
    }

    // to string
    public String toString() {
        return a + "x + " + b + "y + " + c + " = 0";
    }
}
