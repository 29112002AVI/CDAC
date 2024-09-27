
/*
class Recursion{
	
	static void show()
	{
		
		System.out.println("helloo");
		show();
		
	}
	public static void main(String args[])
	{
        show();
	}
}
//Prints hello in infinity.
*/


/*
class Recursion{
	
	static int i = 0;
	static void show()
	{
		++i;
		if(i<=5)//termination condition is base condition
		{
			System.out.println("helloo 5 times");
			show();
		}
	}
	public static void main(String args[])
	{
        show();//call for method.
	}
}
helloo 5 times
helloo 5 times
helloo 5 times
helloo 5 times
helloo 5 times

*/

class Recursion{
	

	static int show(int n)//recursion method
	{
		
		if(n==4)
		{
			return n;
		}
		else 
		{
			return 2*show(n+1);
			
			//n==2 then 2*show(3)
			//n==3 then 2*2*show(4)
			
		}
		
	}
	public static void main(String args[])
	{
        System.out.println(show(2));//call for method.
	}
}

