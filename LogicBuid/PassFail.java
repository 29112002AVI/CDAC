/*
Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in. 
*/
	class PassFail
	{
		public static void main(String[]args)
		{
			int english = 48;
			int maths = 80;
			int sci =56 ;
			int marks;
			int subject = 1;
			if(english>40)
			{
				if(maths>40 && sci>40)
				{
					System.out.println("Congrat you passed the exam:)");
				}
				else if(english<=40)
				{
					System.out.println("you failed in english");
					if(maths<40 && sci<40)
					{
						System.out.println("you failed in maths and sci too");
					}
					else if(maths>40)
					{
						System.out.println("you pass in maths ");
					}		
				}
				else if(maths<40)
				{
					System.out.println("you failed in maths");
				}
				else if(sci<40)
				{
					System.out.println("you failed in maths");
				}
			}
			else
			{
				System.out.println("TRy again!!");
			}
			switch(subject)
			{
				case 1:
					if(english<40)
					{
						System.out.println("you failed e");					
					}
					else
					{
						System.out.println("you passed e");
					}	
				case 2:
					if(maths<40)
					{
						System.out.println("you failed m");					
					}
					else
					{
						System.out.println("you passed m");
					}
				case 3:
					if(sci<40)
					{
						System.out.println("you failed s");					
					}
					else
					{
						System.out.println("you passed s");
					}
				break;
			default:
				System.out.println("...........");
			}
		}
	}