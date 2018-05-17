package com.rps;

public class GameProcessor {

    private UserInputReader userInputReader;
    private Game game;
    private Round round;

    public GameProcessor(UserInputReader userInputReader, Game game) {

        this.userInputReader = userInputReader;
        this.game = game;
    }

    public void startNewGame() {
        Messages.askToName();
        game.getPlayer1().setName(userInputReader.readText());
        Messages.askToNumbersOfWinsToEnd();
        game.setRequiredWins(userInputReader.readNumber());
    }

    public void startNewRound() {
        round.getResultOfRound();
        round.checkingWinnerOfRound();
        showResultOfRound();
        Messages.showResultOfGame(game.getPlayer1().getName(), game.getPlayer2().getName(),
                game.getNumberOfWinsPlayer1(), game.getNumberOfWinsPlayer2());
    }

    private void showResultOfRound() {
        Player winnerOfRound = round.getWinnerOfRound();
        if (winnerOfRound == null) {
            Messages.showWhenTie(game.getNumberOfround(), round.getPlayer1Action(), round.getPlayer2Action());
        }
        else if (winnerOfRound == game.getPlayer1()) {
            Messages.showWhenResultOfRound(game.getNumberOfround(), round.getWinnerOfRound().getName(),
                    round.getPlayer1Action(), round.getPlayer2Action());
        } else {
            Messages.showWhenResultOfRound(game.getNumberOfround(), round.getWinnerOfRound().getName(),
                    round.getPlayer2Action(), round.getPlayer1Action());
        }
    }

    public boolean checkingRequiredWins() {
        if ((game.getRequiredWins() == game.getNumberOfWinsPlayer1()) ||
                (game.getRequiredWins() == game.getNumberOfWinsPlayer2())) {
            Messages.ShowWinerGame(getNameOfWinnerGame());
            return true;
        }
        return false;
    }

    public boolean isEndOfGame() {
        Messages.showMesageAfterGame();
        char text = userInputReader.validationUserChoiceAfterGame();
        switch (text) {
            case 'x': {
                Messages.showMessageBeforeEndGame();
                if (userInputReader.validationUserChoiceAfterGame() != 'x') {
                    Messages.showMessageWrongPlayerChoose();
                    isEndOfGame();
                }
                return true;
            }
            case 'n': {
                Messages.showMessageBeforePlayAgain();
                if (userInputReader.validationUserChoiceAfterGame() != 'n') {
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
