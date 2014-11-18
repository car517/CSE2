/////////////////////////
// Carlos Rosario
// November 16 2014
// CSE 002
// PokerOdds Java Program

import java.util.Random; //didn't even use this, but it's importing the random class, Math.random worked just fine for me
import java.util.Scanner; //import scanner class

public class PokerOdds{ // class
    public static void main(String [] arg){ //main method
      showHands(); //calling showhands method
      simulateOdds(); //calling other method for 10,000 hands
    } //end of main method
  
    public static void showHands () { //main method for showHands
        Scanner myScanner; //scanner decleration
        myScanner= new Scanner (System.in);
        
        while (true) {
            
            System.out.println("To draw a hand, press Y or y, anything else to quit");
            String input=""; 
            input = myScanner.next();
            if (input.equals("Y") || input.equals("y") ) { 
                
                int [] deck = new int [52]; //array decleration, 52 for length because of 52 cards
                
                int x = 2;
                for (int i = 0; i< 52; i++) { //creates the array list of 52 cards
                    
                    if(x == 15) { //resets x to two everytime it reaches 15 because there aren't 15 different cards in a deck
                        x = 2;
                    }
                    deck[i] = x; //array list creation
                    x++; //x incrementation
                }
                //Decleration of variables
                String suit = "";
                String powercardD="", powercardH="", powercardC="", powercardS="";
                String pctC="", pctD="", pctH="", pctS="";
                int cardnumber=0;
                int rankD=0, rankS=0, rankC=0, rankH=0;
                String totalD="", totalC="", totalH="", totalS="";
                
                
                    // for loop for drawing 5 cards
                    for (int i=0; i<5; i++) {
                        int card = (int)(Math.random()*52); // drawing random card from deck
                        while (deck[card]==0) { // while the deck[card] is equal to zero, this will keep running until it finds a card that isn't equal to zero, zero represents a card that is not there, I assign the card chosen equal to zero at the end of this for loop which is why this while loop is here
                            card = (int)(Math.random()*52); // drawing random card from deck
                        }
                        if (card>=0 && card <=12) { //if random number is between these 12 variables then it is in the "clubs" suit
                            suit= "clubs";
                            cardnumber=deck[card]; //put random number generator in array to find the value, and call that value cardnumber
                            if ( cardnumber >= 11 && cardnumber <=14 ) { //if card number is within 11 and 14, then it is a power card , jqka
                                switch (cardnumber) { // switch for powercard, rank number corresponds to power card Letter
                                    case 11: powercardC= "J"; break; 
                                    case 12: powercardC= "Q"; break;
                                    case 13: powercardC= "K"; break;
                                    case 14: powercardC= "A"; break;
                                }
                                pctC += powercardC; //power card counter for Clubs, 
                                pctC += " "; // Space in between each string 
                            }
                            else { //if the random number is not within 11 and 14, then it is a normal rank form 1 through 10
                                rankC=cardnumber; // the exact random number generated is your rank
                                powercardC=""; //powercard is a blank string because the number generated was not within 11 and 14
                                totalC += rankC; //total clubs couted as a string listed next to each other
                                totalC += " "; // space between every string 
                            }
                        }
                        else if (card>=13 && card <=25) { //if number generated is between 13 and 25 it is a diamond suit
                            suit= "diamonds";
                            cardnumber=deck[card]; //look at documenation in the clubs suit, same notes correspond here as well as the rest of the suits below
                            if ( cardnumber >= 11 && cardnumber <=14 ) {
                                switch (cardnumber) {
                                    case 11: powercardD= "J"; break;
                                    case 12: powercardD= "Q"; break;
                                    case 13: powercardD= "K"; break;
                                    case 14: powercardD= "A"; break;
                                }
                                pctD += powercardD; //powercardtotalDiamond
                                pctD += " ";
                            }
                            else {
                                rankD=cardnumber; //rank diamond
                                powercardD=""; //powercarddiamond
                                totalD += rankD; //total diamond
                                totalD += " ";
                            }
                        }
                        else if (card>=26 && card <=38) {
                            suit= "hearts";
                            cardnumber=deck[card];
                            if ( cardnumber >= 11 && cardnumber <=14 ) {
                                switch (cardnumber) {
                                    case 11: powercardH= "J"; break;
                                    case 12: powercardH= "Q"; break;
                                    case 13: powercardH= "K"; break;
                                    case 14: powercardH= "A"; break;
                                }
                                pctH += powercardH; //powercardtotalHearts
                                pctH += " ";
                            }
                            else {
                                rankH=cardnumber;
                                totalH += rankH; 
                                totalH += " ";
                                powercardH="";
                            }
                        }
                        else { //last range for last suit
                            suit= "spades";
                            cardnumber=deck[card];
                            if ( cardnumber >= 11 && cardnumber <=14 ) {
                                switch (cardnumber) {
                                    case 11: powercardS= "J"; break;
                                    case 12: powercardS= "Q"; break;
                                    case 13: powercardS= "K"; break;
                                    case 14: powercardS= "A"; break;
                                }
                                pctS += powercardS; //powercard total Spades
                                pctS += " ";
                            }
                            else {
                                rankS=cardnumber;
                                powercardS="";
                                totalS += rankS; 
                                totalS += " ";
                            }
                        }
                        
                        deck[card] = 0; //Assign the card chosen the number zero, this will be used to prevent the card from being chosen again 
                        
                      
                        // reset variables so it doesn't store old values
                        card=0; cardnumber=0; 
                        rankS=0; rankH=0; rankD=0; rankC=0; 
                        powercardS=""; powercardH=""; powercardD=""; powercardC="";
                        
                    } //end of for loop
                    //print out result for each suit, first listed are power card totals then total rank numbers from 1 - 10
                    System.out.println("Clubs: "+pctC+totalC);
                    System.out.println("Diamonds:"+pctD+totalD);
                    System.out.println("Hearts: "+pctH+totalH);
                    System.out.println("Spades: "+pctS+totalS);
            }
            else {
                System.out.println("You have chosen to quit"); break; //quits program
            }
            
        } //end of while loop
        
        
        
    } //end of showhands method
    
    
    //// Simulate Odds Method //////////////////////////////////////////////////////////////
    public static void simulateOdds () { //main method for simulateodds
        
        
                //Decleration of variables
                int two=0, three=0, four=0, five=0, six=0, seven=0, eight=0, nine=0, ten=0, eleven=0, twelve=0, thirteen=0, fourteen=0, notonepair=0; 
                int cardnumber=0;
                int [] singlepair = new int [5]; //put ranks into this array of 5 elements for one hanf
                for (int j=0; j<10000; j++) { //loop for 10,000 hand simulation
                         //Creating card deck
                         int [] deck = new int [52]; //array decleration, 52 for length because of 52 cards
                         int x = 2; //intial decleration of x for lowest rank
                            for (int i = 0; i< 52; i++) { //creates the array list of 52 cards
                        
                                if(x == 15) { //resets x to 2 everytime it reaches 15 because there aren't 15 different cards in a deck
                                x = 2; //reset code
                                }
                                deck[i] = x; //array list creation
                                x++; //x incrementation
                            }
                        // for loop for drawing 5 cards
                        for (int i=0; i<5; i++) {
                            int card = (int)(Math.random()*52); // drawing random card from deck
                            while (deck[card]==0) { // while the deck[card] is equal to zero, this will keep running until it finds a card that isn't equal to zero, zero represents a card that is not there because it is chosen, I assign the card chosen equal to zero at the end of this for loop which is why this while loop is here
                                card = (int)(Math.random()*52); // drawing random card from deck, until false
                            } 
                            cardnumber=deck[card]; // produces rank of the card
                            singlepair[i]=cardnumber; //array for checking single pair, array carrying the five cards chosen from deck
                            deck[card] = 0; //Assign the card chosen the number zero, this will be used to prevent the card from being chosen again because zero represents a card that is not there
                            
                          
                            // reset variables so it doesn't store old values
                            card=0; cardnumber=0; 
                            
                        } //end of for loop for 5 cards
                        
                        if ( exactlyOneCounter(singlepair) ) { //will perform following actions if method returns true, the method is used to check if hand has exactly one pair, singlepair array is called from above which is the hand of 5 cards
                           switch ( passvalue(singlepair) ) { //if above method is true, this method will return the exact rank of the card that has just one pair
                                case 2: two += 1; break; // tally up how many times the rank had just one pair
                                case 3: three += 1; break;
                                case 4: four += 1; break;
                                case 5: five += 1; break;
                                case 6: six += 1; break;
                                case 7: seven += 1; break;
                                case 8: eight += 1; break;
                                case 9: nine += 1; break;
                                case 10: ten += 1; break;
                                case 11: eleven += 1; break; //J
                                case 12: twelve += 1; break; //Q
                                case 13: thirteen += 1; break; //K
                                case 14: fourteen += 1; break;  //A
                            }
                        }
                        else {
                            notonepair += 1; //If the method in the if statement is false then there were no pairs or there wasn't strictly one pair, and this will tally how many times this happens
                        }
                }// end of for loop for 10,000 hand simulation
                
                ////////for loop for dashes and spaces
                
                ///for loop for dashes
                String dash=""; String space= "", space2="", space3="", space4="";
                for (int i=0; i<25; i++) {
                    dash += "-";
                }
                
                ///for loop for space before
                for (int i=0; i<4; i++) {
                    space += " ";
                }
                String space22="", space23="", space24="";
                ///for loop for space after
                for (int i=0; i<7; i++) {
                    space2 += " "; 
                }
                for (int i=0; i<6; i++) {
                    space22 += " "; 
                }
                for (int i=0; i<5; i++) {
                    space23 += " "; 
                }
               
                //for loop spaceing for header
                // between
                for (int i=0; i<3; i++) {
                    space3 += " ";
                }
                // before 
                for (int i=0; i<4; i++) {
                    space4 += " ";
                }
                
                // Print Statements, could have made an array for these strings like ace, king, ten, eight, etc so I wouldn't have to use systemoutprint so much but it would pretty much be the same length in code, so I felt it didnt matter
                System.out.println(space4+"Rank"+space3+"Freq of Exactly One Pair");
                System.out.println(space+"Ace: "+space2+fourteen);
                System.out.println(space+"King: "+space22+thirteen);
                System.out.println(space+"Queen: "+space23+twelve);
                System.out.println(space+"Jack: "+space22+eleven);
                System.out.println(space+"Ten: "+space2+ten);
                System.out.println(space+"Nine: "+space22+nine);
                System.out.println(space+"Eight: "+space23+eight);
                System.out.println(space+"Seven: "+space23+seven);
                System.out.println(space+"Six: "+space2+six);
                System.out.println(space+"Five: "+space22+five);
                System.out.println(space+"Four: "+space22+four);
                System.out.println(space+"Three: "+space23+three);
                System.out.println(space+"Two: "+space2+two);
                System.out.println(dash);
                System.out.println("Total Not Exactly One Pair: "+notonepair);
                
                
                
    } //end of simulate odds method
    
    public static boolean exactlyOneCounter ( int singlepair[] ) { // method accepting an array and returning a boolean, I call this above
     
        boolean value=false; //initial condition
        int counter=0;
        int rank=0;
        int O=0;
        for (int i=0; i < singlepair.length; i++) { // first loop for the first value in array list, keeps incrementing untill finds duplicates
            for (int j=i+1; j<singlepair.length; j++) { // second loop for every value after the first
                if (singlepair[i]==singlepair[j]) { //if at any point the first number is equal to the input values after, return true
                    counter += 1; //counter adding one for everytime there are duplicates
                }
            }
        }
                      
        if (counter == 1) { //boolean condition returning true only if there is one duplicate
            value = true;
        }
                      
            return value;
                      
    } //end of exactlyonecounter method
    
    public static int passvalue( int singlepair[] ) { // method accepting an array and returning a boolean
     
        boolean value=false; //initial condition
        int counter=0;
        int rank=0;
        int O=0;
        for (int i=0; i < singlepair.length; i++) { // first loop for the first value in array list, keeps incrementing untill finds duplicates
            for (int j=i+1; j<singlepair.length; j++) { // second loop for every value after the first
                if (singlepair[i]==singlepair[j]) { //if at any point the first number is equal to the input values after, return true
                    O= singlepair[i]; //setting certain element in string equal to j so i can use it below
                    counter += 1; //counter adding one for everytime there are duplicates
                }
            }
        }
                      
        if (counter == 1) { //boolean condition returning true only if there is just one duplicate
            rank = O; //returns rank, the element would hold constant if there is just one pair so this is good to use
        }
                      
            return rank; //return your rank value
                      
    } //end of exactlyonecounter method
    
     
    
    
} // end of class