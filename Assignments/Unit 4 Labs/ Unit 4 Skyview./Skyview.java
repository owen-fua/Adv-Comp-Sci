public class SkyView {
    private double[][] view;

    SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        if (numberOfCols * numberOfRows < scanned.length) {
            throw new IllegalArgumentException("Matrix too small");
        }
        this.view = new double[numberOfRows][numberOfCols];
        int index = 0;
        for (int i = 0; i < numberOfRows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < numberOfCols; j++) {
                    view[i][j] = scanned[index];
                    index++;
                }
            } else {
                for (int j = numberOfCols - 1; j >= 0; j--) {
                    view[i][j] = scanned[index];
                    index++;
                }
            }


        }
    }

    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }


    public String toString() {
        String output = "";
        for (int i = 0; i < view.length; i++) {
            for (int j = 0; j < view[0].length; j++) {
                output += view[i][j] + " ";
            }
            output += "\n";
        }
        return output;
    }

    public boolean equals(SkyView other) {
        for (int i = 0; i < view.length; i++) {
            for (int j = 0; j < view[i].length; j++) {
                if (view[i][j] != other.view[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }



    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        if (startRow > endRow || startCol > endCol) {
            throw new IllegalArgumentException("Start values must be less then end values");
        }
        double output = 0;
        int count = 0;
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                output += view[i][j];
                count++;
            }
        }
        return output / count;
    }


}
