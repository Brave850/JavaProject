import java.util.*;

class invalidNaturalSeriesException extends Exception {

	invalidNaturalSeriesException(String s) {
		super(s);
	}
}
class Fibonacci {

	public int firstNum = 0;
	public int secondNum = 1;
	private int sum =firstNum + secondNum;
	private int prevNum = 0;
	private int nextNum =1 ;

	public int fibonacciSeries() {
		sum = nextNum + prevNum;
		prevNum = nextNum;
		nextNum = sum;
		return sum;
	}
}

class test {
	public static void main(String args[]) /*throws invalidNaturalSeriesException*/ {
		
		Scanner sc = new Scanner(System.in);
	try {
	
		Fibonacci fi = new Fibonacci();
		System.out.print("Enter a limit for fibonacci series: ");
		int n = sc.nextInt();
		System.out.println("");
	if(n<1)
		throw new invalidNaturalSeriesException("Not Valid\nPlease Enter a number more than 1");
	else if(n==1)
		System.out.print("First Member of Fibonacci Series is: 0");
	else if(n==2)
		System.out.print("First Two Members of Fibonacci Series are: 0, 1");
	else {	
		int fibo[] = new int[n];

		fibo[0] =0;
		fibo[1] = 1;
		
		for(int i=2;i<n;i++)
		{
			fibo[i] = fi.fibonacciSeries();
		}
		System.out.println("The Respective Fibonacci Series is: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(fibo[i]);
			if(i!=n-1)
				System.out.print(", ");
			if(i==n-1)
				System.out.print(".");
		}
	System.out.println("");
	}
	}
	catch( invalidNaturalSeriesException ex) {System.out.println(ex.getMessage());}
	}		
}

