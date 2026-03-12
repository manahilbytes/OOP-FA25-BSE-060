public class Game {

    private Player[] players;
    private Deck deck;
    private StringBuilder sb;

    public Game(Player[] players) {
        this.players = players;
        this.deck = new Deck();
        deck.shuffle();
        this.sb = new StringBuilder();
    }

    //Start the game
    public void startGame() {
        drawCards();
        findWinner();
        showScores();
    }

    //Players draw cards
    private void drawCards() {
        for (Player p:players) {
            p.setCard(deck.drawCard());
            sb.append(p.getName()).append("  drew  ").append(p.getCard()).append("\n");
        }
    }

    //Find winner and update score
    private void findWinner() {
        Player winner = players[0];
        for (Player p : players) {
            if (p.getCard().getValue() > winner.getCard().getValue()) {
                winner = p;
            }
        }
        winner.addScore();
        sb.append(winner.getName()).append(" wins\n");
    }

    //show final scores
    private void showScores() {
        sb.append("\nScores:\n");
        for(Player p:players) {
            sb.append(p.getName()).append(" : ").append(p.getScore()).append("\n");
        }
        System.out.println(sb.toString());
    }
}