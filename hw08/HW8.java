/////////////////////////
// Carlos Rosario
// September 22 2014
// CSE 002
// HW08 Java Program

// Add the definions of the methods so the program would produce the output for corresponding input
import java.util.Scanner; //import scanner


public class HW8{ //class
    
    public static char getInput (Scanner scan, String out) { //method for Continue in system.out.print
        char in = ' '; //intializations
        String inp = " ";
        
        while(true){ //loop
            
            if(scan.hasNext()){ //check if it a string
                inp = scan.next(); //set user input as inp
                if(inp.length() > 1){ //check length to see if it is just one character
                    System.out.println("You should enter exactly one character.");
                }
                else{
                    in = inp.charAt(0); // set 0th term in char
                    break; //break loop
                }
            }
            else{
                System.out.println("You did not enter a character from the list, try again."); 
                break; //runs back to loop
            }
        }
        
        return in; // return in that this method will equal given user input
    }
    
    public static char getInput (Scanner scan, String out, int x) { // method for YyNn
        char in = ' '; //intializations of what will return
        
        for(int i = 0; i < x; i++){ // loop for # tries input put user
            
            if(scan.hasNext("[YyNn]")){ // if user input is an int that is either Y or y or N or n
                in = scan.next().charAt(0); // set in equal to the first user input
                break;
            }
            else{
                System.out.println("You did not enter a character from the list"); //self explanitory
            }
            scan.next(); // initializes user input so he can keep trying X amount of times
        }
        
        return in; //return value
    }
    
    public static char getInput (Scanner scan, String out, String nums) { //method for 0123456789
        char in = ' '; //intitializations 
        String inp = " ";
        char temp = ' ';
        
        while(true){ //loop
            
            System.out.println("Enter an integer 0-9"); //direction for user
            inp = scan.next(); //scanner value gets placed as inp
            if(inp.length() > 1){ //if the length is greater than one
                System.out.println("Enter exactly one character."); //print this statement
            }
            else{
                temp = inp.charAt(0); //temp, for temporary value, gets the value of the first digit enteref
                
                switch(temp){ //switch statements for these 
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        in = temp; //no break within the cases until here so whatever value chosen will make input  = temp as long as its an option here
                        break;
                    default: // if no value was chosen then print what is below
                        System.out.println("You did not enter an acceptable character"); continue;
                }
                if(in != ' '){ //condition if int is not a string value, break
                    break;
                }
            }
            scan.next(); //intialize user input
        }
        
        return in; //return in
    }
  
  public static void main(String []arg){ //main method
	
	char input; //input is a character
	
	Scanner scan=new Scanner(System.in); //scanner decleration
	
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); //user direction
	input=getInput(scan,"Cc"); //set input equal to method above
	System.out.println("You entered '"+input+"'"); //print input
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); //user direction
	input=getInput(scan,"yYnN",5); //give up after 5 attempts 
	if(input !=' '){ //If input is not blank 
   	System.out.println("You entered '"+input+"'"); // Print what they input
	}
	input=getInput(scan,"Choose a digit.","0123456789"); //direction
	System.out.println("You entered '"+input+"'"); //print input
  }  
}

