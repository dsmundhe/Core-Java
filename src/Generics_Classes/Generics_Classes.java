package Generics_Classes;


class Box<T>{
    T value;
    Box(T value){
        this.value=value;
    }
    public void show(){
        System.out.println("Value -> "+this.value);
    }
}

class Pair<I,S>{
    I i;
    S s;
    Pair(I i,S s){
        this.i=i;
        this.s=s;
    }
    public void show(){
        System.out.println("Pair "+this.i);
        System.out.println(this.i +" "+this.s);
    }
}

public class Generics_Classes {
    public static void main(String[] args){

        Box<Integer> box=new Box<Integer>(10);
        box.show();

        Pair<Integer,String> pair=new Pair<Integer, String>(1,"Dipak");
        pair.show();
    }
}
