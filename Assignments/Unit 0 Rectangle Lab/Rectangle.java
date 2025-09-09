public class Rectangle {
    int length;
    int width;

    public Rectangle(int newLength, int newWidth) {
        newLength = 5;
        newWidth = 6;
    }

    public Rectangle() {
        length = 3;
        width = 4;
    }

    // getters and setters
    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int input) {
        length = input;
    }

    public void setWidth(int input) {
        width = input;
    }

    public String toString() {
        return "This rectangle has a length of " + length + " and a width of " + width
                + ". It's area is " + length * width + ". It's Perimeter is " + 2 * (length + width) + ". It's diagonal is " + Math.sqrt(length * length + width * width);
    }

    public boolean equals(Rectangle other) {
        if (length == other.length && width == other.width) {
            return true;
        } else {
            return false;
        }
    }

    public int calculateArea() {
        return length * width;
    }

    public int calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateDiagonal() {
        return Math.sqrt(length * length + width * width);
    }

    }

