package com.example.test.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Thread4 implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {

        for (int i=0; i<20; i++){
            System.out.println("thead"+i);
        }
        return true;
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Thread4 thread4 = new Thread4();

        //创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //提交
        Future<Boolean> submit = executorService.submit(thread4);
        //获取结果
        Boolean aBoolean = submit.get();
        System.out.println(aBoolean);
        //关闭
        executorService.shutdownNow();
    }
}
