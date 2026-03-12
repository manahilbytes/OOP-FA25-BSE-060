import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Ask number of players
       System.out.print("Enter number of players: ");
        int n = sc.nextInt();
       sc.nextLine();
        Player[] players = new Player[n];
        for (int i=0; i<n; i++) {
           System.out.print("Enter name of player " + (i+1) + ": ");
            String name= sc.nextLine();
            players[i]= new Player(name);
        }
 
        Game game = new Game(players);
        game.startGame();

        sc.close();
    }
}