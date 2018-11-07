package snl;

public class Ladder extends Jumper {
    private int noLadders;

    public Ladder(int start, int end){
        super(start, end);
        this.noLadders++;
    }
    
    public Ladder(){
        //Setting random position for the Ladder
        //min length is 3
        int n1 = Calculator.randomNumberInRange(1, 94);
        int n2 = Calculator.randomNumberInRange(n1+3, 100);
        
        super.startingPoint = n1;
        super.endingPoint = n2;
    }
    
    
}
