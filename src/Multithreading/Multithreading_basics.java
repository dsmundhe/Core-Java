package Multithreading;

class MyThread extends Thread{
    public void run(){
        System.out.println("Thread running!");
    }
}

class MyThreadRunnable implements Runnable{
    public void run(){
        System.out.println("Thread running via Runnable!");
    }
}

public class Multithreading_basics {
    public static void main(String[] args){
        MyThread mt=new MyThread();
        mt.start();

        //Thread via runnable
        Thread t =new Thread(new MyThreadRunnable());
        t.start();
}
}