import java.util.Scanner;

public class DiceMain2 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		//Create 2 New Dice Objects From the Dice Class
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
				
		int roll1 = 0;
		int roll2 = 0;
		int totalRoll = 0;
		
		//Prompt User to Enter Target Value
		System.out.println("Enter a number between 2 and 12:");
        int targetValue = in.nextInt();
        
        //Error Message if Target Value is not Valid
        if (targetValue > 11 || targetValue < 3)
        {
        	System.out.print("The target value is not valid. Enter a valid target value.");
        	System.exit(0);
        }
        
		while (targetValue != totalRoll)
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
		System.out.printf("Total number of rolls before target was rolled: %d", dice1.getNumRolls());
	}
}