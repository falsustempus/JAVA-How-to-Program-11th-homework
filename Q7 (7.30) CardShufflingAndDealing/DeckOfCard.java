/*
 * Program: DeckOfCard.class - define 1副撲克牌(52張)
 * Programmer: s11159019
 * Date: 2023/10/9
 * */

// import random number
import java.security.SecureRandom;


public class DeckOfCard {
	// a variable for random number
	private SecureRandom randomNumber = new SecureRandom();	
	private static final int NumbersOfADeck = 52;				// a deck of cards's numbers		
	
	// declare a deck with 52 cards
	private Card[] Deck = new Card[NumbersOfADeck];
	private int currentCard = 0 ; // index of Deck of cards(0~51)
	
	// initialize a Deck of Cards
	public DeckOfCard() {
		// 撲克牌點數
		String[] face = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		
		// 撲克牌花色
		String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		// fill a deck	    or (NumbersOfADeck-1)=51
		for(int i = 0 ; i < Deck.length  ; i++ ) {
			// i from 0 ~ 51
			// each suit has 13 cards : 0~12, 13~25, 26~38, 39~51 
			// each face has 4 suits : 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 repeats
			Deck[i] = new Card(face[i%13],suit[i/13]);		
		}
	}
	
	// shuffle the deck
	public void Shuffle() {
		// initialize current card
		currentCard = 0;
		//                or (NumbersOfADeck-1)=51
		for(int i = 0 ; i < Deck.length ; i++) {
			// variable - a random number from (0~51) 共52個數字
			int nextCard = randomNumber.nextInt(NumbersOfADeck);
			
			// do swap between i and next card
			Card temp = Deck[i];		// declare a card(temp) to store deck's i card
			Deck[i] = Deck[nextCard];	// let deck's i become deck's nextCard's card
			Deck[nextCard] = temp;		// let deck's nextCard's store temp (= deck's i card)
		}
	}
	
	// deal a card
	public Card Deal() {
		// insure index is in the range (0~51)
		if(currentCard < NumbersOfADeck) {
			// deal a card and let currentCard+1 to deal next card
			return Deck[currentCard++];
		}
		else {
			currentCard = 0;
			return Deck[currentCard++];
		}
	}

}
