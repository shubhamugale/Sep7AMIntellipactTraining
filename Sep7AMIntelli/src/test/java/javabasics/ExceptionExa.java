package javabasics;

import org.openqa.selenium.TimeoutException;

public class ExceptionExa {

    public static void main(String[] args) {
        String v = "$123";
        try {
            int a = 1;
            int n = Integer.parseInt(v);
            System.out.println(a + n);
        }
        catch (NumberFormatException a){
           String b = v.substring(1);
          int h = Integer.parseInt(b);
            System.out.println(h+1);
        }
        catch (TimeoutException b){

        }
        finally {

        }


    }
}
