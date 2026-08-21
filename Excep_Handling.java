import java.util.*;

class TooYoungException extends RuntimeException
{
	TooYoungException(String message)
	{
		super(message);
	}
}

class TooOldException extends RuntimeException
{
	TooOldException(String message)
	{
		super(message);
	}
}

class Excep_Handling
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter your age");
		age = sc.nextInt();

		if(age < 18)
		{
			throw new TooYoungException(" Teenager ");
		}
		else if(age > 60)
		{
			throw new TooOldException(" raSenior Citizen ");
		}
		else
		{
			System.out.println("Ahhhh baha habu !!!");
		}
		

	}
}