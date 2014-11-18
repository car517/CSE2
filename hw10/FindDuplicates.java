/////////////////////////
// Carlos Rosario
// November 16 2014
// CSE 002
// FindDuplicates Java Program

import java.util.Scanner; //import java scanner


public class FindDuplicates{ //class
  
  public static void main (String [] arg) { //main method
   
    Scanner scan=new Scanner(System.in); // set scan equal to input
    int num[]=new int[10]; // num[] is the array length, new int[10] sets length equal to 10
    String answer=""; //initializing string
    
        do { //do while loop for program
          
          System.out.print("Enter 10 ints- "); //gives user direction
          
          for(int j=0;j<10;j++) { //for loop that will run as long as j is less than the length which is 10
              
            num[j]=scan.nextInt(); // this will create the array list for the integers the user inputed
            
          } //end of for loop, array list created
          
          String out="The array "; // string decleration
          out+=listArray(num); //return a string of the form "{2, 3, -9}"   
          
          if( hasDups(num) ) { //call has dups method to check if there are atleast one duplicate
            out+="has ";
          }
          
          else {
              
            out+="does not have "; //else does not have duplicate
            
          }
          
          out+="duplicates."; // last part of statement
          System.out.println(out); //print out
          out="The array "; //
          out+=listArray(num); //call list array method    
          
         if ( exactlyOneDup(num) ) { // calls method to check for exactly one duplicate
    
            out+="has "; 
            
          }
          
          else{
    
            out+="does not have "; // if input values doesnt have just one duplicate
    
          }
    
          out+="exactly one duplicate."; //last part of out
          
          System.out.println(out); //print out 
          System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); // direction for user if wants to go again
          answer=scan.next();
        } while( answer.equals("Y") || answer.equals("y") ); //while loop after user input
    
    }
  
  public static boolean exactlyOneDup ( int num[] ) { // method accepting an array and returning a boolean
     
      boolean value=false; //initial condition
      int counter=0;
      for (int i=0; i < num.length; i++) { // first loop for the first value in array list, keeps incrementing untill finds duplicates
          for (int j=i+1; j<num.length; j++) { // second loop for every value after the first
              if (num[i]==num[j]) { //if at any point the first number is equal to the input values after, return true
                  counter += 1; //counter adding one for everytime there are duplicates
              }
          }
      }
      
      if (counter == 1) { //boolean condition returning true only if there is one duplicate
        value = true;
      }
      
      return value;
      
  }
  
  
  
  public static boolean hasDups ( int num[] ) {
      
      boolean value=false; //inital condition
      for (int i=0; i < num.length; i++) { // first loop for the first value in array list, keeps incrementing untill finds duplicates
          for (int j=i+1; j<num.length; j++) { // second loop for every value after the first
              if (num[i]==num[j]) { //if at any point the first number is equal to the input values after, return true
                  value= true; break;  //return true if there are duplicates
              }
          }
      }
      return value;
 
  }

  public static String listArray ( int num[] ) { //method listArray called above
    String out="{"; //declaration of string
        for (int j=0;j<num.length;j++) { //for loop will run as long is j is less than array length
          if (j>0) { 
           
            out+=", "; //the comma in between the numbers 
          
          }
          
          out+=num[j]; // value for number in array
          
        }
    
        out+="} "; //close bracket
        return out; //return out
    
  }
  
}

        
   