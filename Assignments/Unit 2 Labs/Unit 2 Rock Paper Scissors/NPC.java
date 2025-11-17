public class NPC {
    String choice;

    NPC() {
        this.choice = RPSGame.generateRandomChoice();
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
        return "Opponent chose " + choice + ".";
    }

}
