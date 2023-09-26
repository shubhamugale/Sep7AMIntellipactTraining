package javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List <Integer> l = new ArrayList<Integer>();
        l.add(67);
        l.add(100);
        System.out.println(l);
        l.add(55);
        System.out.println(l);
        l.add(100);
        System.out.println(l);
        System.out.println(l.get(1));
        l.add(1,78);

        l.add(4,78);


        for(int u:l){
            System.out.println(u);
        }

        List <String> k = new ArrayList<String>();
        k.add("Aravinth");
        k.add("hello");
        System.out.println(k);
        k.add(1,"new");

        for(String output:k){
            System.out.println(output);
        }


    }
}
