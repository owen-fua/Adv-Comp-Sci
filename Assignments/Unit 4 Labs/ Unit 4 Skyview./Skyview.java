public class Skyview {
    private double[][] view;

    Skyview(int numberOfRows, int numberOfCols, double[] scanned) {
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

    public boolean equals(Skyview other) {
        for (int i = 0; i < view.length; i++) {
            for (int j = 0; j < view[i].length; j++) {
                if (view[i][j] != other.view[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

