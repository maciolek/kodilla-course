import java.util.Random;

public class ComputerPlayer implements Player {

    private int numberOfWins = 0;
    private String name = "Computer";

    private Random random = new Random();

    public ActionType playerAction() {
        ActionType[] actionTypes = ActionType.values();
        int computerChoice = random.nextInt(actionTypes.length);
        return actionTypes[computerChoice];
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void addWin() {
        numberOfWins++;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = "Computer";
    }
}
