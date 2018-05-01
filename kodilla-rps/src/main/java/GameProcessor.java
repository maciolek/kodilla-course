public class GameProcessor {

    private Player player;
    private Computer computer;
    private InputtingData inputtingData;
    private int winsToEnd;

    public GameProcessor(Player player, Computer computer, InputtingData inputtingData) {

        this.player = player;
        this.computer = computer;
        this.inputtingData = inputtingData;
    }

    public void startNewGame() {
        startingData();
    }

    public void setWinsToEnd(int winsToEnd) {
        this.winsToEnd = winsToEnd;
    }

    public void startingData() {
        Messages.askToName();
        player.setName(inputtingData.introduceText());
        Messages.askToNumbersOfWinsToEnd();
        setWinsToEnd(inputtingData.introductionNumber());
    }

    public boolean checkingWinsToEnd() {
        if ((winsToEnd == player.getNumberOfWins()) ||
                (winsToEnd == computer.getNumberOfWins())) {
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
        if (winsToEnd == player.getNumberOfWins()) {
            return player.getName();
        } else {
            return "Komputer";
        }
    }
}
