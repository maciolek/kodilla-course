public class RpsRunner {

    public static void main(String[] args) {
        boolean endGame = false;

        do {
            boolean end;

            InputtingData inputtingData = new InputtingData();
            Player player = new Player(inputtingData);
            Computer computer = new Computer();
            GameProcessor gameProcessor = new GameProcessor(player, computer, inputtingData);
            gameProcessor.startNewGame();

            do {
                Round round = new Round(player, computer);
                round.result();
                end = gameProcessor.checkingWinsToEnd();

            } while (!end);
            endGame = gameProcessor.isEndOfGame();

        } while (!endGame);
    }
}