/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;

public class Enigma0{
  
  public static void main(String[] args){ // Made change to Strings[] args
    Scanner scan; //Declared Scanner, wasnt declared before
    System.out.print("Enter an int- ");
    scan=new Scanner(System.in);
    int n=scan.nextInt(); //Need this in order to input integer after the print above
    if(scan.hasNextInt()) {
      // can't have this inside of scope if wanted to use elsewhere int n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
     // int n=4; doesn't fit in this situation, why would this even be the case, makes no sense
      System.out.println(" Did not enter Int "); // No integer was intered there will be in error, changed statement to did not enter int
    }
    
    int k=4,p=6,q=7,r=8; // n is already declared above
    switch(k+p+q+r) {
      case 24: 
          return;
      case 25: System.out.println("sum is "+(25+n)+" "); //Pretty sure you wanted your input value to be integrated with the sum, so I added the value n
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 */