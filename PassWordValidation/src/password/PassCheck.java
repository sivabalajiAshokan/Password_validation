package password;

import java.util.Scanner;

public class PassCheck {

	public static void main(String[] args) {


		System.out.println("Enter password");
		
		Scanner pass = new Scanner(System.in);
		
		String check =	pass.next();

		int uppercase = 0;
		int lowercase = 0;
		int nums = 0;
		int splChar=0;

		if(check.length()<=8  ) {

			System.out.println("Please Enter Atlease 8 Letters");
		
		}

		else if(check.length()>=8  &&  check.length()<16)
		{

			for(int i=0; i<check.length(); i++)
			{

				if (check.charAt(0)>='A' && check.charAt(0)<='Z') 
				{
					uppercase++;
				}

				else 
				{
					System.out.println("Please enter first letter is capital");
					break;
				}
				if  (check.charAt(i)>='A' && check.charAt(i)<='Z')
				{
					uppercase++;
				}


				else if ( check.charAt(i)>='a' && check.charAt(i)<='z') 	{
					lowercase++;
				}
				else if (check.charAt(i)>='0' && check.charAt(i)<='9')
				{
					nums++;
				}
				else {
					splChar++;
				}
			}

		}
		if( (uppercase>=1) &&  (lowercase>=1) && (nums>=1) && (splChar>=1)) 
		{
			System.out.println("your password is good");
		}
		else {
			System.out.println("unvalide password");
		}
	}

}
