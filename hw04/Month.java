/////////////////////////
// Carlos Rosario
// September 22 2014
// CSE 002
// Month Java Program

import java.util.Scanner;

public class Month {
    
    public static void main(String[] args){
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        System.out.print("Enter an integer representing the number of the month (e.g. 1 for January, 2 for February): ");
        int nmbr=0;
        if(myScanner.hasNextInt()) {
        nmbr= myScanner.nextInt();
            if (nmbr<=0) {
                System.out.println("Error: There is no such thing as a negative or zero month");
            }
            else if (nmbr>12) {
                System.out.println("Error: A month cannot be represented with a value greater than 12");
            } 
            else if ( (nmbr==4) || (nmbr==6) || (nmbr==9) || (nmbr==11) ) {
                System.out.println("The month has 30 days");
            }
            else if ( (nmbr==1) || (nmbr==3) || (nmbr==5) || (nmbr==7) || (nmbr==8) || (nmbr==10) || (nmbr==12) ) {
                System.out.println("The month has 31 days");
            }
            else if (nmbr==2) {
                System.out.print("Enter an integer giving the year (Must be a positive int) : ");
                int year=0;
                if (myScanner.hasNextInt()) {
                year= myScanner.nextInt();
                    if (year<=0) {
                    System.out.println("Error: There is no such thing as a negative or zero year");
                    }
                    else if ( ((year % 4)==0) && ( (year % 100)==0) && ( (year % 400)==0) ) {
                    System.out.println("The month has 29 days");
                    }
                    else if ( ((year % 4)==0) && ( (year %100) != 0) ) {
                    System.out.println("The month has 29 days");
                    }
                    else
                    System.out.println("The month has 28 days");
                }
                 else
                 System.out.println("You did not enter an integer");
            }
       
       }
        else
            System.out.println("You did not enter an integer");
        
    }
}
