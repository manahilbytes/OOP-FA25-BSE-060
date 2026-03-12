import java.util.Random;

public class Deck{
    private String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
    private String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private Card[] cards;

   private int nextCard;//index of neext card to be drawn

    public Deck() {
        cards = new Card[52];
        int counter = 0;
        for(int i=0;i<suits.length; i++) {
            for (int j=0; j<ranks.length; j++) {
                cards[counter++]=new Card(suits[i], ranks[j],j+1);
            }
        }
	nextCard=0;
    }

  

    public void shuffle() {
        Random random = new Random();
        for (int i=0; i<1000; i++) {
            int tempIndex = random.nextInt(52);
            Card temp = cards[0];
            cards[0] = cards[tempIndex];
            cards[tempIndex] = temp; 
        }
	nextCard=0;
    }


	public Card drawCard(){
		if(nextCard<cards.length){
			return cards[nextCard++];
	}else{
		return null;
 	 }
	}  


	public String deckDetails(){
		StringBuilder sb=new StringBuilder();
		for(Card card:cards){
			sb.append(card).append("\n");
		}
		return sb.toString();
	}


	public void displayDeck(){
		System.out.print(deckDetails());
	}
 }

