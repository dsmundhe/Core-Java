package Java8.Stream_API;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream_API {
    public static void main(String[] args) {

        //
        List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //Print list items
        ls.stream()
                .filter((num) -> num % 2 != 0)
                .forEach((val) -> System.out.println(val));

        ls.stream()
                .map((n) -> n * 2)
                .forEach(System.out::println);

        //new list of even elements
        List<Integer> evenList=ls.stream()
                                 .filter(n-> n%2==0)
                                 .collect(Collectors.toList());
        System.out.println(evenList);

        //total
        int total=ls.stream().reduce(0,(a,b)->a+b);
        System.out.println(total);

        Optional<Integer> total1=ls.stream().reduce((a, b)-> a+b);
        System.out.println(total1.get());

        int max=ls.stream().reduce(Integer.MIN_VALUE,(a,b)-> a>b ? a:b);
        System.out.println("Max : "+max);

        int min=ls.stream().reduce(Integer.MAX_VALUE,(a,b)-> a<b?a:b);
        System.out.println("Min : "+min);
    }
}