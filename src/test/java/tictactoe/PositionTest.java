package tictactoe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PositionTest {

    @Test
    void initialize() {
        Position p = new Position(3, 5);
        assertEquals(3, p.getX());
        assertEquals(5, p.getY());
    }
}
