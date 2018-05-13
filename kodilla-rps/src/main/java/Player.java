public interface Player {

    public String getName();

    public void setName(String name);

    public int getNumberOfWins();

    public void addWin();

    public ActionType playerAction();
}
