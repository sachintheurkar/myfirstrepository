package webelementexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sachin {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.geckodriver.driver","D:\\workspace\\selenium project\\resorces\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/"); 
	WebElement login=driver.findElement(By.xpath("//input[@type='text']"));
    login.sendKeys("7741997987");
    WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
    password.sendKeys("sachinraje");
    WebElement button=driver.findElement(By.xpath("//button[@value='1']"));
    button.click();
    		

	}

}
