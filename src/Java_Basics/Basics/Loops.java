package Java_Basics.Basics;

public class Loops {
    public static void main(String[] args){
        //Loops

        //for loop
        //print 1 to 10

        //using for loop
        System.out.println("For Loop!");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        int count=1;
        //using while loop
        System.out.println("While Loop!");
        while(count <=10){
            System.out.println(count);
            count++;
        }

        //using do while loop
        count =1;
        System.out.println("Do-While Loop!");
        do{
            System.out.println(count);
            count++;
        }while(count<=10);
    }
}
