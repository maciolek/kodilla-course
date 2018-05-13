public class Round {

    ActionType playerAction;
    ActionType computerAction;
    private Player humanPlayer;
    private Player computerPlayer;

    public Round(Player humanPlayer, Player computerPlayer) {
        this.humanPlayer = humanPlayer;
        this.computerPlayer = computerPlayer;
        this.playerAction = humanPlayer.playerAction();
        this.computerAction = computerPlayer.playerAction();
    }

    public Result checkingWinnerOfRound() {
        if (playerAction == computerAction)
            return Result.TIE;
        switch (playerAction) {
            case ROCK:
                return (computerAction == ActionType.PAPER ? Result.LOSE : Result.WIN);
            case PAPER:
                return (computerAction == ActionType.SCISSORS ? Result.LOSE : Result.WIN);
            case SCISSORS:
                return (computerAction == ActionType.ROCK ? Result.LOSE : Result.WIN);
        }
        return Result.LOSE;
    }
}
