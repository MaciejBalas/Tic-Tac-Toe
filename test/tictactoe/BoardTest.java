/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maciej
 */
public class BoardTest {
    
    public BoardTest() {
    }
    
    
    @Test
    public void testPlayerWrongPlayer() {
        System.out.println("Wrong player");
        String coords = "A1";
        char player = 'h';
        Board instance = new Board();
        int expResult = -2;
        instance.playerMove(coords, player);
        int result = instance.playerMove(coords, player);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPlayerMoveWrongSpot() {
        System.out.println("Move into wrong spot");
        String coords = "A1";
        char player = 'x';
        Board instance = new Board();
        int expResult = -5;
        instance.playerMove(coords, player);
        int result = instance.playerMove(coords, player);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPlayerMoveBadRow() {
        System.out.println("Bad row test");
        String coords = "D3";
        char player = 'x';
        Board instance = new Board();
        int expResult = -3;
        int result = instance.playerMove(coords, player);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPlayerMoveBadCol() {
        System.out.println("Bad column test");
        String coords = "A4";
        char player = 'x';
        Board instance = new Board();
        int expResult = -4;
        int result = instance.playerMove(coords, player);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPlayerMoveCoordTooLong() {
        System.out.println("Wrong coords");
        String coords = "D32";
        char player = 'x';
        Board instance = new Board();
        int expResult = -1;
        int result = instance.playerMove(coords, player);
        assertEquals(expResult, result);
    }
    
}
