package javabasics;

public class OverLoadExample {

    public static void main(String[] args) {

        OverLoadExample o = new OverLoadExample();
        o.m1("Aravinth");
    }

    public void m1(int a){
        System.out.println(a);
    }
    public void m1(String a){
        System.out.println(a);
    }
    public void m1(int a , int b){
        System.out.println(a);
    }
    public void m1(String a , int b){
        System.out.println(a);
    }

}
