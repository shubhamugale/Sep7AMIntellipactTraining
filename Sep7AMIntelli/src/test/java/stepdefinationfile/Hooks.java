package stepdefinationfile;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import resuable.BaseCode;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Hooks {

    //before start of every scenario
    @Before()
    public void setup() throws IOException {
        System.out.println("Launch Browser");
        BaseCode.launchBrowser();
    }

    @After()
    public void close(){
        System.out.println("close");
    }



}
