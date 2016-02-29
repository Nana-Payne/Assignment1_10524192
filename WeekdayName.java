
package assignment1_10524192;


public class WeekdayName {
    public static void main(String[] args){
        
        int dayNum = 0;
        dayNum++;
       
        if(dayNum == 1){
            System.out.println("Weekday " + dayNum +": Sunday");
            dayNum++;
        }
        if (dayNum == 2){
            System.out.println("Weekday " + dayNum +": Monday");
            dayNum++;
        }
        if (dayNum == 3){
            System.out.println("Weekday " + dayNum +": Tuesday");
            dayNum++;
        }
        if (dayNum == 4){
            System.out.println("Weekday " + dayNum +": Wednesday");
            dayNum++;
        }
        if (dayNum == 5){
            System.out.println("Weekday " + dayNum + ": Thursday");
            dayNum++;
        }
        if(dayNum == 6){
            System.out.println("Weekday " + dayNum + ": Friday");
            dayNum++;
        }
        if (dayNum == 7){
            System.out.println("Weekday " + dayNum +": Saturday");
            dayNum++;
        } 
        dayNum = 0;
        
        if (dayNum == 0){
            System.out.println("Weekday " + dayNum + ": Saturday");
        }
        System.out.println();
        
        dayNum =+ 43;
        if(dayNum > 7 || dayNum < 0){
                System.out.println("Weekday " + dayNum + ": error");
                dayNum = 17;
                System.out.println("Weekday " + dayNum + ": error");
                dayNum = -1;
                System.out.println("Weekday " + dayNum + ": error");
            }
        
        System.out.println();
        System.out.println("Today is a Wednesday!");
        
    }
    
}
