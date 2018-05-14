public class RpsRunner {

    public static void main(String[] args) {
        boolean endGame = false;

        do {
            boolean end;

            InputtingData inputtingData = new InputtingData();
            Player player1 = new HumanPlayer(inputtingData);
            Player player2 = new ComputerPlayer();
            Game game = new Game(player1,player2);
            GameProcessor gameProcessor = new GameProcessor(inputtingData, game);
            gameProcessor.startNewGame();

            do {
                Round round = new Round(game);
                gameProcessor.setRound(round);
                gameProcessor.startNewRound();
                end = gameProcessor.checkingWinsToEnd();

            } while (!end);
            endGame = gameProcessor.isEndOfGame();

        } while (!endGame);
    }
}