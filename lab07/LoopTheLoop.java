import java.util.Scanner;



public class LoopTheLoop {

static Scanner myScanner;

    public static void main(String[] args) {
       
        myScanner= new Scanner (System.in);
        int nStars= 10;
        String in="*";
        String out="";
        String val="";
        int input= 0;
        
        
        System.out.println("Enter an Integer from 1 to 15");
        if (myScanner.hasNextInt() ) {
            nStars=myScanner.nextInt();
                if ( (nStars>=1) && (nStars<=15) ) {
                    for (int i=0; i<=nStars; i +=1) {
                        out += in;
                    }
                    System.out.println(" "+out+" ");
                    out=""; in="*";
                    for (int i=0; i<=nStars; i +=1) {
                        out += in;
                        System.out.println(" "+out+" ");
                    }  
                }
                else {
                System.out.println("You did not enter a number from 1 and 15");
                }
                
        }
        else {
        System.out.println("You did not enter an Integer");
        }
        
        
        
        boolean run= true;
        int nStars2= 0;
        String in2="*"; 
        String out2="";
        
        
        while (run) {
            System.out.println("Would you like to run this again? (Y,y) (Any other key to quit)");
            val=myScanner.next();
            if (val.equals("y") || val.equals("Y")) {
                System.out.println("Enter an Integer from 1 to 15");
                    if (myScanner.hasNextInt() ) {
                            nStars2=myScanner.nextInt();
                            if ( (nStars2>=1) && (nStars2<=15) ) {
                                for (int i=0; i<nStars2; i +=1) {
                                out2 += in2;
                                }
                                System.out.println(" "+out2+" ");
                                out2=""; in2="*";
                                for (int j=0; j<nStars2; j +=1) {
                                    out2 += in2;
                                    System.out.println(" "+out2+" ");
                                }
                                out2=""; in2="*";

                            }
                            else {
                            System.out.println("You did not enter a number from 1 and 15");
                            }
                
                    }
                    else {
                    System.out.println("You did not enter an Integer");
                    }
        
            
            }
            else {
            System.out.println("You have chosen to end the program"); break;
            }
        
        }
        

   
   
   
    }
}