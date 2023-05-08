package com.example.test.proxy;

public class Proxy1 {

    public static void main(String[] args) {
        Eat eat = new Eat(new You());
        eat.eat();
    }
}

interface proxyEat{

    void eat();
}

class You implements proxyEat{

    @Override
    public void eat() {
        System.out.println("你吃饭");
    }
}

class Eat implements proxyEat{

    private proxyEat proxyEat;

    Eat(proxyEat proxyEat){
        this.proxyEat = proxyEat;
    }

    @Override
    public void eat() {
        System.out.println("饭前洗手");
        this.proxyEat.eat();
        System.out.println("饭后洗手");
    }
}
