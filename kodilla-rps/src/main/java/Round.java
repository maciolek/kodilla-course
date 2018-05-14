public class Round {

    private ActionType player1Action;
    private ActionType player2Action;
    private Game game;
    //  ??? nie wiem czy się przyda
    private Result resultOfRound;
    private Player winnerOfRound;


    public Round(Game game) {
        this.player1Action = game.getPlayer1().playerAction();
        this.player2Action = game.getPlayer2().playerAction();
        this.game = game;
    }

    public Result getResultOfRound() {
        if (player1Action == player2Action)
            return this.resultOfRound = Result.TIE;
        switch (player1Action) {
            case ROCK:
                return this.resultOfRound = (player2Action == ActionType.PAPER ? Result.LOSE : Result.WIN);
            case PAPER:
                return this.resultOfRound = (player2Action == ActionType.SCISSORS ? Result.LOSE : Result.WIN);
            case SCISSORS:
                return this.resultOfRound = (player2Action == ActionType.ROCK ? Result.LOSE : Result.WIN);
        }
        return this.resultOfRound = Result.LOSE;
    }

    public void checkingWinnerOfRound() {
        if (getResultOfRound() == Result.WIN) {
            game.addWinPlayer1();
            this.winnerOfRound = game.getPlayer1();
        } else if (getResultOfRound() == Result.LOSE) {
            game.addWinPlayer2();
            this.winnerOfRound = game.getPlayer2();

        }
    }

    public ActionType getPlayer1Action() {
        return player1Action;
    }

    public ActionType getPlayer2Action() {
        return player2Action;
    }

    public Player getWinnerOfRound() {
        return winnerOfRound;
    }
}
