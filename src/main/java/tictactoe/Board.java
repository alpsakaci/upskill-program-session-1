package tictactoe;

import java.util.Objects;

public class Board {

    private String[][] cells;

    public Board() {
        cells = new String[3][3];
    }

    private void validatePosition(int row, int column) {
        if ((row < 0 || row > 2) || (column < 0 || column > 2)) {
            throw new InvalidPositionException("position is invalid");
        }

        if (cells[row][column] != null && !Objects.equals(cells[row][column], "")) {
            throw new InvalidPositionException("position is fulled");
        }
    }

    public void signCell(int row, int column, String value) {
        validatePosition(row, column);
        cells[row][column] = value;
    }

    public boolean isDiagonalCross(){
        boolean isDiagonal = false;
        int x = 0;
        String temp  = cells[x][x];

        while (x < 3){
            if (!Objects.equals(temp, cells[x][x])) {
                isDiagonal = false;
                break;
            }
            x++;
            isDiagonal = true;
        }

        if (!isDiagonal){
            temp = cells[1][1];
            if (Objects.equals(temp, cells[0][2]) && Objects.equals(temp, cells[2][0])) {
                if (Objects.equals(cells[0][2], cells[2][0])){
                    isDiagonal = true;
                }
            }
        }

        return isDiagonal;
    }

    public boolean isVerticalCross(){
        boolean isVertical = false;
        int x = 0;

        while (x < 3){
            int y = 0;
            String temp  = cells[x][y];
            if (Objects.equals(temp, cells[x][y + 1]) && Objects.equals(temp, cells[x][y+2])) {
                if (Objects.equals(cells[x][y + 1], cells[x][y+2])){
                    isVertical = true;
                    break;
                }
                x++;
                continue;
            }
            x++;

        }

        return isVertical;
    }

    public boolean isHorizantalCross(){
        boolean isHorizantal = false;
        int y = 0;

        while (y < 3){
            int x = 0;
            String temp  = cells[x][y];
            if (Objects.equals(temp, cells[x + 1][y]) && Objects.equals(temp, cells[x + 2][y])) {
                if (Objects.equals(cells[x + 1][y], cells[x + 2][y])){
                    isHorizantal = true;
                    break;
                }
                y++;
                continue;
            }
            y++;

        }

        return isHorizantal;
    }




}
