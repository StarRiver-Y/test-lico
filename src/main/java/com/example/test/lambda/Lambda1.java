package com.example.test.lambda;

public class Lambda1 {


    public static void main(String[] args) {
        Like like = ()->{
            System.out.println("111");
        };
        like.like();
    }

}

interface Like{

    void like();
}
