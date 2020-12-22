import java.util.*;

class Prime {
	public static void main(String args[]) {
		int num;
		boolean isPrime;

		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		isPrime =true;
		if(num!=1 && num!=0 && num!=-1 && num!=-0)
		{
			inner: for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					isPrime = false;
					break inner;
				}
			}
		}
		if(isPrime == true)
			System.out.println(num+" is not a Prime Number");
		else
			System.out.println(num+" is a Prime Number");
	}		
}

