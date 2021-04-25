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
public class Task3 {
    
 public static void main(String[] args){
   Scanner scanner= new Scanner(System.in);
    System.out.println("Input String to remove multiple blanks:");
    String s;
    s = scanner.nextLine();
    System.out.println(ridMultipleBlank(s));
    
    System.out.println("Input String to remove integer:");
    s = scanner.nextLine();
    System.out.println(removeInteger(s));
    
    System.out.println("Input String to encrypt:");
    s = scanner.nextLine();
    System.out.println(encrypt(s));
    
    }
    
   public static String ridMultipleBlank(String s){
       
       String blank = s.replaceAll("\\s+"," ");
       //System.out.println(blank);
       return blank;
   }
   
   public static String removeInteger(String s){
       
       String remove = s.replaceAll("[0-9]"," ");
       //System.out.println(remove);
       return remove;
   }
   
   public static String encrypt(String s){
    int code= 234;
    String result = "";
    char[] c = s.toCharArray();
    for (int i = 0; i < c.length; i++)
    {
        c[i] = (char) (c[i] + code);
      //code = Math.round((float) Math.random()*8+1);
      //result += code + Integer.toHexString( ((int) s.charAt(i) ) ^ code )+"-";
      result = result + Character.toString(c[i]);
    }
    //return result.substring(0, result.lastIndexOf("-"));
    return result;
  }
}

