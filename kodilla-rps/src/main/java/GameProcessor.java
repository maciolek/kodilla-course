public class GameProcessor {

    private Player player1;
    private Player player2;
    private InputtingData inputtingData;
    private int requiredWins;

    public GameProcessor(HumanPlayer player1, ComputerPlayer player2, InputtingData inputtingData) {

        this.player1 = player1;
        this.player2 = player2;
        this.inputtingData = inputtingData;
    }

    //? po co tak? zamiast od razu startingData?
    public void startNewGame() {
        startingData();
    }

    public void setRequiredWins(int requiredWins) {
        this.requiredWins = requiredWins;
    }

    public void startingData() {
        Messages.askToName();
        player1.setName(inputtingData.readText());
        Messages.askToNumbersOfWinsToEnd();
        //sparwadzić jakość liczbę..
        setRequiredWins(inputtingData.readNumber());
    }

    public boolean checkingWinsToEnd() {
        if ((requiredWins == player1.getNumberOfWins()) ||
                (requiredWins == player2.getNumberOfWins())) {
            Messages.ShowWinerGame(getNameOfWinnerGame());
            return true;
        }
        return false;
    }

    public boolean isEndOfGame() {
        Messages.showMesageAfterGame();
        char text = inputtingData.validationUserChoiceAfterGame();
        switch (text) {
            case 'x': {
                Messages.showMessageBeforeEndGame();
                if (inputtingData.validationUserChoiceAfterGame() != 'x') {
                    Messages.showMessageWrongPlayerChoose();
                    isEndOfGame();
                }
                return true;
            }
            case 'n': {
                Messages.showMessageBeforePlayAgain();
                if (inputtingData.validationUserChoiceAfterGame() != 'n') {
                    Messages.showMessageWrongPlayerChoose();
                    isEndOfGame();
                }
                return false;
            }
        }
        return isEndOfGame();
    }

    public String getNameOfWinnerGame() {
        if (requiredWins == player1.getNumberOfWins()) {
            return player1.getName();
        } else {
            return "ComputerPlayer";
        }
    }

    public void resultRound(Round round) {
        Result result = round.checkingWinnerOfRound();
        switch (result) {
            case WIN:
                Messages.showWhenPlayerWin(round.playerAction, round.computerAction);
                player1.addWin();
                break;
            case LOSE:
                Messages.showWhenPlayerLose(round.playerAction, round.computerAction);
                player2.addWin();
                break;
            case TIE:
                Messages.showWhenTie(round.playerAction, round.computerAction);
                break;
        }
        Messages.showResultOfGame(player1.getNumberOfWins(), player2.getNumberOfWins(), player1.getName());
    }
}
