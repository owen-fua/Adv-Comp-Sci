public class Line {
    // instance variables
    private int a;
    private int b;
    private int c;
    private Point p1;
    private Point p2;

    // constructor
    Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        // instance variables a, b, and c
        // a = - (y2 - y1)
        this.a = -(p2.getY() - p1.getY());

        // b = x2 - x1
        this.b = p2.getX() - p1.getX();

        // c = - (a * x1 + b * y1)
        this.c = -(this.a * p1.getX() + p1.getY() * this.b);
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

    public void setC(int c) {
        this.c = c;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    // methods
    // slope
    public double calculateSlope() {
        return (double) -a / b;
    }

    // cord on line?
    public boolean isCoordinateOnLine(Point p) {
        int x = p.getX();
        int y = p.getY();
        if (a * x + b * y + c == 0) {
            return true;
        } else {
            return false;
        }
    }

    public double calculateSlopeFromPoints() {
        return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }

    public String generatePointSlopeFormula() {
        return "(y - " + p1.getY() + ") = " + calculateSlopeFromPoints() + "(x - " + p1.getX()
                + ")";
    }

    // to string
    public String toString() {
        return a + "x + " + b + "y + " + c + " = 0";
    }
}
