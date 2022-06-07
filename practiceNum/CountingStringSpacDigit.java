/*Write a Java program to count the letters, spaces, numbers and other characters of an input 
string.*/

import java.util.*;

import javax.print.attribute.standard.MediaSize.Other;
public class CountingStringSpacDigit {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("input to String: ");
        s=sc.nextLine();
        char[] x=s.toCharArray();
        int letter=0;
        int space=0;
        int number=0;
        int other=0;
        for (int i=0;i<x.length;i++){
            if(Character.isLetter(x[i])){
                letter++;
            }
            else if(Character.isDigit(x[i])){
                number++;
            }
            else if(Character.isSpaceChar(x[i])){
                space++;
            }
            else{
                other++;
            }

        }
        System.out.println("letter: "+letter);
        System.out.println("number: "+number);
        System.out.println("space: "+space);
        System.out.println("other: "+other);
    }
    
}
