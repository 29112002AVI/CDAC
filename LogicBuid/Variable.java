class Variable
{
	public static void main(String[]args)
	{
		//typecasting
		int num = 129;
		float num1 = num;
		System.out.println(num1);
		//Variable.java:5: error: incompatible types: possible lossy conversion from int to byte
		
		char letter = 'a';
		int shift = letter;
		System.out.println(shift);
		
		float shift2 = 129.56f;
		double shift3 = shift2;
		System.out.println(shift3);
		
		int change = 148;
		float change1 = change;
		System.out.println(change1);
		
		
	}         
}