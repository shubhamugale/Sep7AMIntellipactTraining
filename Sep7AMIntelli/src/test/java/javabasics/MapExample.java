package javabasics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer,String> m = new HashMap<Integer,String>();
        m.put(123,"err");
        m.put(345,"ana");
        m.put(890,"uuu");

        System.out.println(m);

        System.out.println(m.get(890));

        for (Map.Entry j:m.entrySet()){
            System.out.println(j);
            System.out.println(j.getKey());
            System.out.println(j.getValue());
        }

    }
}
