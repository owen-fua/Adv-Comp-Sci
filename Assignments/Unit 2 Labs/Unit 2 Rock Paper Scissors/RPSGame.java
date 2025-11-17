import java.util.Scanner;

public class RPSGame {
    Scanner keyboard = new Scanner(System.in);
    // instance variables
    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public void start() {
        String input = keyboard.next().toLowerCase();
        int count = 0;
        while (input.equals("rock") == false && input.equals("scissors") == false
                && input.equals("paper") == false) {
            System.out.println("Error, please put rock, paper, or scissors. ");
            input = keyboard.next().toLowerCase();
            count += 1;
            if (count == 3) {
                input = generateRandomChoice();
            }
        }
        setPlayerValues(player.name, input);
    }

    public void setPlayerValues(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);
    }

    public boolean didPlayerWin() {
        if (player.choice.equals("paper") && opponent.choice.equals("rock")) {
            return true;
        }
        if (player.choice.equals("rock") && opponent.choice.equals("scissors")) {
            return true;
        }
        if (player.choice.equals("scissors") && opponent.choice.equals("paper")) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (didPlayerWin() == false) {
            return "Opponent won!\nBetter luck next time!";
        } else {
            return player.name + " won!\nCongratulations!";
        }
    }

    public String displayResults() {
        String p1 = "== GAME RESULTS ==\n" + player.name + " chose " + player.choice;
        String p2 = "\nOpponent chose " + opponent.choice + ".\n" + toString();
        return p1 + p2;
    }

    public static boolean validateChoice(String choice) {
        return (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors"));
    }

    public static String generateRandomChoice() {
        int randomNum = (int) Math.random() * 3 + 1;
        if (randomNum == 1) {
            return "rock";
        } else if (randomNum == 2) {
            return "paper";
        } else {
            return "scissors";
        }
    }
}

