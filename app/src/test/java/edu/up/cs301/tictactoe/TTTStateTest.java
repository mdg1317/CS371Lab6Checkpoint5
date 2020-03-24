package edu.up.cs301.tictactoe;

import org.junit.Test;

import static org.junit.Assert.*;

public class TTTStateTest {

    @Test
    public void getPiece() {
        TTTState testState = new TTTState();
        char place = testState.getPiece(-1,0);
        assertEquals('?', place);
    }

    @Test
    public void setPiece() {
    }

    @Test
    public void getWhoseMove() {
        TTTState testState = new TTTState();
        testState.setWhoseMove(0);
        int move = testState.getWhoseMove();
        assertEquals(move, 0);
    }

    @Test
    public void setWhoseMove() {
    }
}