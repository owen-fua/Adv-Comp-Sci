public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println(rect.toString());

        Rectangle rect2 = new Rectangle(4, 3);
        System.out.println("Are the rectangles equal? " + rect.equals(rect2));


        rect2.setLength(9);
        rect2.setWidth(5);
        System.out.println(rect2.toString());

        rect.setLength(6);
        rect.setWidth(8);
        System.out.println(rect.toString());
        
    }
}
