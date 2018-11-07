package snl;

public class Die {
    @SuppressWarnings("unused")
	private int topFace;
    public static int roll(){
        return Calculator.randomNumberInRange(1, 6);
    }
}
