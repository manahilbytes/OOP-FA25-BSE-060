public class Card{
	private final String SUIT;
	private final String RANK;
	private int value;//i am using this to compare cards
	
	public Card(String suit,String rank,int value){
             this.SUIT=suit;
	     this.RANK=rank;
	     this.value=value;
	}
	
	public String getSUIT() {
		return SUIT;
	}

	public String getRANK() {
		return RANK;
	}

	public int getValue(){
		return value;
	}
	
	public String toString(){
		return String.format("%s of %s",RANK,SUIT);
	}
   }