public class Messages {

    public static void chooseLanguage() {
        System.out.println("Wybierz język/Chooce language:");
        System.out.println("1 - polski / 2 - angielski");
    }

    public static void askToName() {
        System.out.println("Podaj swoje imię");
    }

    public static void askToNumbersOfWinsToEnd() {
        System.out.println("Do ilu zwycięstw gramy?");
    }

    public static void showMesageAfterGame() {
        System.out.println("Co robimy dalej? ");
        System.out.println("klawisz x - zakończenie gry");
        System.out.println("klawisz n - uruchomienie gry od nowa");
    }

    public static void showMessageBeforePlayAgain() {
        System.out.println("Czy na pewno rozpocząć nową grę? (naciśnij N)");
    }

    public static void showMessageBeforeEndGame() {
        System.out.println("Czy na pewno chcesz wyjść z gry? (naciśnij X)");
    }

    public static void showResultOfGame(int playerWins, int computerWins, String playerName) {
        System.out.println("-------------------------");
        System.out.println("Stan gry: ");
        System.out.println("Wygrane: " + playerName.toUpperCase() + ": " + playerWins);
        System.out.println("Wygrane komputera: " + computerWins);
    }

    public static void showMessageWrongPlayerChoose() {
        System.out.println("Błędny wybór, wybierz jeszcze raz\n");
    }

    public static void showAskToPlayerChoice() {
        System.out.println("\n----------- NOWA RUNDA------------");
        System.out.println("Dokonaj wyboru: ");
        System.out.println("klawisz 1 - zagranie \"kamień\"");
        System.out.println("klawisz 2 - zagranie \"papier\"");
        System.out.println("klawisz 3 - zagranie \"nożyce\"");
    }

    public static void showWhenPlayerWin(ActionType playerAction, ActionType computerAction) {
        System.out.println("Gracz wygrał " + playerAction + " bije " + computerAction);
    }

    public static void showWhenPlayerLose(ActionType playerAction, ActionType computerAction) {
        System.out.println("Komputer wygrał, " + playerAction + " przegrywa z  " + computerAction);
    }

    public static void showWhenTie(ActionType playerAction, ActionType computerAction) {
        System.out.println("Remis, gracz: " + playerAction + " , komputer " + computerAction);
    }

    public static void ShowWinerGame(String winnerName) {
        System.out.println("\nZwycięscą gry zostaje: " + winnerName.toUpperCase() + "\n");
    }

}






