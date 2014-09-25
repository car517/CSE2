/////////////////////////
// Carlos Rosario
// September 22 2014
// CSE 002
// Income Tax Java Program

import java.util.Scanner;

public class IncomeTax{
    
    public static void main(String[] args){
        Scanner myScanner; //declare scanner
        myScanner= new Scanner (System.in); //scanner equal input
        System.out.print("Enter an int giving the number of thousands (Must be greater than or equal to zero): "); //user input
        int Sal=0; //declare variable
        if(myScanner.hasNextInt()) { //check for int
        Sal= myScanner.nextInt(); //scanner integer equal declared variable
            double tax1, tax2, tax3, tax4; //declare tax 
            tax1=.05;
            tax2=.07;
            tax3=.12;
            tax4=.14; //each tax rate
            if(Sal<=0) { //make sure input is not negatice
                System.out.println("This input cannot be taxed because it is negative or equal to zero");
            }
            else if( (Sal<20) && (Sal>0) ) { // range of first tax bracket
                System.out.println("The tax rate on "+Sal+",000 is "+tax1+", and the tax is "+(Sal*tax1)*1000+" ");
            }
            else if( (Sal>=20) && (Sal<40) ) { //range of second tax bracket
                System.out.println("The tax rate on "+Sal+",000 is "+tax2+", and the tax is "+(Sal*tax2)*1000+" ");
            }
            else if( (Sal>=40) && (Sal<78) ) { //range of third tax bracket
                System.out.println("The tax rate on "+Sal+",000 is "+tax3+", and the tax is "+(Sal*tax3)*1000+" ");
            }
            else if(Sal>=78) { //range of fourth
                System.out.println("The tax rate on "+Sal+",000 is "+tax4+", and the tax is "+(Sal*tax4)*1000+" "); //each line print gives wanted values
            }
            
        
            
        }
        else
            System.out.println("You did not enter an int"); // will print if number is not int
    }
    
}
