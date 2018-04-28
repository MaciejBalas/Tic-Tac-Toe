
package tictactoe;

/**
 *
 * @author maciej
 * @version 1.0
 */
public class TicTacToe {

    public static void main(String[] args) {
        Reader reader=new Reader();
        Board board=new Board();
        View view = new View();
        char player='x';
        int move=0;
        //main loop
        while(true){
            
            view.show(board.getBoard());
            if(move==9)
                view.tie();
            
        
            System.out.println("\n Pick a place ");
             
        
        
        }
    }
    
}
