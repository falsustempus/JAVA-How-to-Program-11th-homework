/*
 * Program: StudentGrade
 * Programmer: s11159019
 * Date: 2023/9/29
 * */

import java.util.Scanner;


public class StudentGrade {
	private String name = "";	// variable - student's name
	private char grade = ' ';	// variable - student's grade
	Scanner input = new Scanner(System.in);
	
	public StudentGrade() {
		
	}
	
	// functions to set student's name and grade 
	public void setName() {
		String name;
		System.out.print("Enter student name: ");
		name = input.nextLine();
		this.name = name;
	}
	public void setGrade() {
		char grade;
		System.out.print("Enter student grade: ");
		grade = input.nextLine().charAt(0);
		this.grade = grade;
	}
	
	// functions to get student's name and grade
	public String getName() {
		return this.name;
	}
	public char getGrade() {
		return this.grade;
	}
	
	// main function to input student's data and display them
	public static void main(String[] args) {
		// assume that there have only five students
		// initialize five student's data
		StudentGrade[] studentList = new StudentGrade[5];
		for(int i = 0 ; i < 5 ; i++) {
			studentList[i] = new StudentGrade();
		}
		
		// variables for counting each grades' people 
		int AGrade = 0;		// variable - how many students got a grade of 'A'
		int BGrade = 0;		// variable - how many students got a grade of 'B'
		int CGrade = 0;		// variable - how many students got a grade of 'C'
		int DGrade = 0;		// variable - how many students got a grade of 'D'
		int EGrade = 0;		// variable - how many students got a grade of 'E'
		int dataWrong = 0;	// variable - check whether data is inputed success
		
		// use loop to set student's data
		for(int i = 0 ; i < 5 ; i++) {
			
			// ask user to input student name
			studentList[i].setName();
			
			// ask user to input student grade
			do {
				studentList[i].setGrade();
				
				// check student grade is valid or not
				dataWrong = 0;	// reset sentinel  to 0
				switch (studentList[i].getGrade()) {
					case 'A':
						AGrade++;
						break;
					case 'B':
						BGrade++;
						break;
					case 'C':
						CGrade++;
						break;
					case 'D':
						DGrade++;
						break;
					case 'E':
						EGrade++;
						break;
					default:
						dataWrong = 1;
						System.out.print("Input grade is wrong. please enter (A/B/C/D/E) again.\n");
				}
			}while(dataWrong == 1);
		}
		
		// display the result
		System.out.printf("\nStudent name, 'Grade'\n");
		for(int i =  0 ; i < 5 ; i++) {
			System.out.printf("%s, '%c'\n",studentList[i].getName(), studentList[i].getGrade());	
		}
		System.out.println();
		
		// display each grade's student count
		System.out.println("Grade A: " + AGrade);
		System.out.println("Grade B: " + BGrade);
		System.out.println("Grade C: " + CGrade);
		System.out.println("Grade D: " + DGrade);
		System.out.println("Grade E: " + EGrade);
		
	}
}
