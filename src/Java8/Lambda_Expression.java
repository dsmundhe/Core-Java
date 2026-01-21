package Java8;

//Functional interfaces
interface PrintInterface{
    void print();
}

interface Calculator{
    int add(int a,int b);
}

public class Lambda_Expression {
    public static void main(String args[]){

        PrintInterface print=()-> System.out.println("Hey i am inside print interface");
        print.print();

        Calculator cal=new Calculator() {
            public int add(int a,int b){
                return b;
            }
        };

        Calculator cal1=(a,b)->a+b;

        System.out.println(cal1.add(10,20));
    }
}
