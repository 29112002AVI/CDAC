class TowerOfHanoi
{
	
	static void toh(int n, char s, char a, char d)
	{
		if(n ==1)
			System.out.println("Disc from " + s + "to" + d);
		else
		{
			toh(n-1, s, d, a);
			System.out.println("Disc from " + s + "to" + d);
			toh(n-1,a,s,d);
			
		}

	}
	public static void main(String args[])
	{
		int n=3;
		toh(n ,'A' , 'B' , 'C');
	}
}