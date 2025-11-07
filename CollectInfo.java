package javaPack;

import java.util.Scanner;

public class CollectInfo //Will collect the number of grades to be inputed and check if the input is between 1-100
{
	static Scanner allinput = new Scanner(System.in);
	Calculate calcinfo = new Calculate();
	
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
		if(yesorno)
		{
			calcinfo.Calc((int)numgrades);
		}
	}
	
	public boolean CheckNum(float gradenum)
	{
		float roundyes;
		boolean boolstate = true;
		
		
		float isyes = gradenum % 1;
		roundyes = (float) (Math.ceil(isyes * 10)/10);
		System.out.print(roundyes + "\n");
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