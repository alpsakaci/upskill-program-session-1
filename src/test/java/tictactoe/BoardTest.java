package tictactoe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {

    @Test
    void initialize_ReturnEmptyBoardArray() {
        assertArrayEquals(new String[3][3], new FirstBoard().getBoard());
    }

    @Test
    void move_GivenPositionAndPlayer_PlaceSignInGivenPosition() {
        FirstBoard board = new FirstBoard();
        board.move(new Position(1, 2), "X");
        assertEquals("X", board.getBoard()[1][2]);
    }

}
