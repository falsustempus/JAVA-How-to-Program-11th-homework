/*
 * Program: raceTrack.class
 * Programmer: s11159019
 * Date: 2023/10/7
 * */
public class raceTrack {
	private char[] tortoiseTrack;	// A char array to display tortoise's race track
	private char[] hareTrack;		// A char array to display hare's race track
	public String[] raceReport;		// A char array to store race report, mostly "OUCH!!!"
	
	// initialize 
	public raceTrack() {
		tortoiseTrack = new char[71]; 	// race's track has 70 long
		hareTrack = new char[71]; 		// race's track has 70 long	
		raceReport = new  String[1];	// 1 space to store "OUCH!!!"
	}	

	
	/* tortoise track should be like  _______ initial
		, and be like _____T___	to represent tortoise's position */
	public void setTortoiseTrack(int index , char data) {
		tortoiseTrack[index] = data;
	}
	
	/* hare track should be like  _______ initial
	, and be like _____H___	to represent hare's position */
	public void setHareTrack(int index , char data) {
		hareTrack[index] = data;
	}
	
	
	// set string in raceReport
	public void setRaceReport(int index , String data) {
		raceReport[index] = data;
	}
	
	// get race repost
	public String getRaceReport() {
		return raceReport[0];
	}
	
	// show tracks
	public void showTracks() {
		
		// first, print tortoise's track
		for(int i=0;i<70;i++) {
			System.out.print(tortoiseTrack[i]);
		}
		System.out.println();
		
		// second, print hare's track
		for(int i=0;i<70;i++) {
			System.out.print(hareTrack[i]);
		}
		System.out.println();
		
		// third, print race report
		for(int i=0;i<1;i++) {
			System.out.print(raceReport[i]);
		}
		System.out.println();
		
	}
}
