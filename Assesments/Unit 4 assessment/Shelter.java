import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Invalid parameters");
        }
        this.kennels = new Dog[rows][cols];
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[i].length; j++) {
                if (kennels[i][j] == null) {
                    kennels[i][j] = animal;
                    return;
                }
            }
        }
        System.out.println("No empty kennels.");

    }


    public void add(Dog animal, int row, int col) {
        if (animal == null) {
            throw new IllegalArgumentException("animal is null");
        }
        if (row < 0 || col < 0 || row >= kennels.length || col >= kennels[0].length) {
            throw new IllegalArgumentException("Invalid parameters");
        }
        if (kennels[row][col] == null) {
            kennels[row][col] = animal;
        } else {
            add(animal);
        }
        // to-do: implement this method
    }



    public void add(ArrayList<Dog> animals) {
        for (Dog animal : animals) {
            add(animal);
        }
    }

    public Dog adopt(int row, int col) {
        if (row < 0 || col < 0 || row >= kennels.length || col >= kennels[0].length) {
            throw new IllegalArgumentException("Invalid parameters");
        }
        if (kennels[row][col] == null) {
            throw new IllegalArgumentException("There is no dog at specified cords.");
        }
        Dog dog = kennels[row][col];
        kennels[row][col] = null;
        return dog;

    }

    public ArrayList<Dog> search(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        ArrayList<Dog> output = new ArrayList<Dog>();
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[i].length; j++) {
                if (kennels[i][j] != null && kennels[i][j].getName().equals(name)) {
                    output.add(kennels[i][j]);
                }
            }
        }
        return output;
    }

    public ArrayList<Dog> search(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age cannot be negative");
        }
        ArrayList<Dog> output = new ArrayList<Dog>();
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[i].length; j++) {
                if (kennels[i][j] != null && kennels[i][j].getAge() == age) {
                    output.add(kennels[i][j]);
                }
            }
        }
        return output;

    }
}
