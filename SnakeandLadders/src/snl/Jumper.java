package snl;

public class Jumper {
    protected int startingPoint;
    protected int endingPoint;
    
    public Jumper(int start, int end){
        this.startingPoint = start;
        this.endingPoint = end;
    }
    
    public Jumper(){
    };
    
    public static void placeJumpers(int noSnakes, int noLadders){
        Snake tempSnake;
        for(int i=1; i <= noSnakes; i++){
            tempSnake = new Snake();
            if(tempSnake.startingPoint == Board.getBoardMapOutput(tempSnake.startingPoint)){
                Board.setBoardMapOutput(tempSnake.startingPoint, tempSnake.endingPoint);
            }else{
                //System.out.println(tempSnake.startingPoint +"  "+ Board.getBoardMapOutput(i));
                i--;
            }
            tempSnake = null;
        }
        
        Ladder tempLadder;
        for(int i=1; i <= noLadders; i++){
            //System.out.println("l");
            tempLadder = new Ladder();
            if(tempLadder.startingPoint == Board.getBoardMapOutput(tempLadder.startingPoint))
                Board.setBoardMapOutput(tempLadder.startingPoint, tempLadder.endingPoint);
            else
                i--;
            tempLadder = null;
        }
        

        
       
    }
}
