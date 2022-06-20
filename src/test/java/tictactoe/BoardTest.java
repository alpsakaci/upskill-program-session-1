package tictactoe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {

    @Test
    void initialize_ReturnEmptyBoardArray() {
        assertArrayEquals(new String[3][3], new Board().getBoard());
    }

    @Test
    void move_GivenPositionAndPlayer_PlaceSignInGivenPosition() {
        Board board = new Board();
        board.move(new Position(1, 2), "X");
        assertEquals("X", board.getBoard()[1][2]);
    }

}
