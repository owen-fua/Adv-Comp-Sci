public class LineTester {
    public static void main(String[] args) {
        Point p1 = new Point(2, 7);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(11, 18);
        Point p4 = new Point(4, 13);
        Line pointLine = new Line(p1, p2);
        double calcSlope = pointLine.calculateSlope();
        double calcSlopeFromPoints = pointLine.calculateSlopeFromPoints();
        System.out
                .println("PointLine's slope using calcuate slope is " + pointLine.calculateSlope());
        System.out.println("PointLine's slope using calcuate slope from points is "
                + pointLine.calculateSlopeFromPoints());
        if (calcSlope == calcSlopeFromPoints) {
            System.out.println("The slope and the slope from points are equal");
        } else {
            System.out.println("The slope and the slope from points are not equal");
        }
        System.out.println("Are the points on the line?: ");
        System.out.println(pointLine.isCoordinateOnLine(p1));
        System.out.println(pointLine.isCoordinateOnLine(p2));
        System.out.println(pointLine.isCoordinateOnLine(p3));
        System.out.println(pointLine.isCoordinateOnLine(p4));
        System.out.println("The point slope formula for point line is: ");
        System.out.println(pointLine.generatePointSlopeFormula());
        System.out.println("The slope formula for point line is: ");
        System.out.println(pointLine.toString());

    }
}
