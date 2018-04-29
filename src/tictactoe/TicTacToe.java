
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
        int error;
        int restart;
        //main loop
        while(true){
            
            restart=0;
            view.show(board.getBoard());
            
            if(move==9)
                view.tie();
        
            System.out.println("\n Pick a place player "+player);
            error=board.playerMove(reader.read(), player);
            if(error<0){
                switch(error){
                    case -2: view.playerError(); restart=1; break;
                    case -5: view.alreadyPickedError(); restart=1; break;
                    default: view.coordsError(); restart=1; break;
                }
            }
            
            if(board.checkWin()!='n'){
                view.playerWin(player);
                break;
            }
            
            if(restart!=1){
                if(player=='x')
                    player='o';
                else
                    player='x';
                
                move++;
            }
        }
    }
    
}
