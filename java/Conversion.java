import java.util.*;
class Conversion {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int minute = sc.nextInt();
		test con = new test();
		
		if(minute >= 525600)
		{
			con.minuteToYear(minute);
		}
		else if(minute < 525600 && minute>=1440) 
		{
			con.minuteToDays(minute);
		}
		else if(minute >=60 && minute<1440) 
		{
			con.minuteToHour(minute);
		}
		else if(minute<0){System.out.println("Sorry no such minute exits");}
		else
		{
			int sec = minute*60;
			System.out.println(minute + " minutes is approximately "+sec+" seconds ");
		}
	}		
}

class test
{
	public static void minuteToYear(int minute){
			int years = (int)(minute/525600);
			int reminder = minute%525600;
			int days = (int)(reminder/1440);
			if(reminder !=0) 
			{
				System.out.println(minute + " minutes is approximately "+years+" years and "+ days+" days");
			}
			else 
			{
				System.out.println(minute + " minutes is approximately "+years+" years ");
			}
	}
	public static void minuteToDays(int minute){
			int days = (int)(minute/1440);
			System.out.println(minute + " minutes is approximately "+days+" days ");
	}
	public static void minuteToHour(int minute){
			int hour = (int)(minute/60);
			int sec = (int)(minute%60);
			if(sec>0)
			{
				System.out.println(minute + " minutes is approximately "+hour+" hour and "+ sec+" seconds");
			}
			else 
			{
				System.out.println(minute + " minutes is approximately "+hour+" hour  ");
			}
		}
}
