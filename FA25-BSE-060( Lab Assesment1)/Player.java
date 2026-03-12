public class Player{
	private String name;
	private int score;
	private Card card;
	
	
   public Player(String name){
	this.name=name;
	this.score=0;		
    }

    public String getName(){
        return name;
    }
	
    public int getScore(){
        return score;
    }

 public void setCard(Card c){
        this.card = c;
    }


 public Card getCard(){
        return card;
    }

public void addScore(){
        score++;
    }

   
  public void draw(Deck deck) {
        card = deck.drawCard();
    }

     public String toString(){
		return String.format("%s %d %s",name,score,card);
	}
 }