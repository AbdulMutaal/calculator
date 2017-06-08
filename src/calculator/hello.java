package calculator;
import java.util.Scanner;

public class hello {
	public static void main(String a[])
	{
		System.out.println("Welcome to calculator");
		double c,b,result;
		int choice;
		System.out.println("MENU:/n1.Addition/n2.Subtraction/n3.Multiplication/n4.Division");
		System.out.println("/nWhat do you want to do?");
		Scanner y = new Scanner(System.in);
		choice = y.nextInt();
		
		if(choice == 1)
		{
			System.out.println("Enter the first Variable: ");
			c = y.nextDouble();
			System.out.println("Enter another Variable: ");
			b = y.nextDouble();
			System.out.print("Result: ");
			result = c + b;
			System.out.print(result);
		}
		
		
	}

}
