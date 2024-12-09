//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println("Tim managed to get into position 2 on the high score list");
    }

    public static int highScorePosition(int playerScore) {
        if(playerScore >= 1000 ) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}