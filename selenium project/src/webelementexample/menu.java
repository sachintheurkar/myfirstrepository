package webelementexample;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class menu {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver", "D:\\my github repository\\selenium project\\resorces\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/menu");
		Actions menu=new Actions(driver);
		
		menu.clickAndHold(driver.findElement(By.xpath("//a[text()='Main Item 2']"))).perform();
		menu.clickAndHold(driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"))).perform();
		driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"));
	     menu.click();
		
		

	}

}
