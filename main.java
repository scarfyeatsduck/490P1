public class main {
	
	public static void main(String[] args) {
		
		int sides = 6;
		int num = 5;
		
		Dice sixSided = new Dice(sides);
		
		System.out.println("Rolling a " + sides + " sided die " + num + " times.");
		
		for (int i = 0; i < num; i++)
			System.out.println("You rolled a " + sixSided.roll() + ".");
		
	}
	
}
