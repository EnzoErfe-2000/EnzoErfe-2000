//Enzo Joaquin Itona Erfe
//3-3-2021

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        int n, dotResult;
        char choice='Y';
        
        //loop (optional)
        do{
            //error handling (1)
            try{
                Scanner input = new Scanner(System.in);
                
                //get input
                System.out.print("Enter the triangle number of the sequence (n) : ");
                n = input.nextInt();
                
                //function call
                dotResult = TriangularNumberSequence(n);
                
                //display result
                System.out.println("TriangularNumberSequence(" + n +") => " + dotResult);
                
                //loop (optional)
                System.out.print("\nContinue? [Enter Y to continue (string/char)] : ");
                choice = input.next().charAt(0);
            }
            //error handling (2)
            catch(Exception e){
                System.out.println("Error! Please re-enter the correct format (Int)\n");
            }
        }while(choice == 'Y' || choice == 'y');
        
    }
    //Function for Q3
    public static int TriangularNumberSequence(int n){
        int dots=0;
        for(int i=0; i<n; i++){
            dots += (i+1);
        }
        return dots;
    }
}
