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
public class Task2 {
    
public static void main(String[] args){
    
    Scanner scanner= new Scanner(System.in);
    System.out.print("Enter the sentence:");
    String sen = scanner.nextLine();
    System.out.println("Your sentence printed vertically is:");
    displayVertical(sen);
}    
    
public static String displayVertical(String sen){

    if(sen != null && !"".equals(sen)){
        int strLen = sen.length();

        for (int i=0; i<strLen; i++){
            System.out.println(sen.charAt(i));
        }

    }
    return sen;

}
}
