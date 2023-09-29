/*
 * Program: SalesComissionCalculator
 * Programmer: s11159019
 * Date: 2023/9/29
 * */

import java.util.Scanner;


public class SalesComissionCalculator {
	public static void main(String[] args) {	
		
	Scanner input = new Scanner(System.in);	// input - scanner to obtain items sold 
	
	// initializing item's sold variables
	int item1 = 0;// value = 239.99			   variable - count item 1 's sold
	int item2 = 0;// value = 129.75			   variable - count item 2 's sold
	int item3 = 0;// value = 99.95			   variable - count item 3 's sold
	int item4 = 0;// value = 350.89			   variable - count item 4 's sold
	double earnings = 0;					// output - salesperon's earning in one week
	
	// ask user to input item's sold variables
	System.out.print("Enter item 1's sold: ");
	item1 = input.nextInt();
	System.out.print("Enter item 2's sold: ");
	item2 = input.nextInt();
	System.out.print("Enter item 3's sold: ");
	item3 = input.nextInt();
	System.out.print("Enter item 4's sold: ");
	item4 = input.nextInt();
	
	// calculate earnings (200 + worth of items *9% )
	earnings = 200 + 0.09 *(item1*239.99  + item2*129.75 + item3*99.95 + item4*350.89); 
	
	// display salesperson's earnings
	System.out.printf("This salesperson get $%f this week", earnings);
	
	input.close();
	}
}
