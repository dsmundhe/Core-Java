package Java8;

import java.util.Arrays;
import java.util.List;


class Printer{
    public void print(int n){
        System.out.println(n);
    }
}

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,2,3,4,5,6,7,8,9);

        //print list
//        ls.stream().forEach(System.out::println);

        Printer p=new Printer();
        ls.forEach(p::print);
    }
}
