package codesmells;

public class Tile
{
    Position position;
    public char Symbol;

    public Tile() {
    }

    public Tile(char symbol, int x, int y) {
        Symbol = symbol;
        position = new Position(x,y);
    }
}