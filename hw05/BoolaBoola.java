/////////////////////////
// Carlos Rosario
// September 22 2014
// CSE 002
// Boola Java Program

import java.util.Scanner;

public class BoolaBoola {
    
    public static void main(String[] args){
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        int aa= (int)(Math.random()*2);
        int bb= (int)(Math.random()*2);
        int cc= (int)(Math.random()*2);
        int dd= (int)(Math.random()*2);
        int ee= (int)(Math.random()*2);
        
        boolean one= false;
        boolean two= false;
        boolean three= false;
        
        String operation= "";
        String operation2= "";
        
        switch(aa) {
            case 0: 
                break;
            case 1: one = true;
                break;
        }
        switch(bb) {
            case 0: 
                break;
            case 1: two = true;
                break;
        }
        switch(cc) {
            case 0: 
                break;
            case 1: three = true;
                break;
        }
        switch(dd) {
            case 0: operation = "||";
                break;
            case 1: operation = "&&";
                break;
        }
        switch(ee) {
            case 0: operation2 = "||";
                break;
            case 1: operation2 = "&&";
                break;
        }
        
        System.out.println("Does " + one + " " + operation + " " + two + " " + operation2 + " " + three + " True (T t) or False (F f)?: ");
        String input = myScanner.next();
        boolean in = false;
        switch(input) {
            case "T":
            case "t":
                in = true;
                break;
            case "F":
            case "f":
                    break;
            default:
                System.out.println("Invalid entry");
        }  
                        
        boolean ans = false;
        
        if( operation.equals("||") && operation2.equals("||") ) {
            if(one || two || three)
                ans = true;
        }
        else if( operation.equals("||") && operation2.equals("||") ){
            if ( one || two || three)
                ans = true;
        }
        else if( operation.equals("&&") && operation2.equals("||") ){
            if ( one && two || three)
                ans = true;
        }
        else if( operation.equals("&&") && operation2.equals("&&") ){
            if ( one && two && three)
                ans = true;
        }
        if ( ans && in )
            System.out.println("Affirmative");
        else if ( ans && !in) 
            System.out.println("Negative, the answer is correct");
        else if ( !ans && in) 
        System.out.println("Negative, answer is Affirmative");
        else if (ans || !in)
            System.out.println("Correct");
    }
}
        