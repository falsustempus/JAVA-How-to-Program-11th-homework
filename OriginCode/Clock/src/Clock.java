/*
 *Program: Clock Class
 *Programmer: s111589019
 *Date:2023/9/25
 * */
public class Clock {
	private int hour = 0;		// variable - hour (type int)
	private int minute = 0;		// variable - minute (type int)
	private int second = 0;		// variable - second (type int)
	
	public Clock() {
		
	}
	
	// initialize the three variables
	public Clock(int hour, int minute, int second) {
		if(hour > 23 || minute > 59 || second > 59) {
			minute = 0;
			second = 0;
			hour = 0;
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// set function for the three variables
	public void set_hour(int hour) {
		if(hour > 23 || minute > 59 || second > 59) {
			hour = 0;
			this.minute = 0;
			this.second = 0;
		}
		this.hour = hour;
	}
	public void set_minute(int minute) {		
		if(hour > 23 || minute > 59 || second > 59) {
			this.hour = 0;
			minute = 0;
			this.second = 0;
		}
		this.minute = minute;
	}
	public void set_second(int second) {
		if(hour > 23 || minute > 59 || second > 59) {
			this.hour = 0;
			this.minute = 0;
			second = 0;
		}
		this.second = second;
	}
	
	// get function for the three variables
	public int get_hour() {
		return this.hour;
	}
	public int get_minute() {
		return this.minute;
	}
	public int get_second() {
		return this.second;
	}
	
	// display the time in an "hh:mm:ss" form
	public void displayTime() {
		System.out.printf("Currrent Time:%2d:%2d:%2d",get_hour(),get_minute(),get_second());
	}
}
