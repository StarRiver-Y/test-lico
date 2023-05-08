package com.example.test.thread;

//实现Runnable
public class Thread3 implements Runnable{

    private int num = 10;
    @Override
    public void run(){
        while (num > 0) {
            //模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + num-- + "票");
        }
    }

    public static void main(String[] args) {

        Thread3 thread3 = new Thread3();
        //创建Thread做代理
        new Thread(thread3,"线程1--").start();
        new Thread(thread3,"线程2--").start();
        new Thread(thread3,"线程3--").start();

    }
}
