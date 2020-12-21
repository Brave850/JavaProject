import java.util.*;
import java.io.IOException;

class Employee {
public static void main(String args[]) throws IOException, InterruptedException   {

	Scanner sc = new Scanner(System.in);
	
	String name[] = new String[10];
	int yearOfJoin[] = new int[10];
	int Salary[] = new int[10];
	String place[] = new String[10];
	String pos[] = {"st","nd","rd"};
	
	System.out.print("Enter the Number of Employee: ");
	int no = sc.nextInt();

	for(int i=0;i<no;i++) 	{
		if(i<3) 
		{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			
			System.out.println("Enter "+(i+1)+pos[i]+" Employee's Name");
				name[i] = sc.next();
			System.out.println("Enter "+name[i]+"'s Year of Joinning");
				yearOfJoin[i] = sc.nextInt();
			System.out.println("Enter "+name[i]+"'s Salary");
				Salary[i] = sc.nextInt();
				sc.nextLine();
			System.out.println("Enter "+name[i]+"'s Address");
				place[i] = sc.nextLine();
		}
		else 
		{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

			System.out.print("Enter the Number of Employee: ");
			System.out.println("Enter "+(i+1)+"th"+" Employee's Name");
				name[i] = sc.next();
			System.out.println("Enter "+name[i]+"'s's Year of Joinning");
				yearOfJoin[i] = sc.nextInt();
			System.out.println("Enter "+name[i]+"'s Salary");
				Salary[i] = sc.nextInt();
				sc.nextLine();
			System.out.println("Enter "+name[i]+"'s Address");
				place[i] = sc.nextLine();
		}
	}
	new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	System.out.print("Name\tYear of Joining           Salary\t         Address");
	
	for(int i=0;i<no;i++) 
	{
		System.out.print("\n"+name[i]+"\t     "+yearOfJoin[i]+"\t\t  "+Salary[i]+"\t\t"+place[i]);
	}

}
}
