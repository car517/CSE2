////////////////////////////
//Carlos Rosario
//September 15 2014
//CSE 002-111
//Root Java Program
//Estimating Cube Root of the number and the value of this crude guess when cubed of input values
import java.util.Scanner; //needed to use scanner

//Define Class
public class Root{

//Add main method
public static void main(String[] args) {
    Scanner myScanner; //Declare Scanner
    myScanner= new Scanner( System.in ); //Scanner input
    System.out.print("Enter a value as "+" a double for a crude estimate of the cube root of the number, and for the value of this crude guess when cubed (in the form of xx.xx) : "); //Direcrtion for user input
    double x= myScanner.nextDouble(); //define user input
    
    double guess=(x/3); // Divides user input by 3
    double guess0=((guess*guess*guess+x)/(3*guess*guess)); //More precise Guess of user input
    double guess1=((2*guess0*guess0*guess0+x)/(3*guess0*guess0));//Even more precise guess of user input
    double guess2=((2*guess1*guess1*guess1+x)/(3*guess1*guess1));// even more precise guess of user input
    double guess3=((2*guess2*guess2*guess2+x)/(3*guess2*guess2));// even more precise guess of user inpiut
    double total=(guess3*guess3*guess3); //Cubes the value to see how close we were to the input
    
    System.out.println("The cube root is "+guess3+"");// Cube root guess
    System.out.println(""+guess3+"*"+guess3+"*"+guess3+"="+total+""); //Input cubed result
    
    
    } //end of main method
} // end of class

