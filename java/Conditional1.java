import java.util.Scanner;
class test {
	
	public static void main (String[] args) {
	
	Scanner sc =new Scanner(System.in);
	
	int age = sc.nextInt();
	if(age<18)
		System.out.println("You are not Eligible");
	else
		System.out.println("You are Eligible");
	}
	
}
