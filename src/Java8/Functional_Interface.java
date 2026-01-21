package Java8;


@FunctionalInterface
interface FunctionalInterfaceTest{
    //SAM -> Single abstract method
    void print();

    //can have multiple default and static methods
    default void hello(){
        System.out.println("Hello Mr.Dipak");
    }

    static void greet(){
        System.out.println("Good Morning Mr.Dipak");
    }
}

public class Functional_Interface {
    public static void main(String[] args){

        FunctionalInterfaceTest fit=()->System.out.println("Hey i am print");

        fit.print();
        fit.hello();
        FunctionalInterfaceTest.greet();
    }
}
