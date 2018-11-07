package snl;

public class Snake extends Jumper {
    private int noSnakes = 0;
    
    public Snake(int start, int end){
        super(start, end);
        this.noSnakes++;
    }
    
    public Snake(){
        //Setting random position for the Snake
        int n1 = Calculator.randomNumberInRange(6, 99);
        int n2 = Calculator.randomNumberInRange(3, n1-3);
        super.startingPoint = n1;
        super.endingPoint = n2;
    }

}
