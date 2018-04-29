
package tictactoe;

/**
 *
 * @author maciej
 */
public class View {
 
    public void show(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(board[i][j]+" ");
            System.out.println();
        }
    }
    public void tie(){
        System.out.println("Tie");
    }
    
    public void coordsError(){
        System.out.println("Wrong coordinates - use A,B,C for rows and 1,2,3 for columns");
    }
    
    public void alreadyPickedError(){
        System.out.println("Space was already used");
    }
    
    public void playerError(){
        System.err.println("Player is not found");
    }
    
    public void playerWin(char player){
        System.out.println("The winner is Player: "+player);
    }
}
