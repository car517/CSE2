/////////////////////////
// Carlos Rosario
// September 22 2014
// CSE 002
// Course Number Java Program

import java.util.Scanner; //import scanner

public class CourseNumber { // class
    
    public static void main(String[] args){ //add main method
        Scanner myScanner; // declare scanner
        myScanner= new Scanner (System.in); //scanner input declaration
        System.out.print("Enter a six digit number giving the course semester: "); //input
        
        int cnmbr=0; //declare course number
        if( myScanner.hasNextInt() )  { //check to see if integer
        cnmbr=myScanner.nextInt(); // here goes the user input as course number
            if ( (cnmbr>=186510) && (cnmbr<=201440) ) { // set range
            
                if ( cnmbr % 10 == 0) { // checks to see if semester is valid entry, because 10 20 30 40 are fivisible by 10
                    int smtr= (int) (cnmbr % 100); // gives semester number as integer
                        if ( smtr == 10 ) {
                            System.out.println(" The course was offered in the Spring semester of "+ (int) (cnmbr/100) +" "); // allow year to show
                        }
                        else if ( smtr == 20) {
                            System.out.println(" The course was offered in the Summer 1 semester of "+ (int) (cnmbr/100) +" ");
                        }
                        else if ( smtr == 30) {
                            System.out.println(" The course was offered in the Summer 2 semester of "+ (int) (cnmbr/100) +" ");
                        }
                        else if ( smtr == 40) {
                            System.out.println(" The course was offered in the Fall semester of "+ (int) (cnmbr/100) +" ");
                        }
                }
                else {
                    System.out.print("You did not enter a valid semester");
                }
                
            }
            else {
                System.out.print("You did not enter a value within range");
            }
            
                
        }
        else {
            System.out.println("You did not enter valid course number"); return;
        }
        
    }
}
        