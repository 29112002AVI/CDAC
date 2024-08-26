/*
Write a program that uses a nested switch statement to print out the day of the week based on an 
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it 
is a weekday or weekend. 
*/

class Day{
	public static void main(String[]args){
		int day =5;
		int weektyp= 2;
		switch(weektyp)
		{
			case 1:
				switch(day)
				{
					case 2:
					System.out.println("Today is monday");
					break;
			
					case 3:
					System.out.println("Today is tuesday");
					break;
			
					case 4:
					System.out.println("Today is wednesday");
					break;
			
					case 5:
					System.out.println("Today is thursday");
					break;
				
					case 6:
					System.out.println("Today is friday");
					break;
					
					default:
					System.out.println("no weekday");
				}
		

				case 7:
				switch(day)
				{
					case 8:
					System.out.println("Today is saturday");
					break;
			
					case 9:
					System.out.println("Today is Sunday");
					break;
			
					default:
					System.out.println("Today is no day");
		
				}	
		
		}
	}			
}
