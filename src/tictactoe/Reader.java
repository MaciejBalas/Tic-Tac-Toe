
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author maciej
 */
public class Reader {
    
    private Scanner keyboard;
    
    Reader(){
       keyboard = new Scanner(System.in);
    }
    
    public String read()
    {
       String line;
       line=keyboard.nextLine();
       return line;
    }
}
