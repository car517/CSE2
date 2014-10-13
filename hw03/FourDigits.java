///////////////
//Carlos Rosario
//September 15 2014
//CSE 001-111
//Four Digits Java Program
import java.util.Scanner; // Import java scanner

// Define a class
public class FourDigits {
    // Add main method
    public static void main (String[] args) {
        //Declare Scanner
        Scanner myScanner;
        myScanner= new Scanner(System.in); // initiate scanner
        
        //Print user input 
        System.out.print("Enter a value as "+" a double for an output of the first four numbers to the right of the decimal (in this form xx.xxxx) : ");
        double myValue1=myScanner.nextDouble(); // Define input
        double myValue= (myValue1*10000); // creates value for decimals
        int myValueInt= (int) myValue; // The four decimals become number integers
        int printVal1=((int) (myValueInt%1000)); //Gives value of first decimal
        int printVal2=((int) (myValueInt%100)); //Gives value of second integer
        int printVal3=((int) (myValueInt%10)); //Gives value of third integer
        int printVal4=(myValueInt); //gives value of fourth integer
        
        System.out.println("The four digits are "+printVal1+" "+printVal2+" "+printVal3+" "+printVal4+""); //Print first four decimals
        
        
    } //End of main method
} // End of Class