/*
 *Program: BarChartPrintingProgram
 *Programmer: s11159019
 *Dare: 2023/9/29 
 * */
import java.util.Scanner;


public class BarChartPrintingProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = 0;	// input - display num1 *
		int num2 = 0;	// input - display num2 *
		int num3 = 0;	// input - display num3 *
		int num4 = 0;	// input - display num4 *
		int num5 = 0;	// input - display num5 *
		
		// five numbers should between 1 and 30
		// ask user to enter five numbers
		do{
			System.out.print("Enter number 1 : ");
			num1 = input.nextInt();
			
			// print error if number is not between 1 and 30
			if(num1 > 30 || num1 < 1) {
				System.out.println("Numbers should between 1 and 30.Please enter again.");
			}
		}while(num1 > 30 || num1 < 1); // ask user to enter again if number is not between 1 and 30   
		
		do{
			System.out.print("Enter number 2 : ");
			num2 = input.nextInt();
			
			// print error if number is not between 1 and 30
			if(num2 > 30 || num2 < 1) {
				System.out.println("Numbers should between 1 and 30.Please enter again.");
			}
		}while(num2 > 30 || num2 < 1); // ask user to enter again if number is not between 1 and 30
		
		do{
			System.out.print("Enter number 3 : ");
			num3 = input.nextInt();
			
			// print error if number is not between 1 and 30
			if(num3 > 30 || num3 < 1) {
				System.out.println("Numbers should between 1 and 30.Please enter again.");
			}
		}while(num3 > 30 || num3 < 1); // ask user to enter again if number is not between 1 and 30
		
		do{
			System.out.print("Enter number 4 : ");
			num4 = input.nextInt();
			
			// print error if number is not between 1 and 30
			if(num4 > 30 || num4 < 1) {
				System.out.println("Numbers should between 1 and 30.Please enter again.");
			}
		}while(num4 > 30 || num4 < 1); // ask user to enter again if number is not between 1 and 30
		
		do{
			System.out.print("Enter number 5 : ");
			num5 = input.nextInt();
			
			// print error if number is not between 1 and 30
			if(num5 > 30 || num5 < 1) {
				System.out.println("Numbers should between 1 and 30.Please enter again.");
			}
		}while(num5 > 30 || num5 < 1); // ask user to enter again if number is not between 1 and 30
	
		// display bar chart by using "*".repeat(num)
		System.out.printf("number 1 : %s\n", "*".repeat(num1));
		System.out.printf("number 2 : %s\n", "*".repeat(num2));
		System.out.printf("number 3 : %s\n", "*".repeat(num3));
		System.out.printf("number 4 : %s\n", "*".repeat(num4));
		System.out.printf("number 5 : %s\n", "*".repeat(num5));

		
		input.close();
	}
}
