package assignment1_10524192;
import java.util.Scanner;
public class MoreUserInputofData {
    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);
        String firstname;
        String secondname;
        double gpa;
        int grade;
        int idnumber;
        String login;
    System.out.print("First name :");
    firstname=keyboard.next();
    
    System.out.print("Last name: ");
    secondname=keyboard.next();
    
    System.out.print("Grade (9-12):");
    grade=keyboard.nextInt();
    
    System.out.print("Student id number: ");
    idnumber=keyboard.nextInt();
        
    System.out.print("Login name: ");
    login=keyboard.next();
  
    
    System.out.print("GPA (0.0 to 4.0) : ");
    gpa=keyboard.nextDouble();
    System.out.println("");
    System.out.println("");
       
   System.out.println("Your information:");
   System.out.println("     Login: "+login+"");
   System.out.println("     ID: "+idnumber+"");
   System.out.println("     Name:  "+secondname+","+firstname+"");
   System.out.println("     GPA: "+gpa+"");
   System.out.println("     Grade " +grade+"");
   
    }  
}

