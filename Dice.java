import java.util.*;

public class Dice extends Random implements Runnable {
	
	private static final long serialVersionUID = 1L;
	int sides;
	
	Dice (int s) {
		
		sides = s;
		
	}
	
	int roll () {
		
		int value = nextInt(sides) + 1;
		
		return value;
		
	}
	
	public void run () {
		
		sides = 6;
		
		System.out.println("Rolling a 6-sided die.");
		
		roll();
		
	}
	
}
