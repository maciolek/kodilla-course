import java.util.Random;

public class Computer {

    private int numberOfWins = 0;

    public ActionType computerAction() {
        ActionType[] actionTypes = ActionType.values();
        Random random = new Random();
        int computerChoice = random.nextInt(actionTypes.length);
        return actionTypes[computerChoice];
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void addWin() {
        numberOfWins++;
    }
}
