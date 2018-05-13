public class RpsRunner {

    public static void main(String[] args) {
        boolean endGame = false;

        do {
            boolean end;

            InputtingData inputtingData = new InputtingData();
            HumanPlayer humanPlayer = new HumanPlayer(inputtingData);
            ComputerPlayer computerPlayer = new ComputerPlayer();
            GameProcessor gameProcessor = new GameProcessor(humanPlayer, computerPlayer, inputtingData);
            gameProcessor.startNewGame();

            do {
                Round round = new Round(humanPlayer, computerPlayer);
                gameProcessor.resultRound(round);
                end = gameProcessor.checkingWinsToEnd();

            } while (!end);
            endGame = gameProcessor.isEndOfGame();

        } while (!endGame);
    }
}