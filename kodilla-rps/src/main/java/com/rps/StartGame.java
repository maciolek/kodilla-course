package com.rps;

public class StartGame {


    public void start() {
        boolean endGame = false;

        do {
            boolean end;
            UserInputReader userInputReader = new UserInputReader();
            Player player1 = new HumanPlayer(userInputReader);
            Player player2 = new ComputerPlayer();
            Game game = new Game(player1, player2);
            GameProcessor gameProcessor = new GameProcessor(userInputReader, game);
            gameProcessor.startNewGame();
            do {
                Round round = new Round(game);
                gameProcessor.setRound(round);
                gameProcessor.startNewRound();
                end = gameProcessor.checkingRequiredWins();
            } while (!end);
            endGame = gameProcessor.isEndOfGame();

        } while (!endGame);
    }
}


