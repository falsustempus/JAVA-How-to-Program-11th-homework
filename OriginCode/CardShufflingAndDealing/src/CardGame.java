/*
 * Program: CardGame.class - 模擬抽撲克牌遊戲
 * Programmer: s11159019
 * Date: 2023/10/9
 * */

public class CardGame {
	public static void main(String[] args) {
		// initialize a deck of cards
		DeckOfCard myDeckOfCard = new DeckOfCard();
		myDeckOfCard.Shuffle();
		
		final int aHand = 5;
		
		// deal 5 card for player1
		Card[] Player1 = new Card[5];
		System.out.println("Hand 1:");
		for(int i = 0 ; i < aHand ; i++) {
			Player1[i] = new Card( myDeckOfCard.Deal().getFace(),  myDeckOfCard.Deal().getSuit());
			System.out.printf("\t%s\n",Player1[i].toString());
		}
		patternCheck(check(Player1));
		
		// deal 5 card for player2
		Card[] Player2 = new Card[5];
		System.out.println("Hand 2:");
		for(int i = 0 ; i < aHand ; i++) {
			Player2[i] = new Card( myDeckOfCard.Deal().getFace(),  myDeckOfCard.Deal().getSuit());
			System.out.printf("\t%s\n",Player2[i].toString());
		}
		patternCheck(check(Player2));
		
		// do compare
		/*
		 * 	if one of them have pattern(1~8), while another has not, 
		 * 	then the one have pattern win
		 **/
		System.out.println();
		if(check(Player1) == check(Player2)) {
			// both of them have same pattern( include no pattern )
			System.out.printf("Both of them have same pattern.");
		}
		else {
			if(check(Player1) < check(Player2)) {
				System.out.printf("Hand 1's cards are better.");
			}
			else {
				System.out.printf("Hand 2's cards are better.");
			}
		}

		/* 			Cards Pattern
		 * case 1: Straight Flush
		 * 		同花順
		 * case 2 : four of a kind	
		 * 		(e.g., four aces)
		 * case 3 : full house		
		 * 		(i.e., two cards of one face value and three cards of another face value)
		 * case 4 : flush
		 *  	(i.e., all five cards of the same suit)
		 * case 5 : straight
		 *  	(i.e., five cards of consecutive face values)
		 * case 6 : three of a kind
		 * 		(e.g., three jacks)
		 * case 7 : two pairs
		 * 
		 * case 8 : a pair
		 * 
		 * case 999 : none of them
		 * 
		 * */
	}

	public static int check(Card[] Hand) {
		// output of this function, initialize to 999 
		int pattern = 999;
		
		// Count {"Hearts", "Diamonds", "Clubs", "Spades"}'s cards
		int[] suitsCount = {0,0,0,0};
		for(int i = 0 ; i < 5 ; i++) {
			switch( Hand[i].getSuit() ) {
			// check how many cards have from each suit
				case "Hearts":
					suitsCount[0]+=1;
					break;
				case "Diamonds":
					suitsCount[1]+=1;
					break;
				case "Clubs":
					suitsCount[2]+=1;
					break;
				case "Spades":
					suitsCount[3]+=1;
					break;
				default:
					break;
			}
		}
		
		// store face in a array
		int[] faceCount = new int[13];
		for(int i = 0; i < 13 ; i++) {
			faceCount[i] = 0;
		}
		for(int i = 0 ; i < 5 ; i++) {
			switch(Hand[i].getFace()) {
			case "Ace":
				faceCount[0]+=1;
				break;
			case "Deuce":
				faceCount[1]+=1;
				break;
			case "Three":
				faceCount[2]+=1;
				break;
			case "Four":
				faceCount[3]+=1;
				break;
			case "Five":
				faceCount[4]+=1;
				break;
			case "Six":
				faceCount[5]+=1;
				break;
			case "Seven":
				faceCount[6]+=1;
				break;
			case "Eight":
				faceCount[7]+=1;
				break;
			case "Nine":
				faceCount[8]+=1;
				break;
			case "Ten":
				faceCount[9]+=1;
				break;
			case "Jack":
				faceCount[10]+=1;
				break;
			case "Queen":
				faceCount[11]+=1;
				break;
			case "King":
				faceCount[12]+=1;				
				break;
			default:
				break;
			}
		}
		
		// check cards' pattern
		// case 1 Straight Flush
		for(int i = 0 ; i < 4 ; i++) {
			if(suitsCount[i] == 5) {
				// five cars have same suit
				if(faceCount[0] == 1) {
					// if contains 1 Ace, check whether it can be (A,2,3,4,5) or (10,J,Q,K,A)
					if(faceCount[1] == 1) {
						if(faceCount[2] == 1) {
							if(faceCount[3] == 1) {
								if(faceCount[4] == 1) {
									// it's (A,2,3,4,5)
									pattern = 1;
									//System.out.println("it's a Straight Flush!");
									return pattern;
								}
							}
						}
					}
				}
				else {
					// check whether it is  (10,J,Q,K,A)
					if(faceCount[12] == 1) {
						if(faceCount[11] == 1) {
							if(faceCount[10] == 1) {
								if(faceCount[9] == 1) {
									// it's (10,J,Q,K,A)
									pattern = 1;
									//System.out.println("it's a Straight Flush!");
									return pattern;
								}
							}
						}
					}	
				}
				// it does not contain Ace, so straight should have 5 number consecutively
				// (i.e., 2,3,4,5,6) or (9,10,J,Q,K)
				for(int j = 0 ; j < 8 ; j++) {
					if(faceCount[j] == 1) {
						if(faceCount[j+1] == 1) {
							if(faceCount[j+2] == 1) {
								if(faceCount[j+3] == 1) {
									if(faceCount[j+4] == 1) {
										// five number consecutively
										pattern = 1;
										//System.out.println("it's a Straight Flush!");
										return pattern;
									}	
								}	
							}	
						}	
					}	
				}
			}
		}
		
		// case 2 four of a kind
		for(int i = 0 ; i < 13 ; i++) {
			if(faceCount[i] == 4) {
				// a four of a kind
				pattern = 2;
				//System.out.println("it's a four of a kind!");
				return pattern;
			}
		}
		
		// case 3 full house
		for(int i = 0 ; i < 13 ; i++) {
			if(faceCount[i] == 3) {
				// three cards of same face value
				for(int j = 0 ; j < 13 ; j++) {
					if(faceCount[j] == 2) {
						// two cards of same face value
						pattern = 3;
						//System.out.println("it's a full house!");
						return pattern;
					}
				}
			}
		}
		
		// case 4 flush
		for(int i = 0 ; i < 4 ; i++) {
			if(suitsCount[i] == 5) {
				// a flush
				pattern = 4;
				//System.out.println("it's a flush!");
				return pattern;
			}
		}
		
		// case 5 straight
		// Ace can be (A,2,3,4,5) or (10,J,Q,K,A)
		// check whether hand contain Ace
		if(faceCount[0] == 1) {
			// if contains 1 Ace, check whether it can be (A,2,3,4,5) or (10,J,Q,K,A)
			if(faceCount[1] == 1) {
				if(faceCount[2] == 1) {
					if(faceCount[3] == 1) {
						if(faceCount[4] == 1) {
							// it's (A,2,3,4,5)
							pattern = 5;
							//System.out.println("it's a straight!");
							return pattern;
						}
					}
				}
			}
		}
		else {
			// check whether it is  (10,J,Q,K,A)
			if(faceCount[12] == 1) {
				if(faceCount[11] == 1) {
					if(faceCount[10] == 1) {
						if(faceCount[9] == 1) {
							// it's (10,J,Q,K,A)
							pattern = 5;
							//System.out.println("it's a straight!");
							return pattern;
						}
					}
				}
			}	
		}
		// it does not contain Ace, so straight should have 5 number consecutively
		// (i.e., 2,3,4,5,6) or (9,10,J,Q,K)
		for(int i = 0 ; i < 8 ; i++) {
			if(faceCount[i] == 1) {
				if(faceCount[i+1] == 1) {
					if(faceCount[i+2] == 1) {
						if(faceCount[i+3] == 1) {
							if(faceCount[i+4] == 1) {
								// five number consecutively
								pattern = 5;
								//System.out.println("it's a straight!");
								return pattern;
							}	
						}	
					}	
				}	
			}	
		}
		
		// case 6 three of a kind
		for(int i = 0 ; i < 13 ; i++) {
			if(faceCount[i] == 3) {
				// three cards have same value
				pattern = 6;
				//System.out.println("it's a three of a kind!");
				return pattern;
			}
		}
		
		// case 7 two pairs
		for(int i = 0 ; i < 13 ; i++) {
			if(faceCount[i] == 2) {
				pattern = 8;
				// two cards have same value, it need another two cards have same value
				for(int j = i+1; j < 13; j++) {
					if(faceCount[j] == 2) {
						// find second pair 
						pattern = 7;				
						//System.out.println("it's a two pairs!");
						return pattern;
					}
				}
			}
		}
		if(pattern == 8) {
			//System.out.println("it's a pair!");
		}
		//       COMBINE CASE 8 TO CASE 6
		//				(a pair)   (two pairs)
		// case 8 a pair
		//for(int i = 0 ; i < 13 ; i++) {
		//	if(faceCount[i] == 2) {
		//		// two cards have same value
		//		pattern = 7;
		//		return pattern;
		//	}
		//}
		
		return pattern;
	}
	
	public static void patternCheck(int pattern) {
		switch(pattern) {
		case 1 :
			System.out.println("it's a Straight Flush!!!");
			break;
		case 2:
			System.out.println("it's a four of a kind!");
			break;
		case 3 :
			System.out.println("it's a full house!");
			break;
		case 4 :
			System.out.println("it's a flush!");
			break;
		case 5 :
			System.out.println("it's a straight!");
			break;
		case 6 :
			System.out.println("it's a three of a kind!");
			break;
		case 7 :
			System.out.println("it's a two pairs!");
			break;
		case 8 :
			System.out.println("it's a pair!");
			break;
			
		}
	}
}
