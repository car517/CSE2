/////////////////////////
// Carlos Rosario
// October 13 2014
// CSE 002
// Root Java Program
// Finding square root of a number

// Program Summary

    // need to find sqrt of x
    // Start off with low to 0 and high to 1 + x
    // Sqrt lies between low and high
    // Low's square is less than root x
    // High's square is larger than root x
    // Take middle of high and low, if square is larger than x, then set as new high
    // If square is less than x set as new low
    // Do this until difference between high and low is less than .0000001
    // Root is very close between final low and final high



import java.util.Scanner; //import scanner

public class Root { // class
    
static Scanner myScanner; //declare scanner
    
    public static void main(String[] args){ //add main method
        myScanner= new Scanner (System.in); //scanner input declaration
        
        // intializing variables
        int input=0; //integer that user wants to find sqrt for, user input
        double high=0; //Top of Range
        double low=0; // bottom of range
        double mid=0; // middle of range
        double i=high-low; //difference of range
        
        
        while (true) { //Allows program to infinitely run given user input
            System.out.print("Enter a positive integer to calculate square root (Any other key to quit) : ");  //Direction for user input
            if ( myScanner.hasNextInt() ) { // Will continue if user input is an integer
                input= myScanner.nextInt(); // assigns variable to value of user input
                if (input>=0)  { // Makes sure user input is not below zero, can't root negative numbers for a real answer
                    high= input+1;  // First cieling to range
                    i=high-low; // difference of range upper limit and lower limit
                    double range= (double) (.0000001); // difference in range that we are looking for
                    while ( i >= range )  {   // this will loop as long as i is greater than range variable value
                        mid=(high+low)/2.0; // algorithm for middle value
                        if ( (mid*mid)>input ) {  //if middle value squared is greater than input, the middle value is our new ceiling of range
                            high=mid;  //sets middle value to cieling of range
                        }
                        else if ( (mid*mid)<input ) {  //if middle value squared is less than inpur, the middle value is our new floor of range
                            low=mid; // sets middle value to floor of range
                        }
                        i=high-low;  //sets new i everytime this is looped so we can find the small difference in range that we're looking for
                    }
                    System.out.println("The square root is between "+high+" and "+low+" ");  //Telling users that square root is within these two small values
                    high=input+1;low=0; mid=0;  //resetting values so when program runs again it doesn't build off of old calculations
               
               
               
               
               
               
               
                }
                else {
                    System.out.println("Cannot find square root of a negative number");    //tells user that this can't find sqrt of negative numbr and runs program again
                }
               
            }
            else {
                System.out.println("You have not entered an integer, program will now quit"); break;    //tells user program is not an integer, and also the way to quit program as directed
            }
            
            
        }   //end of while loop
    
        
    }  //end of main methos
}  //end of class