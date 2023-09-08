/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd9_oop_67_145;

import java.util.Scanner;

/**
 *
 * @author aysha
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner reader=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string=reader.nextLine();
        System.out.println("Enter the string: ");
        System.out.println("Number of words: "+wordCounter(string));
        System.out.println("Number of vowels: "+vowelcounter(string));
        System.out.println("Number of punctuations: "+puncCount(string));
        System.out.println("Enter the sub string: ");
        String subString=reader.nextLine();
        if(findSubString(string,subString)==true)
        {
            System.out.println("\""+subString+"\" is a part of this string");
        }
        else
        {
           System.out.println("\""+subString+"\" is not a part of this string"); 
        }
    }
        public static int wordCounter(String s)
        {
            int count=1;
            int size=s.length();
            for(int i=0;i<size;i++)
            {
                if(!((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)!=' ')))
                {
                    count=count+1;
                }
            }
            return count;
        }
        ////function of vowel counter////
        public static int vowelcounter(String s)
        {
            int count=0;
            int size=s.length();
            for(int i=0;i<size;i++)
            {
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
                {
                    count=count+1;
                }  
            }
            return count;
        }
        ////function for punctuate counter////
        public static int puncCount(String s)
        {
            int count=0;
            int size=s.length();
            for(int i=0;i<size;i++)
            {
                if(!((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)==' ')))
                {
                    count=count+1;
                }
            }
            return count;
        }
            public static boolean findSubString(String s,String sub)
            {
                boolean flag=false;
                    if(s.contains(sub))
                    {
                        flag=true;
                    } 
                    return flag;
            } 
    
}
