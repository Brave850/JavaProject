import java.util.Scanner;
class test {
	
	public static void main (String[] args) {
	
	Scanner sc =new Scanner(System.in);
	System.out.print("(1. Addition\t 2. Substraction\t 3. Mulitiplication\t 4. Division )\nEnter your Choice: ");
	int choice = sc.nextInt();
	
	System.out.print("\nEnter the value of a: ");
	int a = sc.nextInt();
	System.out.print("\nEnter the value of b: ");
	int b = sc.nextInt();
	switch(choice)
	{
		case 1: 
		{
			System.out.println("\nAddition of "+a+" and "+b+" is: "+(a+b));
			break;
		}
		case 2: 
		{
			System.out.println("\nSubstraction of "+a+" and "+b+" is: "+(a-b));
			break;
		}
		case 3: 
		{
			System.out.println("\nMultiplication of "+a+" and "+b+" is: "+(a*b));
			break;
		}
		case 4: 
		{
			System.out.println("\nDivision of "+a+" and "+b+" is: "+(a/b));
			break;
		}
	}
	}

	
	
}
