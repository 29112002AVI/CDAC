/*
Write a program to classify student grades based on the following criteria: 
 If the score is greater than or equal to 90, print "A" 
 If the score is between 80 and 89, print "B" 
 If the score is between 70 and 79, print "C" 
 If the score is between 60 and 69, print "D" 
 If the score is less than 60, print "F" 
*/

class Score
{
	public static void main(String[]args)
	{
			int score = 75;
			if(score>=90)
			{
				System.out.println("Grade A");
			}
			else if(score>=80 && score<90)
			{
				System.out.println("Grade B");
			}
			else if(score>=70 && score<80)
			{
				System.out.println("Grade C");
			}
			else if(score>=60 && score<70)
			{
				System.out.println("Grade D");
			}
			else if(score<50)
			{
				System.out.println("Grade F");
			}
			else
			{
				System.out.println("no marks");
			}
	}
}