package javaPack;

import java.util.Scanner;

public class Calculate //calculates the gpa for the grades
{
	static Scanner allinput = new Scanner(System.in);
	float gradetotal;
	int gradenum;
	
	public void Calc(int numgrades) 
	{
		float grade;
		gradenum = numgrades;
		float count = 0;
		while(count < numgrades)
		{
			System.out.print("\nEnter a grade (0-100): ");
			grade = allinput.nextFloat();
			if(grade < 1 || grade > 100)
			{
				System.out.print("incorrect input, try again");
			}
			else
			{
				gradetotal += grade;
				count += 1;
			}
		}
		
		Convert();
	}
	
	public void Convert()
	{
		float Gpa = gradetotal / gradenum;
		float roundGpa = (float) Math.ceil(Gpa * 10)/10;
		float scaleGpa = (Gpa / 100) * 4;
		float roundScale = (float) Math.ceil(scaleGpa * 10)/10;
		System.out.print("\nGPA is " + roundGpa);
		System.out.print("\nGPA on a 4.0 scale is " + roundScale);
		int average = Math.round(Gpa);
		ConvertLetter(average);
	}
	
	public void ConvertLetter(int average)
	{
		String letter;
		switch(average)
		{
			case 100: case 99: case 98: case 97:
				letter = "A+";
				break;
				
			case 96: case 95: case 94: case 93:
				letter = "A";
				break;
				
			case 92: case 91: case 90: 
				letter = "A-";
				break;
				
			case 89: case 88: case 87: 
				letter = "B+";
				break;
			
			case 86: case 85: case 84: case 83:
				letter = "B";
				break;
				
			case 82: case 81: case 80: 
				letter = "B-";
				break;
				
			case 79: case 78: case 77: 
				letter = "C+";
				break;
				
			case 76: case 75: case 74: case 73: 
				letter = "C";
				break;
				
			case 72: case 71: case 70: 
				letter = "C-";
				break;
				
			case 69: case 68: case 67: 
				letter = "D+";
				break;
				
			case 66: case 65:  
				letter = "D";
				break;
				
			default:
				letter = "F";
				break;
		}
		System.out.print("\nGPA on a letter scale is " + letter);
	}
}