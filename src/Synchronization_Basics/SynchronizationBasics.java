package Synchronization_Basics;


class Counter{
    int count=0;
   synchronized void increment(){
        count++;
    }

    void incCount(){
       synchronized (this){
           count++;
       }
    }
}

public class SynchronizationBasics{
    public static void main(String[] args) throws Exception {

        Counter c=new Counter();

        Thread t1=new Thread(()->{
            for(int i=0;i<10000;i++){
                c.incCount();
            }
        });

        Thread t2=new Thread(()->{
            for(int i=0;i<10000;i++){
                c.incCount();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}


