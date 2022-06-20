package tictactoe;

public class FirstBoard implements Board{

    private String[][] board;

    public FirstBoard() {
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

    @Override
    public int getSize() {
        return 3;
    }

    public boolean isAllocatedFor(Position position, String player) {
        return player.equals(board[position.getX()][position.getY()]);
    }
}
