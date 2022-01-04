package com.luxoft.pages;

import org.openqa.selenium.WebElement;

public class CommonPage {

    public boolean isElementDisplayed(WebElement obj,String elementName){
        return obj.isDisplayed();
    }

}
