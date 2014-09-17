/////////////////////////////////////////////////
// Carlos Rosario
// September 15 2014
// CSE 002-111
// Bicycle Java Program
// Calculating distance traveled and the average miles per hour
import java.util.Scanner; // needed to use scanner
// First Compile the Program
// javac Bicycle.java

// Run Program
// java Bicycle 

// Add class
public class Bicycle{
    
// Add main method
    public static void main(String[] args) {
        Scanner myScanner; //declare scanner
        myScanner= new Scanner( System.in );// declare scannr input
        System.out.print("Enter Number of Counts on Cyclometer (an integer >= 0) : "); //input number of counts
        int nCounts= myScanner.nextInt(); //define number of counts
        System.out.print("Enter Number of Seconds during which the Counts Occured (an integer >= 0) : "); //input number of seconds
        int nSec= myScanner.nextInt(); // define number of seconds
        
        double PI=3.14; //define pi
        double inchesperfoot=12; //define number of inches per foot
        double feetpermile=5280; //define number of feet per mile
        double secondperminute=60;// define number of seconds in a minute
        double minutesperhour=60;// define number of minutes in an hour
        double wDiam=27;// define diameter in inches
        double aMPH, dTrav, aMin; //define average mph distance traveled and amount of minutes it took
        aMin=(nSec)/(secondperminute); //formula for amount of minutes it took
        dTrav=(wDiam*nCounts*PI)/(inchesperfoot*feetpermile);// formula for distance traveled in miles
        aMPH=dTrav/(aMin/minutesperhour);// formula for average miles per hour
       
        System.out.println("The distance traveled was "+dTrav+" and took "+aMin+" minutes.");// print distance traveled in number of minutes
        System.out.println("The average mph was "+aMPH+""); // print average miles per hour
        
    } // end of main method
} // endo of class