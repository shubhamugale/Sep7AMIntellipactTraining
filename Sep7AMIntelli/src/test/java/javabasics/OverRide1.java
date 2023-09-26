package javabasics;

public class OverRide1 extends OverRide2 {


    public static void main(String[] args) {

        OverRide2 a = new OverRide2();
        a.m1();
    }

    public void m1(){
        System.out.println("1");
    }
}
