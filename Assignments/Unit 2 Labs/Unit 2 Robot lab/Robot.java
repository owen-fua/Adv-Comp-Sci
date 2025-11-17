public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public Robot(int[] hallwayToClean, int startingPosition) {
        if (hallwayToClean == null || hallwayToClean.length == 0) {
            this.hallway = new int[1];
            this.position = 0;
        } else {
            this.hallway = new int[hallwayToClean.length];
            for (int i = 0; i < hallwayToClean.length; i++) {
                this.hallway[i] = hallwayToClean[i] < 0 ? 0 : hallwayToClean[i];
            }

            if (startingPosition < 0) {
                this.position = 0;
            } else if (startingPosition >= this.hallway.length) {
                this.position = this.hallway.length - 1;
            } else {
                this.position = startingPosition;
            }
        }

        this.isFacingRight = true;
    }

    public int[] getHallway() {
        return hallway;
    }


    public void setHallway(int[] hallway) {
        this.hallway = new int[hallway.length];
        for (int i = 0; i < hallway.length; i++) {
            this.hallway[i] = hallway[i] < 0 ? 0 : hallway[i];
        }
    }


    public int getPosition() {
        return position;
    }


    public void setPosition(int position) {
        if (position >= 0 && position < hallway.length) {
            this.position = position;
        }
    }


    public boolean isFacingRight() {
        return isFacingRight;
    }


    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }


    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        // to-do: implement this method
        return (isFacingRight && position == hallway.length - 1)
                || (!isFacingRight && position == 0);
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        if (hallway[position] > 0) {
            hallway[position]--;
            if (hallway[position] > 0) {
                return;
            }
        }
        if (isRobotBlockedByWall()) {
            turnAround();
        } else {
            moveForward();
        }
    }


    private void turnAround() {
        isFacingRight = !isFacingRight;
    }

    private void moveForward() {
        if (isFacingRight) {
            position += 1;
        } else {
            position -= 1;
        }
    }

    // to-do: implement this method



    /**
     * This method displays the current state of the robot and the hallway. It then calls the move()
     * method and counts the number of moves it takes to clear the hallway. The method should
     * display the current state of the robot after each move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        displayState();
        while (!hallIsClear()) {
            move();
            count++;
            displayState();
        }
        // to-do: implement this method

        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        for (int i = 0; i < hallway.length; i++) {
            System.out.print(hallway[i] + " ");
        }
        String message = "\n";
        if (isFacingRight == true) {
            for (int i = 0; i < position; i++) {
                message += "  ";
            }
            System.out.println(message + ">");
        } else {
            for (int i = 0; i < position; i++) {
                message += "  ";
            }
            System.out.println(message + "<");

            // to-do: implement this method

        }
    }
}
