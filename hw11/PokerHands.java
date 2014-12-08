/////////////////////////
// Carlos Rosario
// Decemeber 4 2014
// CSE 002
// PokerHands Java Program
// Description
// Program prints users entries
// Tells hand rank

// Royal Flush ///////////////
// Straight Flush ////////////
// Four of a Kind ////////////
// Full House ////////////////
// Flush /////////////////////
// Straight //////////////////
// Two Pair //////////////////
// One Pair //////////////////
// High Card ///////////////// 
// This Program prompts user to enter a 5 card poker hand, then program return what you picked and rank of hand
import java.util.Scanner; 

public class PokerHands { //class
    
static Scanner myScanner;  //scanner decleration

    public static void main (String[] args) { //main method
       myScanner= new Scanner (System.in); //set myScanner equal to input
        boolean endall=true; //doolean decleration for terminating program
        while (endall) {  //while endall is true this will run, one the user chooses 5 cards then I set this equal to false and it will not loop anymore
            int [] hand = new int[5]; //hand array decleration
            int i = 0; //variable decleration
            boolean end=true; //boolean decleration for while loop below
            int num=0; //variable decleration 
            String input="";
            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- "); //direction to user
            input=myScanner.next();
            if ( input.equals("Y") || input.equals("y") ) { 
              
                   while (end) { // once the 5 cards are drawn then this will be false and program will direct user back to the outer loop until he chooses to quit program
                       String inputsuit=""; //suit
                       int rank=0; //rank
                       String inputrankS="";
                           System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- "); //direction to user
                           inputsuit=myScanner.next(); 
                           if ( inputsuit.equals("c") || inputsuit.equals("d") || inputsuit.equals("h") || inputsuit.equals("s") ) {
                               //if the users entry is any of the string variables above then continue below
                               System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
                            // if the users entry is an integer which is not a power card a k q or j, then it will below will happen
                                   if (myScanner.hasNextInt()) { 
                                        rank=myScanner.nextInt(); //set rank to this value
                                        if (rank>=2 && rank<=10) { //if rank is within range then continue
                                            rank=rank-2; //set rank equal to 2 less to syncronize with brian chen's method for showing hands
                                        
                                            switch(inputsuit) { // the suit user chose above will be switched within these cases, which will ass a certain amount to the rank to set it equal to the interval of that suit in a 52 card deck numbered 0 to 51 
                                                case "c": rank=rank; break;
                                                case "d": rank=rank+13; break; //if diamond add thirteen, 26 for heart, etc, to put rank in right interval 
                                                case "h": rank=rank+26; break;
                                                case "s": rank=rank+39; break;
                                            }
                                        }
                                        else {
                                            System.out.println("You have not entered a valid entry"); 
                                        }
                                   }
                                   //if the entry was a string which is a k q or j, then program will do what is below
                                   else if (myScanner.hasNext()) {
                                   inputrankS=myScanner.next();
                                       if (inputrankS.equals("a") || inputrankS.equals("k") || inputrankS.equals("q") || inputrankS.equals("j") ) { //continue if input meets these requitemtns
                                               switch (inputrankS) { //assign power card choice equal to the rank values before
                                                case "a": rank=12; break;
                                                case "k": rank=11; break;
                                                case "q": rank=10; break;
                                                case "j": rank=9; break;
                                               }
                                               switch(inputsuit) { //put rank in right interval, because our deck is numbered 0 to 51
                                                case "c": rank=rank; break;
                                                case "d": rank=rank+13; break;
                                                case "h": rank=rank+26; break;
                                                case "s": rank=rank+39; break;
                                               }
                                        }
                                        else {
                                            System.out.println("You have not entered a valid entry"); 
                                        }
                                   }
                                hand[num]=rank; //array for hand, num is the variable that increments from 0 to 4 for 5 cards
                                int counterforsamecard=0;
                                for (int p=0; p<=num; p++) {
                                    for (int f=p+1; f<=num; f++) {
                                        if (hand[p]==hand[f]) {
                                            counterforsamecard++; // this for loop checks to see if user entered same card 
                                        }
                                    }
                                }
                                if (counterforsamecard==0) { //continue only if there were not any repears in card choice, in which counterforsamecard would be zero
                                    rank=0; //set rank to zero so it doesnt hold same value when looped
                                    num++; //if there wasnt a repeat in card increment num so we can choose the value for next value in array
                                    if (num==5) { //if num increments to 5, which would be the 6th card
                                        showOneHand(hand); //run this method that shows 5 cards
                                        handresult(hand); //run this method that shows your hand rank
                                        end=false; //set end equal to false so inner while loop would stop
                                    }
                                }
                                else {
                                    System.out.println("You have already chosen that card"); //program would not increment and the array value would be changed until user chooses card that hasnt been chosen
                                }
                              
                           }
                           else {
                            System.out.println("You did not enter a valid response"); 
                           }
        
                      
                   }
                   
            }
            else {
            System.out.println("You have chosen to quit"); endall=false; break; //stop while loop if user chose to end program
            }       
                   
                   
        }   
        
    }
    
    public static void handresult (int[] hand) { //method for showing hand rank
        //variable decleration
        int min=0;
        int counterforflush=0;
        int counterforstraight=0;
        int counterforhighcard=0;
        int temp=0;
        sort(hand); //method I created to sort the cards in hand array in numerical ascending order, in which we need to check for a straight
        for (int i=0; i < hand.length; i++) { // first loop for the first value in array list, keeps incrementing untill finds duplicates
            for (int j=i+1; j<hand.length; j++) { // second loop for every value after the first
                if (hand[i]/13==hand[j]/13) { //if at any point the first number is equal to the input values after, return true
                  counterforflush++; //counter adding one for everytime there are duplicates
                }
            }
        }
        for (int i=0; i<hand.length; i++) { //for loop for checking to see if any cards repeat in rank number
            for (int j=i+1; j<hand.length; j++) {
                if ( (hand[i]%13)==(hand[j]%13) ) { //%13 will show what rank number
                    counterforhighcard++; //this will increment everytime theres a pair
                }
            }
        }
        for (int i=0; i<(hand.length-1); i++) { //for loop to count for straight
                 if ( ( (hand[i+1]%13) - (hand[i]%13) ) == 1 ) { //this will check to see if the difference between the numbers next to each other is one
                     counterforstraight++; //will increment everytime the difference in number is 1, which is an order liek 4 then 5 or 5 then 6
                 }
        }
        if (counterforflush==10) { //if there are 5 cards of the same suit, or a flush, then my counterforflush above would increment to 10
             if (counterforstraight==4) { //if there is a straight then the counter for straught would incrmeent to 4 because of the difference
                 if (hand[0]==8) { //if the first number in the sorted array is 10 in rank, or 8 in the array then it is a royal flush
                 System.out.println("You have a Royal Flush");
                 }
                 else {
                 System.out.println("You have a Straight Flush"); //if the first number is not 10 then it is just a straight flush
                 }
             }
             
             else {
                 System.out.println("You have a Flush"); //if the counterforstraight is not 4 then you just a 5 cards of the same suit, or a flush
             }
                
        } 
        else if (counterforstraight==4 && counterforflush != 10 ) { //if you dont have 5 cards of the same suit but have a straight then print this
            System.out.println("You have a Straight");
        }
        else if (counterforhighcard==0 && counterforflush != 10 && counterforstraight != 4) { //if counterforhigh card is zero, which would mean no pairs and you dont have 5 cards of the same rank and numbers arent a stragiht then you just have a high card
            System.out.println("You have a High Card");
        }
        else if (counterforhighcard>=1 && counterforhighcard<=6 && counterforflush != 10) { //if counterforhighcard is between 1 and 6 then you have a couple of options, in which will be specified belwo
            if (counterforhighcard==2) { //if counter is exactly 2 then you have two pairs
                System.out.println("You have a Two Pair");
            }
            else if (counterforhighcard==4) { //if counter is 4 then you have a full house, which is 2 2 3 3 3 
                System.out.println("You have a Full House");
            }
            else if (counterforhighcard==6) { //if couter is 6 you have four of a kind
                System.out.println("You have a 4 of a Kind");
            }
            else {
                System.out.println("You have a One Pair");//anything left is just one pait
            }
            
        }
        
        
        
    }
    
    public static int [] sort (int [] hand) { //method for sorting my array according to rank, which we need to check for a straight
        for (int i = 0; i < hand.length - 1; i++) {
        // Find the minimum in the hand[i..hand.length-1]
        int currentMin = hand[i];
        int currentMinIndex = i;

            for (int j = i + 1; j < hand.length; j++) {
                if ( (currentMin%13) > (hand[j]%13) ) { //if currentmin rank value is greater than the next value in array, then set that next value equla to new min, swap
                 currentMin = hand[j]; 
                 currentMinIndex = j;
                 }
            }

             // Swap hand[i] with hand[currentMinIndex] if necessary
             if (currentMinIndex != i) { 
             hand[currentMinIndex] = hand[i];
             hand[i] = currentMin;
             }
        }
        return hand; //return sorted array, in which we need to check for a straight
    }


    public static void showOneHand(int[] hand){ //method for printing hand, taking in deck
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "}; // string array for suits
	String face[]={ //string for rank
       "2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10 ","J ",
  	"Q ","K ","A "};
	String out=""; //variable decleration
	for(int s=0;s<4;s++){ //for loop for every suit, s is the suit, from 0 to 3 inclusive
  	out+=suit[s]; //list suit on line
  	for(int rank=0;rank<13;rank++) // loop for each rank, there are 13 cards in each rank, so everytime suit increments this will go through 13 cards
    	for(int card=0;card<5;card++) // There are 5 cards in each hand, this loop will make sure rank belongs to correct suit
     	if(hand[card]/13==s && hand[card]%13==rank) //there are 13 total cards, if card number over 13 is  equal to the suit number, where does it get parsed when you divide by 13, because it automatically sets to an integer?
      	out+=face[rank];
  	out+='\n'; //new line for every suit
	}
	System.out.println(out);
    }
    
}