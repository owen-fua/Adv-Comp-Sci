public class Rectangle {
    int length;
    int width;

    public Rectangle(int newLength, int newWidth) {    
        newLength = 5;
        newWidth = 6;
    }   

    public Rectangle() {
        length = 4;
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
        return "This rectangle has a length of " + length + " and a width of " + width + ". It's area is " + length * width;
    }

    public boolean equals(Rectangle rect1, Rectangle rect2) {
        if (rect1.length == rect2.length && rect1.width == rect2.width) {
            return true;
        } else {
            return false;
        }


}
}