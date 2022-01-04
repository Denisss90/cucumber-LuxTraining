package com.luxoft.steps;

import com.luxoft.Auxillary;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    @Before(value = "@tag1 and @tag2" , order = 6)
    public void firstHook(){
        System.out.println("this first before hook");
    }

    @Before(order = 5)
    public void secondHook(){
        System.out.println("this second before hook");
    }

    @After
    public void tearDown(){
        System.out.println("this is after hook");
    }

    @Before(value = "@web", order = 1)
    public void startBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        WebDriver driver = new ChromeDriver(options);
        Auxillary.webDriver=driver;
    }
}
