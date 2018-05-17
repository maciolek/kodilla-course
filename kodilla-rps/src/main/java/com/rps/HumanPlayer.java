package com.rps;

public class HumanPlayer implements Player {

    private String name;

    private UserInputReader userInputReader;

    public HumanPlayer(UserInputReader userInputReader) {
        this.userInputReader = userInputReader;
    }

    public ActionType playerAction() throws IllegalArgumentException {

        for (int n = 0; n < 3; n++) {
            Messages.showAskToPlayerChoice();
            int userChoice = userInputReader.readNumber();
            if (userChoice < 1 || userChoice > 3) {
                Messages.showMessageWrongPlayerChoose();
                continue;
            }
            switch (userChoice) {
                case (1):
                    return ActionType.ROCK;
                case (2):
                    return ActionType.PAPER;
                case (3):
                    return ActionType.SCISSORS;
            }
        }
        throw new IllegalArgumentException("Błędny wybór - koniec gry");
    }


//
//            default:
//                throw new IllegalArgumentException("Błędny wybór akcji!");


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
