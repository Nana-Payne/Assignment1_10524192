/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_10524192;

/**
 *
 * @author Daniel Pappoe
 */
import java.util.Scanner;
public class Askingquestions {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int age;
        String feet;
        String inches;
        double weight;
        
        System.out.println("How old are you?");
        age=keyboard.nextInt();
        
        System.out.println("How many feet tall are you?");
        feet=keyboard.next();
        
        System.out.println("And how many inches:");
        inches=keyboard.next();
        
        System.out.println("How much do you weigh?");
        weight=keyboard.nextDouble();
        
        System.out.println("So, you're  "+age+"years old, "+feet+"'"+inches+"  tall and  "+weight+" heavy");
        
        
        
           
    }
    
}
