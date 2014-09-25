//////Carlos Rosrio
import java.util.Scanner;

public class BigMacAgain{
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner= new Scanner(System.in);
        System.out.print("Enter the number of Big Macs (Must be a positive integer) : ");
        double tBigMac = 0;
        
        int nBigMacs=0; //need to declare for whole class
        if(myScanner.hasNextInt()){
        nBigMacs=myScanner.nextInt();
        
            if(nBigMacs<=0){
                System.out.println("Error: Input is not positive");
            }
            else{
                tBigMac=nBigMacs*2.22;
                System.out.println(" You ordered "+nBigMacs+" for the cost of "+nBigMacs+"*2.22= "+tBigMac+" ");
         }
        }
        else
        System.out.println("Error: input is not an integer.");
        
        
        System.out.println("Do you want an order of fries (Y,y,N,n): ");
        String nfries = myScanner.next();
        double pfries=2.15;
        if(nfries.equals("y") || nfries.equals("y")){
            System.out.println("You ordered fries at a cost of "+pfries+", and your total order will be "+(pfries+tBigMac)+". ");
        }
        else if(nfries.equals("n") || nfries.equals("N")) {
             System.out.println("Your total order will be "+tBigMac+"");
        }
        else{
            System.out.println("Error: You did not enter legal option");
            return;
        }
                 
    }
}
