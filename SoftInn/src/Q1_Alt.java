//Enzo Joaquin Itona Erfe
//3-3-2021

import java.util.Scanner;

public class Q1_Alt {
    public static void main(String[] args){
        //Initialization
        String oldArray="";
        Scanner input = new Scanner(System.in);
        
        System.out.print("Old string : ");
        oldArray=input.nextLine();
        
        //Call function
        convertNewArr(oldArray);
        
    }
    //Function for Q1
    public static void convertNewArr(String message){
        //Initialization
        char [] msgArr;
        char arr[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
        String result="", translated = "";
        int i, j;
        
        //Convert string to char array
        msgArr = message.toCharArray();
        
        //Display old array
        System.out.print("Old array : [");
        for(i=0; i<msgArr.length;i++) { 
            System.out.print("\""+ msgArr[i] + "\", "); 
        }
        System.out.print("]");
        
        //Convert and display new array
        System.out.print("\n\nNew array:\n");
        //Compare message array with alphabet array
        for(i=0;i<message.length();i++){
            for(j=0;j<arr.length;j++){
                //if matched, default should convert to next char
                if(msgArr[i] == arr[j]){
                    switch(arr[j]){
                        //Exception for 'Z', 'z' and ' ' (space)
                        case 'Z':
                            translated = String.valueOf(arr[0]);
                            break;
                        case 'z':
                            translated = String.valueOf(arr[26]);
                            break;
                        case ' ':
                            translated = String.valueOf(arr[52]);
                            break;
                        default:
                            translated = String.valueOf(arr[j+1]);        
                    }
                    //for displaying each conersion
                    result+= translated;
                    //store into result variable for final display
                    System.out.println("\"" + msgArr[i] + "\"" +" => "+ "\""+ translated + "\"");
                }
            }
        }
        //Final display for new string
        System.out.println("\nNew String : \""+ result + "\"");
        
    }
}
