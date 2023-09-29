/*
 *Program: Clock Class
 *Programmer: s111589019
 *Date:2023/9/25
 * */
public class ClockTest {
	public static void main(String[] args) {
		Clock time = new Clock(0,0,0);	// set time to 0:0:0
		System.out.printf("test1. set time to 0:0:0\n>>>\t");
		time.displayTime();
        System.out.printf("\n");
		
		// set time to 24:00:00
		time.set_hour(24);
		System.out.printf("test2. set time to 24:00:00\n>>>\t");
		time.displayTime();
		System.out.printf("\n");
		
		// set time to 00:60:00
		time.set_minute(60);	
		System.out.printf("test3. set time to 00:60:00\n>>>\t");
		time.displayTime();
        System.out.printf("\n");
		
		// set time to 00:00:60
		time.set_second(60);
		System.out.printf("test4. set time to 00:00:60\n>>>\t");
		time.displayTime();
        System.out.printf("\n");
		
		// set time to 12:30:30
		time.set_hour(12);
		time.set_minute(30);
		time.set_second(30);
		System.out.printf("test5. set time to 12:30:30\n>>>\t");
		time.displayTime();
		
	}
}
