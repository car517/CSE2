/////////////////////////////////////////////
//Carlos Rosario
//September 05 2014
//CSE 001-1111
//Cyclometer Java Program
// First Compile The Program
//  javac Cyclometer.java
// Run The Program
//  java Cyclometer//

// Define A Class
public class Cyclometer{
    
// Add Main Method
    public static void main(String[] args) {
        int secsTrip1=480;  // Displays Trip 1 480 seconds
        int secsTrip2=3220; // Displays Trip 2 3220 seconds
        int countsTrip1=1561;   // Displays Trip 1 1561 Counts
        int countsTrip2=9037;   // Displays Trip 2 9037 COunts
        double wheelDiameter=27.0,  // Variable Wheel Diameter at 27
        PI=3.14159, // Numeric Value of the variable Pi
        feetPerMile=5280,   //Display how many feet are in a mile 5280
        inchesPerFoot=12,   //Display how many inches are in a foot 12
        secondsPerMinute=60;    //Display how many seconds per minute 60
        double distanceTrip1, distanceTrip2, totalDistance; // Display total distance of each trip
        // Print the Statement with Box Around it
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        //Distance Varibale Computation
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        
        //Above gives distance in inches
        // (for each count, a rotation of the wheel travels the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        // Gives distance in miles distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        // Print out the output of data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");

    }   
} 
    
    
