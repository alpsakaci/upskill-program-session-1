package tictactoe;

public interface Board {

    boolean isAllocatedFor(Position position, String player);

    void move(Position position, String player);

    public int getSize();
}
