package javabasics;

public class ArrayExample {

    public static void main(String[] args) {

       int [] a = {56,90,32,80}; // 0 1 2 3
       String [] k = {"aravinth","learnmore"}; // 0 ,1

        System.out.println(a[4]);

        for (int i =0 ; i < k.length; i++){

            System.out.println(k[i]);
        }

        System.out.println(a.length);
        System.out.println(k.length);

        //0 < 4
        // 1 < 4
        // 2 < 4
        //3 < 4
        // 4 < 4  - false

       for (int j=0 ; j < a.length ;j++){

           System.out.println(a[j]);
       }

       //a[0]
    }

}
