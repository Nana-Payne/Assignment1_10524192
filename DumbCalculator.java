package assignment1_10524192;
import java.util.Scanner;
public class DumbCalculator {
    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);
        
        double number1;
        double number2;
        double number3;
        System.out.println("What is your first number? ");
        number1=keyboard.nextDouble();
        
        System.out.println("What is your second number? ");
        number2=keyboard.nextDouble();
        
        System.out.println("What is your thrid number? ");
        number3=keyboard.nextDouble();
        
        System.out.println("("+number1+"+"+number2+"+"+number3+") / 2 is..."+((number1*3)/2)+")");
    }
   
}
