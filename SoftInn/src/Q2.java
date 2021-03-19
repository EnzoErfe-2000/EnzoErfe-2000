//Enzo Joaquin Itona Erfe
//3-3-2021

import java.util.*;

public class Q2 {
    public static void main(String[] args){
        //Initialization
        String[] str =  new String[2];
        boolean result;
        char choice='Y';
        
        do{
        //Get input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        str[0] = input.nextLine();
        
        System.out.print("Enter String 2 : ");
        str[1] = input.nextLine();
        
        //Function call
        result = convert(str);
        //Display result
        System.out.println("\n[\"" + str[0]+  "\", \"" + str[1]+ "\"] => " + result);
        
        //looping prompt
        
        System.out.print("\nContinue? [Enter Y to continue (string/char)] : ");
        choice = input.next().charAt(0);
        }while(choice == 'y' || choice == 'Y');
    }
    
    //Function for Q2
    public static boolean convert(String[] STR){
        //Initialization
        char[] charArr1, charArr2;
        
        //Convert string to char array
        charArr1 = STR[0].toCharArray();
        charArr2 = STR[1].toCharArray();
        
        //Successful match check (if no. of successful matchyes == STR[1].length, true)
        int charChk = 0;
        //Check for repeating/duplicate matched char (i.e if STR[1] has 2 'n's and STR[0] only has 1 'n', false)
        int[] dupChk = new int[charArr1.length];
        
        //Match checking via nested for-loops
        for(int i=0; i<charArr2.length; i++){
            for(int j=0; j<charArr1.length; j++){
                //if chars match, charChecker goes up           
                //+           
                //if duplicateCheck[j]== 0 / charArr[j] has not been matched yet, change into duplicateCheck[j]== 1 to indicate successful match
                if(charArr1[j] == charArr2[i] && dupChk[j] == 0){
                    charChk++;
                    dupChk[j] = 1;
                    break;
                }
            }
        }
        //Final checks
        //all char in STR[i] is present in STR[0], charCheck same no. as charArr2.length, thus true
        if(charChk == charArr2.length){
            return true;
        }
        ////some char in STR[i] is missing in STR[0], charCheck no. less than charArr2.length, thus false
        else
            return false;
        
    }
}
