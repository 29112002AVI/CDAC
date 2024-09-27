/*
Backtracking Program.
Permutation : String

"ABC"


ABC
ACB
BAC
BCA
CAB
CBA
*/

class Backtrack1{
	
	static void display(String str, String res){
		
		if(str.length() == 0)
		{
			System.out.println(res+ "");
			return;
		}
		
		for(int i = 0 ; i<str.length(); i++)
		{
			char c = str.charAt(i); //ABC -> A
			String ros = str.substring(0 , i) + str.substring(i+1);
			//i ki bhi value increase hogi as A ko permannet karenge
			display(ros,res+c);
		}
		
	}
	
	public static void main(String args[])
	{
		String s = "ABC";
		display(s, " ");
	}
}







