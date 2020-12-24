import java.util.*;

class InvalidNaturalNumberSequenceException extends Exception {
	public InvalidNaturalNumberSequenceException(String s)
	{
		super(s);
	}
}
class myCaptain {


	 static int fibonacci(int n)
	 {
		if(n <= 1)
			return n;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String args[])    {
		
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.print("Enter a limit for fibonacci series: ");
			int n = sc.nextInt();
			System.out.println("");
			if(n<1)
				throw new InvalidNaturalNumberSequenceException("       !!!!!!!!!!  Not Valid  !!!!!!!!!!\n\nPlease Enter a Natural Number which Starts from 1");
			System.out.println("The Respective Fibonacci Series is: ");
			for(int i=0;i<n;i++)
			{
				System.out.print(fibonacci(i));
				if(i<n-1)
					System.out.print(", ");
			}
		System.out.println("");
		}
		catch(InvalidNaturalNumberSequenceException e)
		{
			System.out.println(e.getMessage());
		}
	
}
}
