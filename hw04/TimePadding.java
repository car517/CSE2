/////////////////////////
// Carlos Rosario
// September 22 2014
// CSE 002
// TimePadding Java Program

import java.util.Scanner;

public class TimePadding {
    
    public static void main(String[] args){
        Scanner myScanner; //scanner decalre
        myScanner= new Scanner (System.in);
        System.out.print("Enter the time in seconds: ");
        int time=0; //decalre time
        if(myScanner.hasNextInt()) { //check for input
        time=myScanner.nextInt(); //input equal variable time
            if(time<=0){ //check non negative
                System.out.println("Error: Input is not positive");
            }
            else
                System.out.println("The time is "+ (int) time/3600 +" ) //will give conventional output
        
            
        }
        else{
            System.out.println("You did not enter and integer");
        }
    }
}