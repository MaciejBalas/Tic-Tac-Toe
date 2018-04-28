package tictactoe;



/**
 *
 * @author maciej
 */
public class Board {
    
    private char[][] board;
    
    Board(){
        board=new char[3][3];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++){
                board[i][j]='.';
            }
        }
    }
    
    public char checkWin(){
        // straight lines
        for(int i=0;i<board.length;i++){
            if(board[i][0]==board[i][1] && board[i][1]==board[i][2])
                return board[i][0];
            else{
                if(board[0][i]==board[1][i] && board[1][i]==board[2][i])
                return board[0][i];
            }
        }
        //skewed lines
        if(board[1][1]==board[2][2] && board[0][0]==board[1][1])
            return board[1][1];
        if(board[1][1]==board[2][1] && board[0][2]==board[1][1])
            return board[1][1];
        
        return 'n';
    }
    
    public char[][] getBoard()
    {
        return board;
    }
}