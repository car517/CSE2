/////////////////////////
// Carlos Rosario
// September 22 2014
// CSE 002
// NumberStack Java Program


// Program Summary Notes

    // $1 bets. Win $36 every time # comes up, so at least 3 wins per 100 spins will win money, $108
    // Need to run this 100 spin simulation 1000 times and collect outcome
    // 38 possible numbers on wheel
    // Compute number of times you lose everything for 100*1000 spin session
    // Compute number of times you total winnings for 100*1000 spin session
    // Compute number of times you walk away with profit in one 100 spin session

import java.util.Scanner; //import scanner

public class Roulette { // class
    
static Scanner myScanner; //declare scanner
    
    public static void main(String[] args){ //add main method
        myScanner= new Scanner (System.in); //scanner input declaration
        
        //Intializing variables
        int num=0; // user input variable for roulette number of choice
        String result=""; //Result of game variable
        int cash=0; // cash won variable
        int total=0; //total cash won variable
        int zero=0; //zero wins variable
        int gametotal=0; //total cash used in if statement variable
        int win=0; // Number of times profitted variable
        
        while (true) { //Allows program to infinitely run given user input
            System.out.print("Enter an integer from 0 to 37 for roulette that will be used to bet 100,000 times for $1 each bet \nPress any other key to quit roulette \n"); //Nice new line characters to make it easy to read, directions for user input
            if(myScanner.hasNextInt() ) { // If input is an integer it will continue
                num=myScanner.nextInt(); //variable for user input
                if( (num>=0) && (num<=37) ) { //Setting range for user input of american roulette wheel
                    for (int i=0; i<=1000; i += 1) { //Runs the 100spin session 1000 times        
            
                            for (int j=0; j<=100; j += 1) { //Runs the 100 spin session
                                int rando=(int) (Math.random()*38); // random variable with range 0 to 37
                                    if (rando==num) { //if user input matches random variable generated
                                        result="Winner"; // Indicates user wins, Not really a necessary variable but looks good for readers figuring out what's going on
                                        cash=36; // How much cash per win
                                    }    
                                    else {
                                        result="Lost"; //indicates user lost, also not necessary, but definetely looks great for readers understanding
                                        cash=0; // User wins 0 dollars for not matching number with random variable
                                    }
                                    total += cash; // totals the cash won in 100 spins
                                    gametotal +=cash; // totals cash won but used for if statement purposes 
                            }
                            if (gametotal==0) { //If users amount of cash equals 0, then he won zero games
                                zero += 1; // Tally for amount of times you got 0 cash in a 100 session game
                            }
                            else if (gametotal>100) { //if user amont of cash is greater than 100 then he profitted 
                                win += 1; //tallys profit wins
                            }
                            gametotal=0; // resets gametotal variable to zero so that when this is looped 1000 times it doesn't store the same value and build off of that
                        
                    }
                    System.out.println("Number of times you lost everything: "+zero+""); // Input for # of times you lost everything
                    System.out.println("Number of times you profitted: "+win+""); //Number of times you profited 
                    System.out.println("Out of 100,000 spins, you won $"+total); //did not reset the total variable so it keeps tallying for 100000 spins, giving total winnings
                    win=0; zero=0; total=0; cash=0; gametotal=0; //resets each variable for the 1000 loop so it doesn't keep storing old game value
                    
                }
                else {
                    System.out.println("Your number was not in range"); //Tells user number was not in range, then runs back in while loop
                }
                
                
                
                
            }
            else {
                System.out.println("You have not entered an integer, roulette will now quit"); break; //no integer was entered, which is also the way to break the loop, as directed
            }
            

            
            
        } //End of while loop
        
        
        
        
        
        
        
    } //main method end
} // class end