package tictactoe;

public class Board {

    private String[][] board;

    public Board() {
        initialize();
    }

    private void initialize() {
        board = new String[3][3];
    }

    public String[][] getBoard() {
        return board;
    }

    public void move(Position position, String player) {
        board[position.getX()][position.getY()] = player;
    }
}
