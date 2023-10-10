/*
 * Program: tortoise.class
 * Programmer: s11159019
 * Date: 2023/10/7
 * */
public class tortoise {
	
	private int position = 0;	// variable - tortoise's position
	
	// initialize tortoise's position
	public tortoise() {
		
	}
	public tortoise(int position) {
		this.position = position;
	}
	
	// set tortoise's position
	public void setTortoise(int position) {
		this.position = position;
	}
	
	// get tortoise's position
	public int getTortoise() {
		return this.position;
	}
	
	// move tortoise by a random integer
	public void moveTortoise(int random) {
		if(random>=1 && random <=5) {
			FastPlod();				// 50%
		}
		else {
			if (random>=6 && random <=7) {
				Slip();				// 20%
			}
			else {
				if (random>=8 && random <=10) {
					SlowPlod();		// 30%
				}
			}
		}
	}
	
	// tortoise's move type
	private void FastPlod() {			// 50%
		if( (getTortoise()+3) > 69 ) {	// avoid position　exceed 70
			this.position = 69 ; 		
		}
		else {
			this.position += 3;			// 3 squares to the right
		}
	}
	private void Slip() { 				// 20%
		if( getTortoise() >= 6 ) {		// avoid position lower than 0
			this.position -= 6;			// 6 squares to the left
		}
		else {
			this.position = 0;			
		}
	}
	private void SlowPlod() {			// 30%
			this.position += 1;			// 1 square to the right
	}
}
