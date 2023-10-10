/*
 * Program: Card.class		- define 1張撲克牌
 * Programmer: s11159019
 * Date: 2023/10/9
 * */
public class Card {
	// 撲克牌 花色
	//{"Hearts", "Diamonds", "Clubs", "Spades"}
	private String suit = ""; 

	// 撲克牌 點數
	/*{"Ace", "Deuce", "Three", "Four", "Five", "Six",
	 *	"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"}; 
	 * */
	private String face = ""; 
	
	// initialize Card
	public Card(String face, String suit) {
		this.suit = suit;
		this.face = face;	
	}
	
	// get a card's suit & face
	public String getSuit() {
		return suit;
	}
	public String getFace() {
		return face;
	}
	
	// toString function to display a card
	public String toString() {
		return face+" of "+suit;
	}
}
