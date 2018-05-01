import java.util.Scanner;

public class InputtingData {

    Scanner scanner = new Scanner(System.in);

    public String introduceText() {
        String introducedText = scanner.next();
        return introducedText;
    }

    public int introductionNumber() throws NumberFormatException {
        int introductionNumber = 0;
        try {
            introductionNumber = Integer.parseInt(introduceText());
        } catch (NumberFormatException ex) {
            Messages.showMessageWrongPlayerChoose();
            introductionNumber();
        }
        return introductionNumber;
    }

    public char validationUserChoiceAfterGame() {
        char text = scanner.next().toLowerCase().charAt(0);
        if (text != 'n' & text != 'x') {
            System.out.println("Dokonano złego wyboru, wprowadź komendę jeszcze");
            validationUserChoiceAfterGame();
        }
        return text;
    }
}
