package edu.up.cs301.tictactoe;

import org.junit.Test;

import static org.junit.Assert.*;

public class TTTStateTest {

    @Test
    public void getPiece() {
        TTTState testState = new TTTState();
        char place = testState.getPiece(-1,0);
        assertEquals('?', place);

        testState.setPiece(0,0, 'O');
        place = testState.getPiece(0,0);
        assertEquals('O', place);
    }

    @Test
    public void setPiece() {
        TTTState testState = new TTTState();
        testState.setPiece(-1,0, 'X');
        char place = testState.getPiece(-1,0);
        assertEquals('?', place);

        testState.setPiece(0,0, 'X');
        place = testState.getPiece(0,0);
        assertEquals('X', place);
    }

    @Test
    public void getWhoseMove() {
    }

    @Test
    public void setWhoseMove() {
    }
}