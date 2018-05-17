package com.rps;

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

    public static void showResultOfGame(String namePlayer1, String namePlayer2,
                                        int numberOfWinsPlayer1,int numberOfWinsPlayer2) {
        System.out.println("---------------------------------------------------------------");
        System.out.println("Stan gry: ");
        System.out.println("Wygrane: " + namePlayer1.toUpperCase() + ": " + numberOfWinsPlayer1);
        System.out.println("Wygrane: " + namePlayer2.toUpperCase() + ": " + numberOfWinsPlayer2);
        System.out.println("---------------------------------------------------------------");

    }

    public static void showMessageWrongPlayerChoose() {
        System.out.println("Błędny wybór, wybierz jeszcze raz\n");
    }

    public static void showAskToPlayerChoice() {
        System.out.println("\n------------- Nowa runda -------------");
        System.out.println("Dokonaj wyboru: ");
        System.out.println("klawisz 1 - zagranie \"kamień\"");
        System.out.println("klawisz 2 - zagranie \"papier\"");
        System.out.println("klawisz 3 - zagranie \"nożyce\"");
    }

    public static void showWhenResultOfRound(int numberOfround, String nameWinnerOfRound,
                                             ActionType player1Action, ActionType player2Action) {
        System.out.println("Wynik rundy: " + numberOfround);
        System.out.println("Rundę wygrał: " + nameWinnerOfRound +
                " -> " + player1Action + " beats " + player2Action);
    }

    public static void showWhenTie(int numberOfround, ActionType player1Action, ActionType player2Action) {
        System.out.println("Wynik rundy: " + numberOfround);
        System.out.println("Remis, gracz1: " + player1Action + " , gracz2: " + player2Action);
    }

    public static void ShowWinerGame(String winnerName) {
        System.out.println("\nZwycięscą gry zostaje: " + winnerName.toUpperCase() + "\n");
    }

}






