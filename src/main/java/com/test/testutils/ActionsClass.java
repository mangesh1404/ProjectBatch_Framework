package com.test.testutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
   
	public void rightClickOnElement(WebElement element, WebDriver driver) {
		Actions action = new Actions(driver);
		action.contextClick(element);	
	    }
    
    
    public void movetoElement(WebElement element, WebDriver driver) {
	Actions action = new Actions(driver);
	action.moveToElement(element);	
    }
}
