package tictactoe;

public class TicTacToeV2 {
    private Board board;
    private Player player1;
    private Player player2;

    public TicTacToeV2() {
        this.board = new Board();
        this.player1 = new Player("X");
        this.player2 = new Player("O");
    }

    public void play(int x, int y) {
        board.signCell(x, y, "X");
    }
}
