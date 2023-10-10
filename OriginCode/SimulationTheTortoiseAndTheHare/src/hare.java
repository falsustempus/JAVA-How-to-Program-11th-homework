/*
 * Program: hare.class
 * Programmer: s11159019
 * Date: 2023/10/7
 * */
public class hare {
	
	private int position = 0; // variable - hare's position
	
	// initialize hare's position
	public hare() {
		
	}
	public hare(int position) {
		this.position = position;
	}
	
	// set hare's position
	public void setHare(int position) {
		this.position = position;
	}
	
	// get hare's position
	public int getHare() {
		return this.position;
	}
	
	// move hare by a random integer
	public void moveHare(int random) {
		if(random>=1 && random <=2) {
			Sleep();						// 20%
		}
		else {
			if (random>=3 && random <=4) {
				BigHop();					// 20 % 
			}
			else {
				if (random == 5) {
					BigSlip();				// 10%
				}
				else {
					if (random >= 6 && random <= 8) {
						SmallHop();			// 30%
					}
					else {
						if(random >=9 && random <=10) {
							SmallSlip();	// 20%
						}
					}
				}
			}
		}
	}
	
	// hare's move type
	private void Sleep() {			// 20%
									// No move at all
	}	
	private void BigHop() {			// 20%
		if( (getHare()+9) > 69) {		// avoid position　exceed 70
			this.position = 69 ; 
		}
		else {
			this.position += 9;			// 9 squares to the right
		}
	}
	private void BigSlip() {		// 10% 
		if( getHare() >= 12 ) {		// avoid position lower than 0
			this.position -= 12;	// 12 squares to the left
		}
		else {
			this.position = 0;
		}
								
	}
	private void SmallHop() {		// 30%
		this.position += 1;			// 1 square to the right
	}
	private void SmallSlip() {		// 20% 
		if( getHare() >= 2 ) {		// avoid position lower than 0
			this.position -= 2;		// 2 square to the left
		}
		else {
			this.position = 0;
		}
		
	}
}
