//Enzo Joaquin Itona Erfe
//3-3-2021
//For alternate, cleaner version please refer to Q1_Alt.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class Q1 extends JFrame implements ActionListener{
    //JFrame initialization
    JLabel lb1, lb3, lb4;
    JTextField tf2;
    JButton btn;
    Font f1 = new Font("Calibri",Font.BOLD, 24);
    Font f2 = new Font("Calibri",Font.ITALIC+Font.BOLD, 24);
    
    char arr[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
    
    //create new Jframe
    public static void main(String[] args){
        Q1 f = new Q1();
        f.pack();
        f.setTitle("Q1: String Converter");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //String Converter Function for Q1
    public void convertNewArr(String message){
        //initialization
        char [] msgArr;
        String result="";
        int i, j;
        //convert string to char array 
        msgArr = message.toCharArray();
        
        //display old array
        System.out.println("Old array :");
        for (char c : msgArr) { 
            System.out.print(c + " "); 
        }
        
        //convert + display new array
        System.out.print("\n\nNew array:\n");
        for(i=0;i<message.length();i++){
            for(j=0;j<arr.length;j++){
                if(msgArr[i] == arr[j]){
                    switch(arr[j]){
                        case 'Z':
                            result+= String.valueOf(arr[0]) +" ";
                            break;
                        case 'z':
                            result+=String.valueOf(arr[26]) +" ";
                            break;
                        case ' ':
                            result+=String.valueOf(arr[52]) +" ";
                            break;
                        default:
                            result+=String.valueOf(arr[j+1]) +" ";
                    }
                    System.out.println(result);
                }
            }
        }
        System.out.println(""); 
        lb4.setText(result);
        
    }
    //setting up the frame
    public Q1(){
        //components
        lb1 = new JLabel("Original Array: ");
        lb1.setHorizontalAlignment(JLabel.CENTER); 
        lb1.setFont(f1);
        tf2 = new JTextField(20);
        
        btn = new JButton("Convert");
        
        lb3 = new JLabel("New Array: ");
        lb3.setHorizontalAlignment(JLabel.CENTER); 
        lb4 = new JLabel("");
        
        //panels
        JPanel p1= new JPanel();
        p1.setLayout(new GridLayout(1,2));
        p1.add(lb1);
        p1.add(tf2);
        
        JPanel p2= new JPanel();
        p2.add(btn);
        
        JPanel p3= new JPanel();
        p3.setLayout(new GridLayout(1,2));
        p3.add(lb3);
        lb3.setFont(f1);
        p3.add(lb4);
        lb4.setFont(f2);
        
        //add to frame
        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);
        
        //actionListener
        btn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String oldArray="";
        
        oldArray=String.valueOf(tf2.getText());
        
        if(e.getSource() == btn){
                convertNewArr(oldArray);
        }
    }
    
}
