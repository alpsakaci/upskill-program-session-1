package tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    private TicTacToe ticTacToe;

    @BeforeEach
    void setup() {
        ticTacToe = new TicTacToe();
    }

    @Test
    void shouldReturnGameStatus() {
        assertFalse(ticTacToe.Game());
    }

    @Test
    void shouldReturnGameBoardWhenGameStarted() {
        assertArrayEquals(new String[3][3], ticTacToe.getBoard());
    }

    @Test
    void shouldReturnChangeTurnForEachPlayer() {
        ticTacToe.ChangeTurn();
        assertEquals("O", ticTacToe.getTurn());
    }

    @Test
    void shouldPlayerPlaceBoardOneSignWhenPlayCalled() {
        int x = 1;
        int y = 1;

        ticTacToe.Play(x, y);
        assertEquals("X", ticTacToe.getPositionValue(x, y));
    }

    @Test
    void shouldSecondPlayerPlaceBoardOneSignWhenPlayCalled() {
        int x1 = 1;
        int y1 = 1;
        ticTacToe.Play(x1, y1);

        int x2 = 1;
        int y2 = 2;
        ticTacToe.Play(x2, y2);

        assertEquals("X", ticTacToe.getPositionValue(x1, y1));
        assertEquals("O", ticTacToe.getPositionValue(x2, y2));
    }

    @Test
    void shouldNotPlaceSignIfPositionIsAlreadyFilledWhenPlayCalled() {
        int x = 1;
        int y = 1;

        ticTacToe.Play(x, y);
        ticTacToe.Play(x, y);

        assertEquals("X", ticTacToe.getPositionValue(x, y));
        assertEquals("O", ticTacToe.getTurn());
    }

    @Test
    void shouldReturnTrueIfBoardIsFullWhenIsBoardFullCalled() {
        for (String[] row : this.ticTacToe.getBoard()) {
            Arrays.fill(row, "X");
        }

        assertTrue(ticTacToe.IsBoardFull());
    }

    @Test
    void shouldReturnFalseIfBoardIsNotFullWhenIsBoardFullCalled() {
        Arrays.fill(this.ticTacToe.getBoard()[0], "X");

        assertFalse(ticTacToe.IsBoardFull());
    }

    @Test
    void shouldReturnWinnerX() {
        Arrays.fill(this.ticTacToe.getBoard()[0], "X");

        assertEquals("X", this.ticTacToe.checkAndReturnWinner());
    }

}
