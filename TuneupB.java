

import java.util.Scanner;
import java.text.DecimalFormat;
public class TuneupB {
	static Scanner obj = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("###.00");
	public static void main(String[] args) {
		//B
		weekdays();                        
		            
	}
	public static int getNum(String i)
	{
		int num = 0;                           
		boolean ans;                           
		do{
			System.out.printf(i);					// I used the obj.hasNextInt() method to confirm input's an integer
			if(obj.hasNextInt()) {					// display error if its a undesirable char and returns an int.
				num = obj.nextInt();
				ans = true;
			}else {
				System.out.printf("Error! Please Input an Integer \n");
				ans = false;
				obj.next();
			}
		}while(!(ans));
		return num;
	}
	
	
	public static void weekdays()
	{
		String str = "", prompt;
		int day = 0;
		
		do {
			prompt = (day < 0 || day > 6)?"Invalid input: ":"";
			System.out.printf(prompt);
			day = getNum("Please Enter a value from (0-6):");
		}while(day < 0 || day > 6);
		//System.out.println("day: " + day);
		switch(day) {
			case 0:
				str = "Sunday";                 // the prompt inside do while encountered minor error
			break;                              // in which I blindly prompt an error instead of not
			case 1:
				str = "Monday";
			break;
			case 2:
				str = "Tuesday";
			break;
			case 3:
				str = "Wednesday";
			break;
			case 4:
				str = "Thursday";
			break;
			case 5:
				str = "Friday";
			break;
			case 6:
				str = "Saturday";
			break;
		}
		System.out.println("Output: " + str);
	}
	
}
