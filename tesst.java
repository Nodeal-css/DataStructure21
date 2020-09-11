
import java.util.Scanner;
import java.text.DecimalFormat;
public class tesst {
	static Scanner obj = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("###.00");
	public static void main(String[] args) {
		//A.
		int num1 = 1, num2 = 2, num3 = 3;
		
		num1 = getNum("first number: ");		// getNum() method will confirm if input is a letter or an integer
		num2 = getNum("second number: ");		// small() method will analyze the smallest integer then outputs
		num3 = getNum("third number: ");
		small(num1, num2, num3);

	}
	
	public static int getNum(String i)
	{
		int num = 0;
		boolean ans;
		do{
			System.out.printf("Enter " + i);
			if(obj.hasNextInt()) {
				num = obj.nextInt();			// I used the obj.hasNextInt() method to confirm input's an integer
				ans = true;						// display error if its a undesirable char and returns an int.
			}else {
				System.out.println("Error! Please Input an Integer ");
				ans = false;
				obj.next();
			}
		}while(!(ans));
		return num;
	}
	
	public static void small(int a, int b, int c)
	{
		if(a < b)
			b = c;								// it is like a process of elimination of bigger numbers
		else									// void method will output 
			a = c;
		if(a < b)
			c = a;
		else
			c = b;
		System.out.println("Smallest Number: " + c);
	}
	
}

