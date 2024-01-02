package org.example;

class Test{
    void show(){
        System.out.println("no parameter");
    }
    void show(int a){
        System.out.println("integer parameter");
    }
    void show (String a){
        System.out.println("string parameter");

    }

}

public class OverloadingDemo {

    public static void main(String[] args) {
        Test t=new Test();
        t.show(1);
        t.show("abc");

    }

}
