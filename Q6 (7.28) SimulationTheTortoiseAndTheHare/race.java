/*
 * Program: race.class
 * Programmer: s11159019
 * Date: 2023/10/7
 * */
public class race {
	public static void main(String[] args) {
		
		// set tortoise and hare and their tracks
		tortoise Tortoise = new tortoise(0);
		hare Hare = new hare(0);
		raceTrack track = new raceTrack();
		
		// initialize the parameters about race
		int raceEnd = 70;
		int timer = 1;
		
	
		// initialize tortoise and hare 's position
		Tortoise.setTortoise(0);
		Hare.setHare(0);
		
		// set '_' as race track
		for(int i =0;i<70;i++) {
			track.setHareTrack( i,'_');
			track.setTortoiseTrack( i,'_');
		}

		
		track.setRaceReport(0,"\n");

		// race per second
		do {

			
			// Begin the race by displaying below
			if(timer == 1){
				System.out.println("=======================================================================");
				System.out.println("BANG !!!!!");
				System.out.println("AND THEY'RE OFF !!!!");
				track.setHareTrack( Hare.getHare(),'H');
				track.setTortoiseTrack( Tortoise.getTortoise(),'T');
			}	
			else {
				// reset tracks
				track.setHareTrack( Hare.getHare(),'_');
				track.setTortoiseTrack( Tortoise.getTortoise(),'_');
				track.setRaceReport(0,"\n");
			}
			
			
			// update animals' position
			if(timer > 1) {			
				// create a random integer to decide animals move
				int moveDecider = (int)(Math.random() * 10 + 1);
				Hare.moveHare(moveDecider);
				Tortoise.moveTortoise(moveDecider);
				
				// print OUCH when two animals on the same position
				if(Hare.getHare() == Tortoise.getTortoise()) {
					track.setRaceReport(0,"OUCH!!!");
					// set all tracks other than the H and T should be blank
					for(int i =0;i<71;i++) {
						if(Hare.getHare() != i) {
							track.setHareTrack(i,' ');
						}
						if(Tortoise.getTortoise() != i) {
							track.setTortoiseTrack(i,' ');
						}

					}
				}
				track.setTortoiseTrack( Tortoise.getTortoise(),'T');
				track.setHareTrack( Hare.getHare(),'H');
			}
			System.out.println("Tortoise's position = "+ (Tortoise.getTortoise()+1));
			System.out.println("Hare's position = "+ (Hare.getHare()+1));
			
			// show Tracks
			track.showTracks();
			
			// reset tracks if "OUCH!!" happened
			if (track.getRaceReport() == "OUCH!!!") {
				// recover all tracks other than 'H' or 'T' to '_'
				for(int i =0;i<71;i++) {
					if(i != Hare.getHare()) {
						track.setHareTrack(i,'_');
					}
					if(i != Tortoise.getTortoise()) {
						track.setTortoiseTrack(i,'_');
					}
				}
			}
			
			System.out.println("---time passed = "+timer);
			timer++;
			System.out.println("=======================================================================");
		}while(Tortoise.getTortoise() < raceEnd-1 &&
				Hare.getHare() < raceEnd-1 );

		
		// print the results
		// both animals win on the same tick of the clock
		if(Tortoise.getTortoise() == Hare.getHare()) {
			System.out.println("It's a tie. ");
		}
		else {
			// tortoise wins
			if(Tortoise.getTortoise() == raceEnd-1) {
				System.out.println("TORTOISE WINS!!! YAY!!! ");
			}
			else {
				if(Hare.getHare() == raceEnd-1) {
					System.out.println("Hare wins. Yuch.");
				}

			}
		}
		
	}
}
