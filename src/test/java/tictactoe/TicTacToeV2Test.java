package tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeV2Test {

    private TicTacToeV2 ticTacToeV2;
    private Board board;

    @BeforeEach
    void setup() {
        ticTacToeV2 = new TicTacToeV2();
        board = new Board();
    }

    @Test
    void shouldPlayerMakeMove() {
        int x = 1;
        int y = 1;
        ticTacToeV2.play(x, y);
    }

    @Test
    void shouldThrowExceptionIfPositionInvalid() {
        assertThrows(InvalidPositionException.class,
                () -> ticTacToeV2.play(-1,1), "position is invalid");
    }

    @Test
    void shouldSignNotDuplicateAtSamePlace(){
        ticTacToeV2.play(1,1);

        assertThrows(InvalidPositionException.class,
            () -> ticTacToeV2.play(1,1), "position is fulled");
    }


}
