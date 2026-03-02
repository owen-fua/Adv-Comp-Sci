class MatrixFun {
    private int[][] matrix;


    MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException("Rows and Cols must be positive");
        }
        this.matrix = new int[numberOfRows][numberOfCols];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfCols; j++) {
                matrix[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
    }

    MatrixFun(int[][] starterMatrix) {
        if (starterMatrix == null) {
            throw new NullPointerException("Starter matrix can't be null");
        }
        this.matrix = starterMatrix;
    }

    MatrixFun() {
        this(3, 3);
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new NullPointerException("Matrix can't be null");
        }
        this.matrix = matrix;
    }

    @Override
    public String toString() {
        String output = "" + "=".repeat(matrix[0].length * 2 - 1) + "\n";

        for (int[] row : matrix) {
            for (int cell : row) {
                output += cell + " ";
            }
            output += "\n";
        }
        output += "" + "=".repeat(matrix[0].length * 2 - 1);
        return output;
    }

    public boolean equals(MatrixFun other) {
        return (this.toString().equals(other.toString()));
    }

    public boolean equals(int[][] otherMatrix) {
        MatrixFun other = new MatrixFun(otherMatrix);
        return (this.toString().equals(other.toString()));
    }

    public void replaceAll(int oldValue, int newValue) {
        if (oldValue > 9 || oldValue < 1 || newValue < 1 || newValue > 9) {
            throw new IllegalArgumentException("Old and new values must be between 1 and 9");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == oldValue) {
                    matrix[i][j] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        if (rowA < 0 || rowB < 0 || rowA >= matrix.length || rowB >= matrix.length) {
            throw new IllegalArgumentException("Rows A and B must be positive");
        }
        int[] placeholder = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = placeholder;
    }
}
