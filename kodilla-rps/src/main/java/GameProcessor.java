public class GameProcessor {


    private InputtingData inputtingData;
    private Game game;
    private Round round;

    public GameProcessor(InputtingData inputtingData, Game game) {

        this.inputtingData = inputtingData;
        this.game = game;
    }

    public void startNewGame() {
        Messages.askToName();
        game.getPlayer1().setName(inputtingData.readText());
        Messages.askToNumbersOfWinsToEnd();
        //sparwadzić jakość liczbę..
        game.setRequiredWins(inputtingData.readNumber());
    }

    public void startNewRound() {
        round.getResultOfRound();
        round.checkingWinnerOfRound();
        showResultOfRound();
        Messages.showResultOfGame(game);

    }

    private void showResultOfRound() {
        if (round.getResultOfRound() == Result.TIE) {
            Messages.showWhenTie(game);
        } else {
            Messages.showWhenResultOfRound(round);
        }

    }

    public boolean checkingWinsToEnd() {
        if ((game.getRequiredWins() == game.getNumberOfWinsPlayer1()) ||
                (game.getRequiredWins() == game.getNumberOfWinsPlayer2())) {
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
        if (game.getRequiredWins() == game.getNumberOfWinsPlayer1()) {
            return game.getPlayer1().getName();
        } else {
            return game.getPlayer2().getName();
        }
    }

    public void setRound(Round round) {
        this.round = round;
    }


}
