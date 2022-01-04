package com.luxoft.pages;

import com.luxoft.Auxillary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;

public class ResultPage extends CommonPage{
    Map<String, WebElement> elementMap=new HashMap<String, WebElement>(){
        {
            put("Search filed", Auxillary.webDriver.findElement(By.name("q")));
            put("link",Auxillary.webDriver.findElement(By.linkText("bonigarcia/webdrivermanager: Automated driver management ...")));
        }
    }

}
