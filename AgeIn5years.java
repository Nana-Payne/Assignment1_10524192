
package assignment1_10524192;
import  java.util.Scanner;
public class AgeIn5years {
    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);
        String name;
        int age;
        
        System.out.print("Hello What is your name? ");
        name=keyboard.next();
        
         System.out.print("hi,"+name+" How old are you? ");
         age=keyboard.nextInt();
         
         System.out.println("Did you know that in five years you will be "+(age+5)+ "");
         System.out.println("And five years ago you were " +(age-5)+ " Imagine that!");
         
        
                
                
    }
    
}
