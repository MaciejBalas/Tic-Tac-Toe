
package tictactoe;

/**
 *
 * @author maciej
 */
public class View {
    
    
    
    public void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
    }  
    
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
}
