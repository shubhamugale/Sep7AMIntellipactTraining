package javabasics;

public class NonStaticExample {

   static int a;  //global variable

    public void m1(){

            // local variable - life ends within the method

        a = 1;
        System.out.println(a);

    }

    public static void m3(){

        String name = "aravinth";

        System.out.println(a);
    }

}
