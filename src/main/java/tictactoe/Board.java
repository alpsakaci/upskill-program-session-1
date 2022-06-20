package tictactoe;

public class Board {

    private String[][] cells;

    public Board() {
        cells = new String[3][3];
    }

    private void validatePosition(int x, int y) {
        if (x < 0 || x > 2) {
            throw new InvalidPositionException();
        }

        if (y < 0 || y > 2) {
            throw new InvalidPositionException();
        }
    }

    public void signCell(int x, int y, String value) {
        validatePosition(x, y);
        cells[x][y] = value;
    }

}
