public class Player {
    String name;
    String choice;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        String lowerChoice = choice.toLowerCase();
        if (RPSGame.validateChoice(lowerChoice) == false) {
            this.choice = RPSGame.generateRandomChoice();
        } else {
            this.choice = lowerChoice;
        }
    }

    public String toString() {
        return name + " chose " + choice + ".";
    }
}
