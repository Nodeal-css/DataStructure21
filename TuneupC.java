
import java.text.DecimalFormat;
import java.util.Scanner;
public class TuneupC {
	static Scanner obj = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("###.00");
	public static void main(String [] argvs)
	{
		double hrs = 0;
		char type;
		boolean ans;
		do {
			System.out.printf("Enter Vehicle type(t, b, c): ");
		type = obj.next().charAt(0);					// do while loop to collect only characters t, b, and c
		ans = vehicleType(type);						// while(condition) can't handle more than one conditions 
		}while(!(ans));									// -> that's why I made boolean method vehicleType()

		System.out.printf("Enter Duration(hrs): ");
		hrs = obj.nextDouble();
		parkCharge(type, hrs);
	}
	
	public static boolean vehicleType(char ch)
	{
		ch = Character.toLowerCase(ch);
		if(ch == 't' || ch == 'b' || ch == 'c') {        // this method will return true or false to allow only t, b and c
			return true;
		}else
		return false;
	}
	public static void parkCharge(char ch, double hrs)
	{
		switch(ch) {									 // parkCharge() will output parking charge using switch case
		   case 't':
                System.out.println("Total parking charge: PHP" + df.format(hrs * 50)); 
		   break;
		   case 'b':
			    System.out.println("Total parking charge: PHP" + df.format(hrs * 35)); 
		   break;
		   case 'c':
			    System.out.println("Total parking charge: PHP" + df.format(hrs * 20)); 
		   break;
		}
		
	}
}
