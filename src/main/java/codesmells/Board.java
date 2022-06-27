package codesmells;

import java.util.ArrayList;
import java.util.List;

public class Board
{
    private List<Tile> _plays = new ArrayList<>();

    public Board()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                Tile tile = new Tile();
                tile.position = new Position(i,j);
                tile.Symbol = ' ';
                _plays.add(tile);
            }
        }
    }

    public Tile TileAt(Position position)
    {
        for (Tile t : _plays) {
            // TODO: use equeals for the position objects
            if (t.position.X == position.X && t.position.Y == position.Y){
                return t;
            }
        }
        return null;
    }

    public void AddTileAt(char symbol, int x, int y)
    {
        Tile newTile = new Tile();
        newTile.position = new Position(x,y);
        newTile.Symbol = symbol;

        TileAt(new Position(x,y)).Symbol = symbol;
    }
}