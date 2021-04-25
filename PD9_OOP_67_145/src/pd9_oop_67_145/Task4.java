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
public class Task4 {
    
 public static void main(String[] args){
    
    System.out.print("Input :");
    int input;
    Scanner obj = new Scanner(System.in);
    input = obj.nextInt();
    
    switch(input){
        case 0:
           System.out.print("Enter Input :");
           Scanner scanner= new Scanner(System.in);
            String s1 = scanner.nextLine();
            
            boolean b = isValidEmail(s1);
            if(b == true){
                System.out.print("In correct input");
            }   else{
                System.out.print("Correct input ");
            }
            break;

            
        case 1:
            
           Scanner scan= new Scanner(System.in);
           System.out.print("Enter Input :");
            String s2 = scan.nextLine();
            boolean a = ContainMethod(s2);
             if(a == true){
             System.out.print("Correct input ");
         }  
       else{
        System.out.println("In correct input");
          }    
            break;
            
        case 2:
            Scanner s= new Scanner(System.in);
           System.out.println("Enter Input :");
            String s3 = s.nextLine();
            boolean c = Empty(s3);
             if(c == true){
             System.out.println("Correct input ");
         }  
       else{
        System.out.println("In correct input");
          }    
            break;
            
        case 3:
            Scanner in= new Scanner(System.in);
           System.out.println("Enter Input :");
            String s4 = in.nextLine();
            boolean d = StartWith(s4);
             if(d == true){
             System.out.println("Correct input ");
         }  
        case 4:
           Scanner reader= new Scanner(System.in);
           System.out.println("Enter Input :");
            String s5 = reader.nextLine();
            String s6=s5.toUpperCase();
            System.out.println(s6);
            
            break;
            
        default:
            
          System.out.print("0");  
  }
    
    
        
    }
 /*
 *This function defines the method to check whether 
 *the entered email is correct or not.
 *@param mail(of string type)
 *@return return type is boolean.
 */
    
   public static boolean isValidEmail(String mail){
       String regex = "/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$/.";
       return mail.matches(regex);
   }
    /*
 *This function defines the method to check whether 
 *the entered substring ia part of string or not.
 *@param S1(of string type)
 *@return return type is boolean.
 */
   public static boolean ContainMethod(String S1){
       String S2="a";
        boolean Contain = S1.contains(S2);
        if(Contain){
            return true;
        }
        else
        {
            return false;
        }
   }
 /*
 *This function defines the method to check whether 
 *the entered string is empty or not.
 *@param S1(of string type)
 *@return return type is boolean.
 */
   public static boolean Empty(String S1){
       boolean empty = S1.isEmpty();
        if(empty){
            return true;
        }
        else
        {
            return false;
        }
   }
 /*
 *This function defines the method to check whether 
 *the entered start is correct or not.
 *@param S1(of string type)
 *@return return type is boolean.
 */ 
   public static boolean StartWith(String S1){
       boolean SW = S1.startsWith("I");
        if(SW){
            return true;
        }
        else
        {
            return false;
        }
   }
 /*
 *This function defines the method to convert a lowercase 
 *string to uppercase string.
 *@param s(of string type)
 *@return return type is String.
 */
   public static String toUpperCase(String s)
   {
       String upperC;
     upperC = s.toUpperCase();
     return upperC;
   }
   
}    
