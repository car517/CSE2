/////////////////////////
// Carlos Rosario
// September 22 2014
// CSE 002
// NumberStack Java Program

import java.util.Scanner; //import scanner

public class NumberStack { // class
    
static Scanner myScanner; //declare scanner
    
    public static void main(String[] args){ //add main method
        myScanner= new Scanner (System.in); //scanner input declaration
        
        
        while (true) { //while loop just to keep this running continuosly until user decides to break, the same function is done with for and do while loops below but it is commented so the program can run continuously,
            
            //for loops
            
            //for (boolean loop=true; loop=true;) { //Put this for future reference, does the same function as while(true). If I were to write three different programs for each type of loop this is what I would use for for loops
                System.out.print("Enter an integer between 0 and 9 inclusive (for loop) (Any other key to quit loop): "); //Gives user direction
                int input=0; //intializing user input
                if (!myScanner.hasNextInt()) { //if input is not an integer tell user and break
                    System.out.println("You have not entered an integer"); break;
                } 
                input= myScanner.nextInt(); //set user input as variable input
                if ( (input>=0) && (input<=9) ) { //set the range
                    for(int i = 1; i <= input; i++) { //exterior for loop for what will happen with each number increment leading to user input
                        int times = i; //initializing how many times code will repeat going down for each increment
                        int length = (2 * i) - 1; //how many times will number get repeated in the same line, if number is 4, then 4 will get repeated (4*2)-1=7 times on same line
                        String str = ""; String str2= ""; // Initializing string for repeating integers
                        String space= ""; String space2=" "; // Initializing string for repeating space that will centralize everyloop
                            for(int j = 0; j < length; j++) { //for loop for length, which will also be amount of times the dash will repeat
                                str += i; str2 += "-"; //sets variables equal to how many times the dash and increment should repeat
                            }
                            if (i<input) { //for spacing of print, this algorithm will apply to every increment before user input only
                                for (int p=0; p<(input-i); p++) { // for loop will loop as long as increments are less than input-i, if input is 5, then for number 4, it will be spaced once before code prints
                                    space += space2; //Total space 
                                }
                            }
                            for(int k = 0; k < times; k++) { //loop for how many lines variable space+str will repeat 
                            System.out.println(space+str); //print for space + str
                            }
                        
                        System.out.println(space+str2); //total dashes repeated after every number increment
                    }
                    
                    input=0; // reset input 
                        
                    
                } //end of if statement
                else {
                    System.out.println("You have not entered an integer within range"); break; //what will print if number is not in range
                }
                
            //} //end of for loop 
            
            
            
            
            
            //While Loops
            
            //comments only placed where while loops are placed, use comments from above to understand what is going on with variables, if statements, etc
            //while (true) { // For future reference if I want to run three different programs
                System.out.print("Enter an integer between 0 and 9 inclusive (while loop) (Any other key to quit loop):  "); //Direction for user
                input=0;//intialize variable
                if (!myScanner.hasNextInt()) {
                    System.out.println("You have not entered an integer"); break;
                } 
                input= myScanner.nextInt();
                if ( (input>=0) && (input<=9) ) {
                    int i = 1; 
                    while (i <= input) { //while i is less than or equal to input this will run
                        int times = i;
                        int length = (2 * i) - 1;
                        String str = ""; String str2= "";
                        String space= ""; String space2=" ";
                        int j = 0;
                        while (j < length) { //while j is less than length variable this will run
                            str += i; str2 += "-";
                        j++;
                        }
                        if (i<input) {
                            int p=0; 
                            while (p<(input-i) ) { // while p is less than (input-i) this will run
                                space += space2;
                                p++;
                            }
                        }
                        int k = 0;
                        while (k < times) { //while k is less than times run this program
                        System.out.println(space+str);
                        k++;
                        }
                        
                        System.out.println(space+str2);
                        i++;
                    }
                    
                    input=0;
                        
                    
                } //end of if statement
                else {
                    System.out.println("You have not entered an integer within range"); break;
                }
                
            //} //end of while loop 
            
            
            
            
            
            //Do while
            
            //do { //Same as above two, future reference if I would like to seperate these into three different programs
                System.out.print("Enter an integer between 0 and 9 inclusive (do while loop) (Any other key to quit loop) ");
                input=0;
                if (!myScanner.hasNextInt()) {
                    System.out.println("You have not entered an integer"); break;
                } 
                input= myScanner.nextInt();
                if ( (input>=0) && (input<=9) ) {
                    int i = 1;
                    do { // "Do" what is below
                        int times = i;
                        int length = (2 * i) - 1;
                        String str = ""; String str2= "";
                        String space= ""; String space2=" ";
                            int j=0;
                            do { // "Do" what is below 
                                str += i; str2 += "-";
                            j++;    
                            } while (j < length); //while j is less than length
                            if (i<input) {
                                int p=0;
                                do { //"Do" what is below
                                    space += space2;
                                p++;    
                                } while ( p<(input-i) ); //while p is less than input-i
                            }
                            int k = 0; 
                            do { //"Do" what is below
                            System.out.println(space+str);
                            k++;
                            } while (k < times); // while k is less than times
                        
                        System.out.println(space+str2);
                    i++;
                    } while (i <= input); //while i is less than or equal to input
                    
                    input=0;
                        
                    
                } //end of if statement
                else {
                    System.out.println("You have not entered an integer within range"); break;
                }
                
            //} while (true); ////Same as above, future reference if I would like to seperate these into three different programs
            
          
        }//end of entire loop
        
        
        
    } //end of main method
} //end of class