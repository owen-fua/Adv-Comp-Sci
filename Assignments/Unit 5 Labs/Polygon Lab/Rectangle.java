public class Rectangle extends Polygon {
    protected double length;
    protected double width;

    Rectangle(double width, double length) {
        super(4);
        this.width = width;
        this.length = length;
    }

    Rectangle() {
        this(3, 4);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * length;
    }

    public String toString() {
        return super.toString() + "\nIt is a rectangle with a length of " + length
                + " and width of " + width + ". Its area is " + getArea() + ".";
    }
}
