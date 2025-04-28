public class RockPaperScissors {
    public Integer rockPaperScissors(String player1, String player2) {
        //code here
        player1 = player1.toLowerCase();
        player2 = player2.toLowerCase();

        if(player1.equals(player2)) {
            return 0;
        }

        if (
            (player1.equals("rock") && player2.equals("scissors")) ||
            (player1.equals("scissors") && player2.equals("paper")) ||
            (player1.equals("paper") && player2.equals("rock"))
        ) {
            return 1; // Player 1 wins
        } else {
            return 2; // Player 2 wins
        }
    }
}
