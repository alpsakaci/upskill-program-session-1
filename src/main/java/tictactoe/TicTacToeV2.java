package tictactoe;

public class TicTacToeV2 {

    private Board board;
    private static final String PLAYER_X = "X";
    private static final String PLAYER_Y = "Y";


    public TicTacToeV2(Board board) {
        this.board = board;
    }

    public void moveFirstPlayer(Position position) {
        board.move(position, PLAYER_X);
    }

    private boolean isVerticallyWin(String player) {
        boolean result = true;
        for (int i = 0; i < board.getSize(); i++) {
            result = result && board.isAllocatedFor(new Position(i, 0), player);

        }

        return result;
    }

    private boolean isHorizontallyWin(String player) {
        boolean result = true;
        for (int i = 0; i < board.getSize(); i++) {
            result = result && board.isAllocatedFor(new Position(0, i), player);
        }

        return result;
    }

    public void moveSecondPlayer(Position position) {
        board.move(position, PLAYER_Y);
    }

    public TicTacResult getResult() {
        if (isWinner(PLAYER_X)) {
            return TicTacResult.X_WINNER;
        }

        if (isWinner(PLAYER_Y)) {
            return TicTacResult.Y_WINNER;
        }

        return TicTacResult.CONTINUE;
    }

    private boolean isWinner(String player) {
        return isVerticallyWin(player) || isHorizontallyWin(player);
    }
}
