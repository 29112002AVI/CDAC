/*
Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%.
*/
class Discount
{
	public static void main(String[]args)
	{
		int prod1 = 50;
		int prod2 = 50;
		int prod3 = 70;
		int totpur = prod1+ prod2+ prod3;
		if(totpur>=1000)
		{
			int disc = totpur/100;
			int findis = disc*20;
			System.out.println(findis);
			System.out.println( "you saved" + findis + "with 20% off");	
		}
		else if(totpur>500 && totpur<900)
		{
			int disc1 = totpur/100;
			int findis1 = disc1*10;
			System.out.println(findis1);
			System.out.println( "you saved" + findis1 + "with 10% off");	
		}
		else if(totpur<500)
		{
			int disc2 = totpur/100;
			int findis2 = disc2*10;
			System.out.println(findis2);
			System.out.println( "you saved" + findis2 + "with 5% off");
		}
		else 
		{
			System.out.println("no discount");
		}
	}
}