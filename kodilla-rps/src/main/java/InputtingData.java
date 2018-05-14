import java.util.Scanner;

public class InputtingData {

    int n = 0;

    public String readText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public int readNumber() throws NumberFormatException {
        int introductedNumber = 0;
        int n = 0;
        do {
            try {
                introductedNumber = Integer.parseInt(readText());
                n = 3;
            } catch (NumberFormatException ex) {
                Messages.showMessageWrongPlayerChoose();
                n++;
                if (n == 3) {
                    //co tu wyrzucić?
                    throw new IllegalArgumentException("Wprowadzono błędnie cyfrę");
                }
            }
        } while (n < 3);
        return introductedNumber;
    }

    public char validationUserChoiceAfterGame() {
        Scanner scanner = new Scanner(System.in);
            char text = scanner.next().toLowerCase().charAt(0);
            if (text != 'n' & text != 'x') {
                System.out.println("Dokonano złego wyboru, wprowadź komendę jeszcze");
                validationUserChoiceAfterGame();
            }
            return text;
        }

    }


