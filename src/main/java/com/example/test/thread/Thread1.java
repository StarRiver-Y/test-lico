package com.example.test.thread;

//继承thread类 重写run方法 调用start开启线程

//线程开启不一定立即执行 由cpu调度
public class Thread1 extends Thread{

    @Override
    public void run(){

        for (int i=0; i<20; i++){
            System.out.println("thead"+i);
        }
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        //start方法 和main线程同时执行
        thread1.start();
        //run方法先执行run方法 在执行main方法
        thread1.run();

        for (int i=0; i<20; i++){
            System.out.println("thead"+i);
        }
    }
}
