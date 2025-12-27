package Java_Basics.Basics;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age : ");
        int age=sc.nextInt();


        //traditional switch
        switch(age){
            case 10:
                System.out.println("Child age = 10");
                break;
            case 15:
                System.out.println("Child age = 15");
                break;
            default:
                System.out.println("Adult with age = "+age);
                break;
        }

        //switch with yield keyword
        int weekDay=2;
        String day= switch(weekDay){
            case 1 ->"Monday";
            case 2 -> "Tuesday";
            case 3 ->"Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 ->"Saturday";
            default -> "Sunday";
        };

        System.out.println("The day is : "+day);

        //new Switch statement
        switch(age){
            case 10 -> System.out.println("Age is 10");
            case 20 -> System.out.println("Age is 20");
            case 30 -> System.out.println("Age is 30");
            case 40 -> System.out.println("Age is 40");
            case 50 -> System.out.println("Age is 50");
            default -> System.out.println("Not in list!");
        }
    }
}
