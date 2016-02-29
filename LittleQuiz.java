
package assignment1_10524192;

import java.util.*;

public class LittleQuiz {
    public static void main(String[] args){
        String response = "";
        int ans = 0;
        int ans1 = 1;
        int ans2 = 2;
        int ans3 = 3;
        int counter = 0;
        
        Scanner answer = new Scanner(System.in);
        
        System.out.print("Are you ready for a quiz? ");
        answer.next();
        
        if(response == ""){
            System.out.println("Okay, here it comes!");
            
            //Question 1
            System.out.println("Q1) What is the capital of Alaska?");
        
            System.out.println(ans1 + ") Melbourne");
            System.out.println(ans2 + ") Anchorage");
            System.out.println(ans3  + ") Juneau");
            ans = answer.nextInt();
            
            if(ans == ans3){
                System.out.println("That's right!");
                counter++;
            }
            else {
                System.out.println("Sorry, " + ans + " is not the capital of Alaska.");
            }
            System.out.println();
            
            //Question 2
            System.out.println("Q2) Can you store the value \"cat\" is a string. ints can "
                    + "only store numbers.");
            System.out.println(ans1 + ") yes");
            System.out.println(ans2 + ") no");
            ans = answer.nextInt();
            
            if(ans == ans1){
                System.out.println("That's right!");
                counter++;
            }
            else
            {
                System.out.println("Sorry, \"cat\" is a string. ints can only store numbers");
            }
            System.out.println();
            
            //Question 3
            System.out.println("Q3) What is the result of 9+6/3?");
            int value = 9 + 6/ 3;
            System.out.println(ans1 + ") 5");
            System.out.println(ans2 + ") 11");
            System.out.println(ans3 + ") 15/3");
            ans = answer.nextInt();
            if(ans == ans2){
                System.out.println("That's right!");
                counter++;
            }
            else
            {
                System.out.println("You're wrong!");
            }
            System.out.println();
            System.out.println("Overall, you got " + counter + " out of 3 correct.");
            System.out.println("Thanks for playing!");
        }
        
        
        
    }
}
