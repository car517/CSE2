import java.util.Scanner;

public class RandomGames {
    
    public static void main (String[] args) {
        Scanner myScanner;
        myScanner= new Scanner (System.in); 
        game=0;
        System.out.print(" What is your game of choice? ( Roulette(R,r) Craps (C,c) Picking card from deck (P,p) ");
        game= myScanner.hasNext();
        if ( (game.equals("R") ) || (game.equals("r")) || (game.equals("C")) || (game.equals("c")) ||  (game.equals("P")) || (game.equals("p")) ) {
            System.out.println("say that");
            
        }
        else {
            System.out.print("You did not enter a valid game"); return;
        }

        
    }
}
    

