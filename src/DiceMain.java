public class DiceMain {

	public static void main(String[] args) 
	{
		//Create 2 New Dice Objects From the Dice Class
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int roll1 = 0;
		int roll2 = 0;
		int totalRoll = 0;
		
		while (totalRoll < 12)
		{
			roll1 = dice1.roll();
			roll2 = dice2.roll();
			totalRoll = roll1 + roll2;
			
			//Print Both Rolls and their Total
			
			System.out.printf(" Value of roll1: %d,", roll1);
			System.out.printf(" Value of roll2: %d,", roll2);
			System.out.printf(" Value of both rolls: %d", totalRoll);
			System.out.println();
		
			
		}
		System.out.printf("Total number of rolls before doubles: %d", dice1.getNumRolls());
	}
}