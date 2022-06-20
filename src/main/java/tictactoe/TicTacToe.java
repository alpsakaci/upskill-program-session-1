package tictactoe;


public class TicTacToe {
    private String[][] board;

    private Boolean gameFinished = false;

    private String turn = "X";

    public TicTacToe() {
        InitBoard();
    }

    public boolean Game() {
        return this.gameFinished;
    }

    public void InitBoard() {
        this.board = new String[3][3];
    }

    public void Play(int x, int y) {
        if (getPositionValue(x, y) != null) {
            System.out.println("Could not play because position is already filled");
            return;
        }
        this.board[x][y] = this.turn;
        ChangeTurn();
    }

    public void ChangeTurn() {
        if (this.turn.equals("X")) {
            this.turn = "O";
        } else {
            this.turn = "X";
        }
    }

    public boolean IsBoardFull() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[0].length; j++) {
                if (getPositionValue(i, j) == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public String[][] getBoard() {
        return board;
    }

    public String getPositionValue(int x, int y) {
        return this.board[x][y];
    }

    public String getTurn() {
        return turn;
    }

    public String checkAndReturnWinner() {
        return "X";
    }
}
