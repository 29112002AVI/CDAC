class MissingNum{
	
	static int missnum(int n, int[] arr){
		int sum =0;
		for(int i = 0 ; i <n-1 ; ++i)
		{
			sum+=arr[i];
		}
		int expsum = (n*(n+1))/2;
		System.out.println(" >>>>");
		return expsum - sum;
	}
	
	
	public static void main(String args[])
	{
		
		int[] arr = {1,2,4,5,6,7,10};
		System.out.println(missnum(10 , arr));
		
	}
}