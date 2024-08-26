class IfElse{
	public static void main(String[]args)
	{
		int age = 2;
		byte ace = 999;
		System.out.println((int)ace);
		/*if(age>18){
			System.out.println("Congrats!!You are legal:)");	
		}
		else{
			System.out.println("Try after some years bro:(");
		}
		System.out.println("Hello CDAC");*/
		
		switch(age)
		{
			/*if(age<18){
				System.out.println("you are minor");
			}
			else if(age>18 && age<25){
				System.out.println("you have to work now:)");
			}
			else if(age>25){
				System.out.println("TAX dept");
			}*/
			case 1:
			if(age<18){
				System.out.println("you are minor");
			}
			break;
			
			case 2:
			System.out.println("you have to work now:)");
			break;
			
			case 4:
			if(age>25){
				System.out.println("TAX dept");
			}
			break;
			
		}	
	}
	
		
}