package com.rps;

import java.util.Scanner;

public class UserInputReader {

    public String readText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public int readNumber() throws NumberFormatException {
        int introductedNumber = 0;
        for (int n = 0; n < 3; n++) {
            try {
                introductedNumber = Integer.parseInt(readText());
                if (introductedNumber > 0 || introductedNumber < 10) {
                    break;
                }
                Messages.showMessageWrongPlayerChoose();
            } catch (NumberFormatException ex) {
                Messages.showMessageWrongPlayerChoose();
                continue;
            }
        }
        return introductedNumber;
    }

    public char validationUserChoiceAfterGame() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            char text = scanner.next().toLowerCase().charAt(0);
            if (text != 'n' & text != 'x') {
                Messages.showMessageWrongPlayerChoose();
                continue;
            }
            return text;
        }
    }
}
