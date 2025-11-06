package javaPack;

import java.util.Scanner;

public class CollectInfo 
{
	static Scanner allinput = new Scanner(System.in);
	
	public CollectInfo()
	{
		AskInfo();
	}
	
	public void AskInfo()
	{
		float numgrades;
		boolean yesorno;
		
		System.out.print("How many grades will you be averaging?");
		numgrades = allinput.nextFloat();
		yesorno = CheckNum(numgrades);
		System.out.print(yesorno);
	}
	
	public boolean CheckNum(float gradenum)
	{
		float roundyes;
		boolean boolstate = true;
		
		float isyes = gradenum % 1;
		roundyes = (float) (Math.ceil(isyes * 10)/10);
		System.out.print(roundyes);
		if(isyes > 0)
		{
			return false;
		}
		else
		{
			if(gradenum < 1 || gradenum >= 100)
			{
				return false;
			}	
			else
			{
				return true;
			}
		}
	}
}
