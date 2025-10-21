public class TriangleLoopsTester {
    public static void main(String[] args) {
        // letter triangle up
        System.out.println("Letter triangle up:");
        System.out.println(TriangleLoops.createLetterTriangleUp(3, 'A'));
        System.out.println(TriangleLoops.createLetterTriangleUp(5, 'B'));
        // letter triangle down
        System.out.println("Letter triangle down:");
        System.out.println(TriangleLoops.createLetterTriangleDown(3, 'A'));
        System.out.println(TriangleLoops.createLetterTriangleDown(5, 'B'));
        // numbers triangle
        System.out.println("Numbers Triangle:");
        System.out.println(TriangleLoops.createNumbersTriangle(4));
        System.out.println(TriangleLoops.createNumbersTriangle(3));
        // Alphabet Triangle
        System.out.println("Alphabet Triangle");
        System.out.println(TriangleLoops.createAlphabetTriangle(5));
        System.out.println(TriangleLoops.createAlphabetTriangle(7));
        // edge case
        System.out.println(TriangleLoops.createLetterTriangleUp(-3, 'B'));

    }
}
