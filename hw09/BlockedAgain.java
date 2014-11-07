/////////////////////////
// Carlos Rosario
// September 22 2014
// CSE 002
// BlockedAgain Java Program

// Add the definions of the methods so the program would produce the output for corresponding input
import java.util.Scanner; //import scanner


public class BlockedAgain{ //class
    
    
    
    public static int getInt (Scanner scan) { //solve problem A calling checkInt and checkRange, continues to ask user until int is chosen
        input = new scan (System.in);
        
        while ( checkInt(input) ) {
            int range=0;
            range = checkRange(input);
            return range; break;
        }
          
        
    }
    
    public static boolean checkInt (int x) { //checks if input is int, return boolean
        
        
        System.out.print("Enter an integer from 1-9 inclusive: ");
        if (x.hasNextInt() ) {
            return true;
        }
        else {
        System.out.print("You have not entered an integer");
        }
       
    }
    
    public static int checkRange (int x) { //check if int is within range 1-9, return int
        
        
        if (x>=1 &&  x<=9) {
            return x;
        }
        else {
            System.out.println("You have not entered an integer within range");
        }
       
    }
    
    public static void block (int x) { //prints stacks of blocks, will call line and accept user input
        
        for(int i = 1; i <= x; i++) { //exterior for loop for what will happen with each number increment leading to user input
        
        line(i, x);
        
        }
        
        input=0;
    }
    
    public static void line (int x, int s) { //indents for each line and proper number
        
                        int times = x; //initializing how many times code will repeat going down for each increment
                        int length = (2 * x) - 1; //how many times will number get repeated in the same line, if number is 4, then 4 will get repeated (4*2)-1=7 times on same line
                        String str = ""; String str2= ""; // Initializing string for repeating integers
                        String space= ""; String space2=" "; // Initializing string for repeating space that will centralize everyloop
                            for(int j = 0; j < length; j++) { //for loop for length, which will also be amount of times the dash will repeat
                                str += x; str2 += "-"; //sets variables equal to how many times the dash and increment should repeat
                            }
                            if (x<s) { //for spacing of print, this algorithm will apply to every increment before user input only
                                for (int p=0; p<(s-x); p++) { // for loop will loop as long as increments are less than input-i, if input is 5, then for number 4, it will be spaced once before code prints
                                    space += space2; //Total space 
                                }
                            }
                            for(int k = 0; k < times; k++) { //loop for how many lines variable space+str will repeat 
                            System.out.println(space+str); //print for space + str
                            }
                        
                        System.out.println(space+str2); //total dashes repeated after every number increment
        
    }
    
    public static void allBlocks (int x) { //will call block
        
        block(x);
    }    
    public static void main(String []s) {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); System.out.print(""+m);
        allBlocks(m);
        }
    
    
}