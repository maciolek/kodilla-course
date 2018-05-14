public class HumanPlayer implements Player {

    private String name;

    private InputtingData inputtingData;

    public HumanPlayer(InputtingData inputtingData) {
        this.inputtingData = inputtingData;
    }

    public ActionType playerAction() {
        Messages.showAskToPlayerChoice();
        int userChoice = inputtingData.readNumber();
        switch (userChoice) {
            case (1):
                return ActionType.ROCK;
            case (2):
                return ActionType.PAPER;
            case (3):
                return ActionType.SCISSORS;
            //???
            default:
                throw new IllegalArgumentException("Błędny wybór akcji!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
