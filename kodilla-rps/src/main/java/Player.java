public class Player {

    private String name;
    private int numberOfWins = 0;
    private InputtingData inputtingData;

    public Player(InputtingData inputtingData) {
        this.inputtingData = inputtingData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void addWin() {
        numberOfWins++;
    }

    public ActionType playerAction() {
        Messages.showAskToPlayerChoice();
        int userChoice = inputtingData.introductionNumber();
        switch (userChoice) {
            case (1):
                return ActionType.ROCK;
            case (2):
                return ActionType.PAPER;
            default:
                return ActionType.SCISSORS;
        }
    }
}
