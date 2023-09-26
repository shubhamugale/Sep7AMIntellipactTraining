package javabasics;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> j = new HashSet<Integer>();
        j.add(56);
        j.add(90);
        j.add(23);
        System.out.println(j);
        j.add(23);
        System.out.println(j);

        for(int v:j){
            System.out.println(v);
        }
    }
}
