
package assignment1_10524192;

import java.util.Scanner;
public class AgeNameandSalary {
    public static void main(String[] args){
   Scanner keyboard= new Scanner(System.in);
   String name;
   int age;
   int salary;
        
        
  System.out.println("Hello. What is your name");
  name=keyboard.next();
  System.out.print("Hi, "+name+ " How old are you? ");
  age=keyboard.nextInt();
  System.out.println("So you're " +age+ ", eh? That's not old at all!");
  System.out.println("How much do you make, Dennis?");
  salary=keyboard.nextInt();
  System.out.println(+salary+ "  I hope that's per hour and not per year! LOL!");
    }
    
}
