public class Round {

    ActionType playerAction;
    ActionType computerAction;
    private Player player;
    private Computer computer;

    public Round(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
        this.playerAction = player.playerAction();
        this.computerAction = computer.computerAction();
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

    public void result() {
        Result round = checkingWinnerOfRound();
        switch (round) {
            case WIN:
                Messages.showWhenPlayerWin(playerAction, computerAction);
                player.addWin();
                break;
            case LOSE:
                Messages.showWhenPlayerLose(playerAction, computerAction);
                computer.addWin();
                break;
            case TIE:
                Messages.showWhenTie(playerAction, computerAction);
                break;
        }
        Messages.showResultOfGame(player.getNumberOfWins(), computer.getNumberOfWins(), player.getName());
    }
}
