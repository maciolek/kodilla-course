
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
    InputtingData inputtingData;


    @Test
    public void shouldTakeText() {
        //given
        //when
        String inputText = "some text";
        InputStream in = new ByteArrayInputStream(inputText.getBytes());
        System.setIn(in);
        //then
        assertEquals("some text", inputtingData.readText());
    }

    @Test
    public void shouldTakeIntroducedName() {
        //given
        //when
        String inputedName = "Darek";
        InputStream in = new ByteArrayInputStream(inputedName.getBytes());
        System.setIn(in);
        when(player1.getName()).thenReturn(inputedName);

        //then
        assertEquals("Darek", player1.getName());
    }

    @Test
    public void shouldTakeIntroducedNumber() {
        //given

        //when
        String inputNumber = "1";
        InputStream in = new ByteArrayInputStream(inputNumber.getBytes());
        System.setIn(in);

        when(inputtingData.readNumber()).thenReturn(1);
        int actualNumber = inputtingData.readNumber();
        //then
        assertEquals(1, actualNumber);
    }

    @Ignore
    @Test
    public void shouldTakeHumanPlayerActionRock() {

        //given
        //when
        String inputNumber = "1";
        InputStream in = new ByteArrayInputStream(inputNumber.getBytes());
        System.setIn(in);

        when(inputtingData.readNumber()).thenReturn(3);
        when(player1.playerAction()).thenReturn(ActionType.PAPER);
        ActionType actionTypeHumanPlayer = player1.playerAction();
        //then

        Assert.assertEquals(ActionType.ROCK, actionTypeHumanPlayer);
    }

    public void testGetResultOfRoundWhenTie(){
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
    public void testReadNumberWhenIntroducedText() {
        //given
        //when
        String inputNumber = "text";
        InputStream in = new ByteArrayInputStream(inputNumber.getBytes());
        System.setIn(in);

        when(inputtingData.readText()).thenReturn(inputNumber);
        when(inputtingData.readNumber()).thenThrow(new NumberFormatException());

        //then

        try {
            inputtingData.readNumber();
        } catch (NumberFormatException ex) {
        }

        verify(inputtingData, times(3)).readText();
    }


}
