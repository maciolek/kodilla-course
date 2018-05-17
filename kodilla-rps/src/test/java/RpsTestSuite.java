import com.rps.*;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class RpsTestSuite {

    @InjectMocks
    GameProcessor gameProcessor;

    @Mock
    Round round;

    @InjectMocks
    Game game;

    @Mock
    HumanPlayer player1;

    @Mock
    ComputerPlayer player2;

    @Mock
    UserInputReader userInputReader;


    @Test
    public void shouldTakeText() {
        //given
        String inputText = "some text";

        //when
        when(userInputReader.readText()).thenReturn(inputText);

        //then
        assertEquals(inputText, userInputReader.readText());
    }

    @Test
    public void shouldTakeIntroducedName() {
        //given
        String inputedName = "Darek";

        //when
        when(userInputReader.readText()).thenReturn(inputedName);
        when(player1.getName()).thenReturn(inputedName);

        //then
        assertEquals(inputedName, player1.getName());
    }

    @Test
    public void shouldTakeIntroducedNumber() {
        //given
        int inputNumber = 1;

        //when
        when(userInputReader.readNumber()).thenReturn(inputNumber);
        int actualNumber = userInputReader.readNumber();

        //then
        assertEquals(1, actualNumber);
    }


    @Test
    public void shouldTakeHumanPlayerActionRock() {

        //given
        int inputNumber = 1;

        //when
        when(userInputReader.readNumber()).thenReturn(inputNumber);
        int actualNumber = userInputReader.readNumber();

        when(player1.playerAction()).thenReturn(ActionType.ROCK);
        ActionType actionTypeHumanPlayer = player1.playerAction();
        //then

        Assert.assertEquals(ActionType.ROCK, actionTypeHumanPlayer);
    }

    @Test
    public void shouldTakeHumanPlayerActionPaper() {

        //given
        int inputNumber = 2;

        //when
        when(userInputReader.readNumber()).thenReturn(inputNumber);
        int actualNumber = userInputReader.readNumber();

        when(player1.playerAction()).thenReturn(ActionType.PAPER);
        ActionType actionTypeHumanPlayer = player1.playerAction();
        //then

        Assert.assertEquals(ActionType.PAPER, actionTypeHumanPlayer);
    }

    @Test
    public void shouldTakeHumanPlayerActionScissors() {

        //given
        int inputNumber = 2;

        //when
        when(userInputReader.readNumber()).thenReturn(inputNumber);
        int actualNumber = userInputReader.readNumber();

        when(player1.playerAction()).thenReturn(ActionType.SCISSORS);
        ActionType actionTypeHumanPlayer = player1.playerAction();
        //then

        Assert.assertEquals(ActionType.SCISSORS, actionTypeHumanPlayer);
    }

    @Ignore
    @Test
    public void testReadNumberWhenPlayerChoseNumberOutOfScope() throws IllegalArgumentException {

        //given
        int firstChoseNumber = 8;

        //when
        when(userInputReader.readNumber()).thenReturn(firstChoseNumber);
        when(player1.playerAction());
        //then
        try {
            player1.playerAction();
        } catch (IllegalArgumentException ex) {
        } finally {
            verify(userInputReader, times(3)).readNumber();
            verifyNoMoreInteractions(userInputReader);
        }
    }

    @Test
    public void getResultOfRoundWhenTie(){
        //given
        int inputNumber = 1;

        //when
        when(userInputReader.readNumber()).thenReturn(inputNumber);
        when(player1.playerAction()).thenReturn(ActionType.PAPER);
        userInputReader.readNumber();
        when(player2.playerAction()).thenReturn(ActionType.PAPER);
        when(round.getResultOfRound()).thenReturn(Result.TIE);

        Result actulaResult = round.getResultOfRound();
        //then
        Assert.assertEquals(Result.TIE, actulaResult);

        //


    }

    @Ignore
    @Test
    public void testGetResultOfRoundWhenTie() {
        //given
        //when
        String inputNumber = "1";
        InputStream in = new ByteArrayInputStream(inputNumber.getBytes());
        System.setIn(in);

        when(player1.playerAction()).thenReturn(ActionType.ROCK);
        //then
    }

    @Ignore
    @Test
    public void testReadNumberWhenIntroducedText() throws NumberFormatException {
        //given
        String inputText = "text";

        //when
        when(userInputReader.readText()).thenReturn(inputText);
        when(userInputReader.readNumber()).thenThrow(new NumberFormatException());

        //then
        try {
  //          userInputReader.readText();
            userInputReader.readNumber();
        } catch (NumberFormatException ex) {

        } finally {
            verify(userInputReader, times(3)).readText();
            verifyNoMoreInteractions(userInputReader.readText());
        }
    }
}
