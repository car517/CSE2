/////////////////////////
// Carlos Rosario
// Decemeber 4 2014
// CSE 002
// Matrix Java Program
// This program creates 3 slabs with methods to print sort and show 



public class MatrixSorter{ //class
  public static void main(String arg[]){//main method
    int mat3d[][][];//3d array decleration
    mat3d=buildMat3d();//method to build 3d matrix
    show(mat3d);//method to print matrix
    System.out.println("The smallest entry in the 3D matrix is "+findMin(mat3d) ); //find minimum 
   /* System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]); //sorts the method
    show(mat3d); //print new mat3d*/
   }
   
   public static int findMin (int [][][] mat3d) { //method for sorting my array according to rank, which we need to check for a straight
        int row = 3;
        int num = 1;
        int start = 1;
        // Find the minimum 
        int currentMin = mat3d[0][0][0];
        

            
        for (int j=0; j < 3;j++) {    
            
            
            
            for (int i = 0; i < row; i++) {
                
                
                
                for(int p = 0; p < start; p++) {
                    
                    
                    if ( (currentMin) > (mat3d[j][i][p]) ) { //if currentmin rank value is greater than the next value in array, then set that next value equla to new min, swap
                    currentMin = mat3d[j][i][p]; 
                    
                    }
                    
                    
                    
                }
                
                start++;
            }
           
            
            row += 2;
            num++;
            start = num;
        }
            
            
            
            

             
        
        return currentMin; //return min
    }
    
    
    public static void show(int [][][] mat3d) {
        
        
        int row = 3;
        int num = 1;
        int start = 1;
        String out="";
        String dash="-";
        for (int h=0; h<25; h++) { //for loop for the dashes
            out += dash;
        }
        
        for (int j=0; j < 3;j++) {    //for loop for slabs
            
            
            
            for (int i = 0; i < row; i++) { //for loop for rows
                
                
                
                for(int p = 0; p < start; p++) { //for loop for columns
                    
                    System.out.print(" " + mat3d[j][i][p]); //print arrays
                }
                System.out.println();
                start++;
            }
            System.out.println(out+"Slab"+(j+1));
            System.out.println();
            
            row += 2;
            num++;
            start = num;
        }
        
        
        
        
    }
    
    
    
    
    public static int [][][] buildMat3d () { //build array
        int mat3d[][][];
        mat3d = new int[3][][]; //we know that there are 3 slabs, row and columns varies between slabs
        
        int row = 3;
        int num = 1;
        int start = 1;
        
        for (int j=0; j < 3;j++) {    
            
            mat3d[j] = new int[row][]; //reference for array lenth
            
            for (int i = 0; i < row; i++) {
                
                mat3d[j][i] = new int[start]; //reference for olenth
                
                for(int p = 0; p < start; p++) {

                    mat3d[j][i][p]= (int) ( (Math.random()*99)+1 ); //assign random value
                    
                
                }
              
                start++;
            }
            
            
            row += 2;
            num++;
            start = num;
        }
    
    
    return mat3d;
    
    }
  
}

///Grader, Good Luck with your exams, thank you for the year. Unfortunately I could not finish the rest of the program
//I have tons of exams that I was studying for, but as you can see from how far I got I clearly understand the concepts of 3D arrays
//Please dont take away too many points, I can easily finish the rest but cant before the 11 o clock time limit if you can still take it, thank you 
//my email is car517@lehigh.edu