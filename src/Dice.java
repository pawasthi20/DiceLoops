/**
 * 
 * @author pawasthi20
 *
 */
public class Dice 
{
	//Instance Variables
	
	private int numRolls;
	
	//Constructors
	
	public Dice()
	{
		numRolls = 0;
	}
	
	public int roll()
	{
		numRolls++;
		int roll = (int)(Math.random()*6)+1;
		return roll;	
	}
	
	//Methods
	
	public void reset()
	{
		numRolls = 0;
	}
	public int getNumRolls()
	{
		return numRolls;
	}
}