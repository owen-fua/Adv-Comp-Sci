public class MatrixFunTester {
    public static void main(String[] args) {
        MatrixFun matrix = new MatrixFun();
        MatrixFun matrix2 = new MatrixFun();
        System.out.println(matrix);
        // to string
        System.out.println(matrix.toString());
        // equals
        System.out.println(matrix.equals(matrix2));
        System.out.println(matrix.equals(matrix));
        // equals
        int[][] matrix4 = {{1, 2, 3}, {4, 5, 6}};
        MatrixFun matrix3 = new MatrixFun(matrix4);
        System.out.println(matrix4.equals(matrix4)); // true
        // replace all
        System.out.println(matrix.toString());
        matrix.replaceAll(1, 9);
        System.out.println(matrix.toString());

        // swap Row
        System.out.println(matrix2.toString());
        matrix2.swapRow(0, 1);
        System.out.println(matrix2.toString());

    }
}
