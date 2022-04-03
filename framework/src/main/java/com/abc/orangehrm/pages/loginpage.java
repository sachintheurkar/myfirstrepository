package com.abc.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	
	WebDriver driver;
	
	public loginpage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getUsernametext() {
		return   driver.findElement(By.id("txtUsername"));
	}
    public WebElement getPasswordtext() {
		return driver.findElement(By.id("txtPassword"));
	}
    public WebElement getLoginBtn() {
		return 	driver.findElement(By.id("btnLogin"));
	}
    public WebElement getinvalidlabelmessage() {
    	return driver.findElement(By.cssSelector("span[id='spanMessage']"));
    }

}
