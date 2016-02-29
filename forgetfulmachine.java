/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_10524192;
import java.util.Scanner;
public class forgetfulmachine {
    public static void main(String[]args)
    {
    Scanner keyboard=new Scanner(System.in);
    String word1;
    String word2;
    int number1,number2;
  
    System.out.println("Give me a word");
    word1=keyboard.next();
         
    System.out.println("Give me another word");
    word2=keyboard.next();
    System.out.print("Great, now your favorite number  ");
    number1=keyboard.nextInt();
    System.out.print("And your second-favorite number is ");
    number2=keyboard.nextInt();
    
    System.out.println("Whew!  Wasn't that fun?");
    
   
    
    
            
    
}
}


