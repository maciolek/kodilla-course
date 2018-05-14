public class Game {

    private Player player1;
    private Player player2;
    private int numberOfWinsPlayer1 = 0;
    private int numberOfWinsPlayer2 = 0;
    private int requiredWins;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public int getNumberOfWinsPlayer1() {
        return numberOfWinsPlayer1;
    }

    public void addWinPlayer1() {
        numberOfWinsPlayer1++;
    }


    public void addWinPlayer2() {
        numberOfWinsPlayer2++;
    }

    public int getNumberOfWinsPlayer2() {
        return numberOfWinsPlayer2;
    }

    public void setRequiredWins(int requiredWins) {
        this.requiredWins = requiredWins;
    }

    public int getRequiredWins() {
        return requiredWins;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
}

