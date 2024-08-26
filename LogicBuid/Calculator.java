/*
Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested ifelse to check if division by zero is attempted and display an error message. 
*/

class Calculator
{
		public static void main(String[]args)
		{
			int num1 = 5;
			int num2 = 4;
			int result= 4;
			
			switch(result)
			{
				case 1:
					result = num1 + num2;
					System.out.println(result);
					
				break;
				case 2:
					result = num1 - num2;
					System.out.println(num1 - num2);
				break;
				case 3:
					System.out.println(num1 * num2);
				break;
				case 4:
				if(num2/num1 && num1 = 0)
				{
					System.out.println("cant divide");
				}
				else if(num2/num1 && num2 = 0)
				{
					System.out.println("cant divide");
				}
				else
				{
						result = num1/num2;
						System.out.println(result);
				}
					System.out.println(num1 * num2);
				break;
				
				default:
					System.out.println("NA");
			}
		}
}