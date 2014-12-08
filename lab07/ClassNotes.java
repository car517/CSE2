import java.util.Scanner;



public class ClassNotes {

static Scanner myScanner;

    public static void main(String[] args) {
       
        myScanner= new Scanner (System.in);
        
         //  String smln= Integer.toString(input);
           //     String out=""; 
                
                // Code in the making into a function
                        
                        /*for (int j=0; j<input; j++) {    
                            for (int i=0; i<((input*2)-1);i++) {
                                
                                out += smln;
                            }
                            //System.out.println(""+out); 
                            out="";
                            //smln= Integer.toString(input);
                        }*/
                        
//REVIEW FOR EXAM 2

//Write what happend to varibles in a column next to exam problem, Need to look at pass by value, Review call by value system, 

   /* for ( int i=0, i<10, i++) {
        for (int j=0, j<5, j++){
            if (j<i && i<5)
            System.out.print(i);
        }
        if (j<i-5 && i>=5)
        System.out.print(i); //this is 0000, 11111,22222
    }*/ 
           
////////////////////////
// Arrays 
// multidimensional rays and sorts are on final but not third exam
// lets say you have a long list of IDs, and need them as variables, you cant make a million variables, and dont have a way to automate through the list of variable, running a procedure that runs through everything
// this is where arrays come in doggy
// list of primitive types
// (New) need to allocate space for arrays
// we declare an array liek "int [] studentId;
// "[]" indicates that there's a list of integers, and array of integetrs
// StudentIDs[] - pointer to where data is, place in memory reserved for this list, and you can change where things potnt
// We need to point at a place of memory because we dont know how many things we want to store
// Need to know this in order to reserve that space in memory
// Regular variables don't have a length, they are stored as just a value, which has a predifined amount of space
// Need to tell array how to allocate space to store everything on the list
// studentIds= new int [NUM_STUDENTS]; tells the length of NUM_STUDENTS, new returns a location in memory
// array type
// First member of array is 0
// if you have numbers use loop, 
// you can use arithmetic expression to jump and change order of arrays
// critical thing about arrays is to know how long it is
// length of an array is always .length not with parenthisis
//see slide for for loop on grades
//shuffle- take random pairs and shuffle their value around
//shuffle only really used for card games or something
//need for loopo to have completely copied array, or else setting them equal to each other will only keep onek
                        
        
   //Method that doesn't do anyything might print something on the screen (void) , and also make something easier to read
   //
   
   
///////////////////////////////////////////////////////////
/////// Book Notes Arrays ////////////////
/* Multidimensional Arrays //
// double [] [] distances = {
     {0, 983, 787, 714, 1375, 967, 1087}
     {3, 433, 434, 311, 3454, 502, 1093}
    }
two dimensional array decleration
     elemnttype [][] arrayrefvar; or elementtype arrayname[][]
for integers
    int [][] matrix; or int matrix[][](style allowed but not preferred)
    matrix= new int [5(row)][5(column)];
To assign values at certain point just go
    matrix [2][1]= 7;
The logic is, there are two arrays, x[0], x[1], with one element in each, so x.length would give you 2, for number of rows
x[0].length and x[1].length are each 1
Ragged array is one in which the rows each have different number of elements, usually done by the long way used in line 76 and 77
or you can say
    int [][] myarray= new int [5][];
    myarray[0]= new int [5];
    myarray[1]= new int [4];
    myarray[2]= new int [12];
Then you can assign values, liek myarray[2][3]=12;
if you do myarray[0]=x, would all elements in this array = x ?

    
      */
   /* int[][] array = new int[5][6];
    int[] x = {1, 2};
    array[0] = x;
    System.out.println("array[0][1] is " + array[0][4]);*/
    //What happens to the other spaces in the matrix, do they remain empty?
    //(Answer) Program compiles but has a runtime error
    
        
    int[][] r = new int[2]; //Incompatible types, need one bracket in beginning
    int[] x = new int[]; //This line doesn't compile because the dimension is not in it
    int[][] y = new int[3][]; //No Idea how this compiles if above line doesn't
  
    //Initializing arrays with input values 
    int [][] matrix= new int[10][10];

    System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
    for (int row = 0; row < matrix.length; row++) {
        for (int column = 0; column < matrix[row].length; column++) {
            matrix[row][column] = myScanner.nextInt();
        }
    }  
    
    //replace line 117 with (int)math.random*100 to decalre with numbers from 0 to 99
    
    }
}

