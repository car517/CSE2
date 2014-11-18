public class Test {
public static void main(String[] args) {


    for (int i=9; i>0; i--) {
        
        int j= i;
        String space= "";
        int input= j-1;
        for (int t=1; t<=input; t++) {
           
            space += " ";
            
            
        }
        System.out.println( space + j);
        space=""; j=0; input =0;
        
    }    
       
    }   
}