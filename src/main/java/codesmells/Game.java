package codesmells;

import java.util.Objects;

public class Game {
    private char _lastSymbol = ' ';
    private Board _board = new Board();

    // Data clumps -> Parameter object
    public void Play(Tile tile) throws Exception {
//    public void Play(char symbol, int x, int y) throws Exception {
        //if first move
        if (_lastSymbol == ' ') {
            //if player is X
            if (tile.Symbol == 'O') {
                throw new Exception("Invalid first player");
            }
        }
        //if not first move but player repeated
        else if (tile.Symbol == _lastSymbol) {
            throw new Exception("Invalid next player");
        }
        //if not first move but play on an already played tile
        else if (_board.TileAt(tile.position).Symbol != ' ') {
            throw new Exception("Invalid position");
        }

        // update game state
        _lastSymbol = tile.Symbol;
        _board.AddTileAt(tile.Symbol, tile.position.X, tile.position.Y);
    }

    public char Winner() {
        //if the positions in first row are taken
        if (_board.TileAt(new Position(0, 0)).Symbol != ' ' &&
                _board.TileAt(new Position(0, 1)).Symbol != ' ' &&
                _board.TileAt(new Position(0, 2)).Symbol != ' ') {
            //if first row is full with same symbol
            if (_board.TileAt(new Position(0, 0)).Symbol ==
                    _board.TileAt(new Position(0, 1)).Symbol &&
                    _board.TileAt(new Position(0, 2)).Symbol == _board.TileAt(new Position(0, 1)).Symbol) {
                return _board.TileAt(new Position(0, 0)).Symbol;
            }
        }

        //if the positions in first row are taken
        if (_board.TileAt(new Position(1, 0)).Symbol != ' ' &&
                _board.TileAt(new Position(1, 1)).Symbol != ' ' &&
                _board.TileAt(new Position(1, 2)).Symbol != ' ') {
            //if middle row is full with same symbol
            if (_board.TileAt(new Position(1, 0)).Symbol ==
                    _board.TileAt(new Position(1, 1)).Symbol &&
                    _board.TileAt(new Position(1, 2)).Symbol ==
                            _board.TileAt(new Position(1, 1)).Symbol) {
                return _board.TileAt(new Position(1, 0)).Symbol;
            }
        }

        //if the positions in first row are taken
        if (_board.TileAt(new Position(2, 0)).Symbol != ' ' &&
                _board.TileAt(new Position(2, 1)).Symbol != ' ' &&
                _board.TileAt(new Position(2, 2)).Symbol != ' ') {
            //if middle row is full with same symbol
            if (_board.TileAt(new Position(2, 0)).Symbol ==
                    _board.TileAt(new Position(2, 1)).Symbol &&
                    _board.TileAt(new Position(2, 2)).Symbol ==
                            _board.TileAt(new Position(2, 1)).Symbol) {
                return _board.TileAt(new Position(2, 0)).Symbol;
            }
        }

        return ' ';
    }
}

