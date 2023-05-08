package com.example.test.thread;

public class Thread5 {

    public static void main(String[] args) {
        Yield yield = new Yield();

        new Thread(yield,"a").start();
        new Thread(yield,"b").start();
    }


}

class Yield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"---start");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"---end");

    }
}
