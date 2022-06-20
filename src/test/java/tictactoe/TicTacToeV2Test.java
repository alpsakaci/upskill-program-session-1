package tictactoe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeV2Test {


    @Test
    public void moveFirstPlayer_WhenGameIsContinueing_ShouldReturnContinue() {
        TicTacToeV2 ticTacToe = new TicTacToeV2(new FirstBoard());
        ticTacToe.moveFirstPlayer(new Position(0, 0));

        TicTacResult result = ticTacToe.getResult();

        assertEquals(TicTacResult.CONTINUE, result);
    }

    @Test
    public void moveSecondPlayer_WhenGameIsContinueing_ShouldReturnContinue() {
        TicTacToeV2 ticTacToe = new TicTacToeV2(new FirstBoard());
        ticTacToe.moveSecondPlayer(new Position(0, 0));

        TicTacResult result = ticTacToe.getResult();

        assertEquals(TicTacResult.CONTINUE, result);
    }

    @Test
    void moveFirstPlayer_WhenFirstPlayerWinTheGameVertical_ShouldReturnWinnerX() {
        TicTacToeV2 ticTacToe = new TicTacToeV2(new FirstBoard());
        ticTacToe.moveFirstPlayer(new Position(0, 0));
        ticTacToe.moveFirstPlayer(new Position(1, 0));
        ticTacToe.moveFirstPlayer(new Position(2, 0));

        TicTacResult result = ticTacToe.getResult();

        assertEquals(TicTacResult.X_WINNER, result);
    }

    @Test
    void moveSecondPlayer_WhenSecondPlayerWinTheGameVertical_ShouldReturnWinnerY() {
        TicTacToeV2 ticTacToe = new TicTacToeV2(new FirstBoard());

        ticTacToe.moveSecondPlayer(new Position(0, 0));
        ticTacToe.moveSecondPlayer(new Position(1, 0));
        ticTacToe.moveSecondPlayer(new Position(2, 0));

        TicTacResult result = ticTacToe.getResult();

        assertEquals(TicTacResult.Y_WINNER, result);
    }

    @Test
    void moveFirstPlayer_WhenFirstPlayerWinTheGameHorizontal_ShouldReturnWinnerX() {
        TicTacToeV2 ticTacToe = new TicTacToeV2(new FirstBoard());

        ticTacToe.moveFirstPlayer(new Position(0, 0));
        ticTacToe.moveFirstPlayer(new Position(0, 1));
        ticTacToe.moveFirstPlayer(new Position(0, 2));

        TicTacResult result = ticTacToe.getResult();

        assertEquals(TicTacResult.X_WINNER, result);

    }

    @Test
    void moveSecondPlayer_WhenSecondPlayerWinTheGameHorizontal_ShouldReturnWinnerX() {
        TicTacToeV2 ticTacToe = new TicTacToeV2(new FirstBoard());

        ticTacToe.moveSecondPlayer(new Position(0, 0));
        ticTacToe.moveSecondPlayer(new Position(0, 1));
        ticTacToe.moveSecondPlayer(new Position(0, 2));

        TicTacResult result = ticTacToe.getResult();

        assertEquals(TicTacResult.Y_WINNER, result);

    }
}
