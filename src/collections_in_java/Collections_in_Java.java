package collections_in_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;

public class Collections_in_Java {
    public static void main(String[] args){

        //ArrayList
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list);
        System.out.println(list.get(2)); // get by index
        System.out.println(list.indexOf(20)); // indexOf by value
        System.out.println(list.remove(1)); //remove by index
        System.out.println(list);

        //Set
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(10); // list not allowed
        set.add(15);
        set.add(35);
        set.add(59);
        System.out.println(set);

        //Map
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Dipak Mundhe");
        map.put(2,"Maithili Ghodmare");
        map.put(3,"Aashvi Tekade");

        System.out.println(map);
        for(int id:map.keySet()){
            System.out.println(id +" "+ map.get(id));
        }

        System.out.println(map.getOrDefault(10,"Other"));
    }
}
