package snl;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Calculator {
    public static int randomNumberInRange(int lower, int upper){
        return ThreadLocalRandom.current().nextInt(lower, upper + 1);
    }
    
    public static void randomSnake(int on){
        /**
         * on: The starting position of the snake which it has to be placed. 
         * 
         * In order to make the game realistic I have limited the number to the 
         * following range
         * minimum length of the snake: 8
         * maximum length of the snake: 60
         */
        
        
        
    }
        
    public static int randomLadder(int on){
       
        return ThreadLocalRandom.current().nextInt(10, 70 + 1);
    }
    
    public static HashMap<Integer,Integer> randomBoardArrangement(int noSnakes, int noLadders){
        
        
        
        
        return null;
    }
}
