package snl;

import java.awt.GridLayout;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BoardLayout extends JPanel{
    //private static JPanel panel; 
    
    public BoardLayout(){
        //panel = new JPanel();
        setLayout();
    }
    
    public void setLayout(){
        this.setLayout(new GridLayout(10, 10, 0, 0));
        
        for(int i = 1; i<=100; i++){
            if(i > Board.getBoardMapOutput(i)){
                // set snake cell
                this.add(new Cell(1, i));
            }else if(i < Board.getBoardMapOutput(i)){
                //set Ladder cell
                this.add(new Cell(2, i));
            }else{
                //set normal cell
                this.add(new Cell(0, i));
            }
        }
    }
    
}
