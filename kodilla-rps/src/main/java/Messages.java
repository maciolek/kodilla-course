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

    public static void showResultOfGame(Game game) {
        System.out.println("-------------------------");
        System.out.println("Stan gry: ");
        System.out.println("Wygrane: " + game.getPlayer1().getName().toUpperCase() + ": " + game.getNumberOfWinsPlayer1());
        System.out.println("Wygrane: " + game.getPlayer2().getName().toUpperCase() + ": " + game.getNumberOfWinsPlayer2());
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

    public static void showWhenResultOfRound(Round round) {
        System.out.println("Rundę wygrał: " + round.getWinnerOfRound() +
                " -> " + round.getPlayer1Action() + " beats " + round.getPlayer2Action());
    }

    public static void showWhenTie(Game game) {
        System.out.println("Remis, gracz: " + game.getPlayer1().getName() + " , gracz: " + game.getPlayer2().getName());
    }

    public static void ShowWinerGame(String winnerName) {
        System.out.println("\nZwycięscą gry zostaje: " + winnerName.toUpperCase() + "\n");
    }

}






