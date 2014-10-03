///////////////////////////////////
// Carlos Rosario
// September 29 2014
// CSE 002
// BurgerKing Java Program

// We want to users to enter a choice of a burger soda and fries

import java.util.Scanner;

public class BurgerKing {

static Scanner myScanner;

    public static void main(String[] args) {
        myScanner= new Scanner (System.in);
        System.out.println(" Enter the first letter of your food of choice. \nYour choices are: Burger (B or b) , Soda (S or s) , Fries (F or f) , All the fixens (A) ");
        String Foodltr="o"; String Food="o";
        Foodltr= myScanner.next();

        switch ( Foodltr.toString().toLowerCase() ) {
            case "b":
                System.out.println("You have selected a burger, would you like cheese (Y, N) ? ");
                    Food= myScanner.next();
                    if (Food.equals("y") || Food.equals("Y") || Food.equals("N") || Food.equals("n") ) {
                        if (Food.equals("y") || Food.equals("Y") ) {
                            System.out.println("You have ordered a Cheeseburger");
                        }
                        else {
                            System.out.println("You have ordered a plain burger");
                        }
                    }
                    else {
                        System.out.println("You have not entered a proper entry");
                    }
                    break;
            case "f":
                System.out.println("You have selected fries, would you like a large or small (l , s)  ?");
                    Food= myScanner.next();
                    if (Food.equals("s") || Food.equals("S") || Food.equals("l") || Food.equals("L") ) {
                        if (Food.equals("s") || Food.equals("S") ) {
                            System.out.println("You have ordered small fries");
                        }
                        else {
                            System.out.println("You have ordered large fries");
                        }
                    }
                    else {
                        System.out.println("You have not entered a proper entry");
                    }
                    break;
            case "s": 
                System.out.println("Would you like pepsi (p or P), coke (c or C), Mountatin Dew (M or m) ?");
                    Food= myScanner.next();
                    if (Food.equals("p") || Food.equals("P") || Food.equals("c") || Food.equals("C") || Food.equals("M") || Food.equals("m") ) {
                        if (Food.equals("p") || Food.equals("P") ) {
                            System.out.println("You have ordered a Pepsi");
                        }
                        else if (Food.equals("C") || Food.equals("c") ) {
                            System.out.println(" You have ordered a Coke");
                        }
                        else {
                            System.out.println("You have ordered a Mountain Due");
                        }
                    }
                    else {
                        System.out.println("You have not entered a proper entry");
                    }
                    break;
            default:
                System.out.println("You did not enter a valid entry");
                    break;
        }

    }
}