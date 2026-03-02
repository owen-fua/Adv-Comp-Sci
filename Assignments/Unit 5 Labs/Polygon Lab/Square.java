public class Square extends Rectangle {
    Square(double sideLength) {
        super(sideLength, sideLength);
    }

    Square() {
        this(4);
    }

    public String toString() {
        return super.toString() + " It's also a square.";
    }
}
