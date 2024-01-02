package org.example;


class ParentTest{

    void show(){
        System.out.println("P. SHOW");

    }

    void display(){
        System.out.println("P. DISPLAY");

    }

}

class ChildTest extends ParentTest{
    void insert(){
        System.out.println("C.INSERT");

    }
    void show(){
        System.out.println("C. SHOW");

    }

}

public class InheritanceDemo

{
    public static void main(String[] args) {
        ChildTest c= new ChildTest();
        c.display();
        c.show();
        c.insert();

        System.out.println("--------------");

        ParentTest obj= new ChildTest();

        obj.display();
        obj.show();
        //obj.insert();

        System.out.println("--------------");

        ParentTest obj2=new ParentTest();

        obj2.display();
        obj2.show();
        //obj2.insert();



    }
}
