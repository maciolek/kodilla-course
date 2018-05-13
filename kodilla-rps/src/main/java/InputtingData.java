import java.util.Scanner;

public class InputtingData {

    Scanner scanner = new Scanner(System.in);

    public String readText() {
        String introducedText = scanner.next();
        return introducedText;
    }

    public int readNumber() throws NumberFormatException {
        int introductionNumber = 0;
        int n =0;
        do {
            try {
                introductionNumber = Integer.parseInt(readText());
                n =3;
            } catch (NumberFormatException ex) {
                Messages.showMessageWrongPlayerChoose();
                n++;
            }
        } while (n<3);
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
