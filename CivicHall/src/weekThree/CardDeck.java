package weekThree;

import java.util.Arrays;

public class CardDeck {
	
	public static void main(String [] args) {
		
		//Declare array and variables
		int[] deck = new int[52];
		String suit = " ",rank = " ";
	
		//Initialize card deck
		for (int i=0; i<deck.length; i++) {
			deck[i] = i;
			//System.out.print(deck[i]);
				
			
		}
		
		System.out.println(Arrays.toString(deck));
		
	
		

		//Suit Switch
		
		for (int j=0; j<deck.length; j++) {
			
			int card = (int) (Math.random()*52);
			deck[j] = card;
			
			//System.out.println(" "+ card);
		switch (deck[j]/13) {
		case 0: suit = "Spades";
				break;
		case 1: suit = "Hearts";
				break;
		case 2: suit = "Diamonds";
				break;
		case 3: suit = "Clubs";
				break;
		}
		
		//Card Rank Switch
		int number = (deck[j]%13)+1;
		
		switch (number) {
		case 1: rank = "Ace";
				break;
		case 11: rank = "Jack";
				 break;
		case 12: rank = "Queen";
				 break;
		case 13: rank = "King";
			     break;
		default: rank = String.valueOf(number);
				 break;
		}
		
		//Output Card Information
		System.out.println("The card number " + deck[j] + " is " + rank + " of " + suit + ".");
		}
		
		System.out.println(Arrays.toString(deck));
		
		
		
		
	}
}
