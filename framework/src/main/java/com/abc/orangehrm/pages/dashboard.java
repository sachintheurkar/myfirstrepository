package com.abc.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dashboard {

	WebDriver driver;
	
	public dashboard(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement dashboardlabel() {
		return driver.findElement(By.xpath("//b[text()='Dashboard']"));
	}
}
