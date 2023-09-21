package javabasics;

public class StaticExample {


    public static void m2(){
        NonStaticExample.m3();
        NonStaticExample n = new NonStaticExample();
        n.m1();

    }
}
