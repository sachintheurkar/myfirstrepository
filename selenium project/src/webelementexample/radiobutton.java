package webelementexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobutton {
	
	public static void main(String[] argS) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\my github repository\\selenium project\\resorces\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/radio-button");
		/*
		 * WebElement radiobutton=driver.findElement(By.xpath(
		 * "//label[@class='custom-control-label'][@for='yesRadio']"));
		 * 
		 * if(!radiobutton.isSelected()) { radiobutton.click();
		 * System.out.println("test case pass"); }else {
		 * System.out.println("radiobutton is already selected"); }
		 */
			WebElement nobutton=driver.findElement(By.xpath("//input[@type='radio'][@class='custom-control-input disabled']"));
			System.out.println(nobutton.isEnabled());
		}
		
		
		
		
	
	}
	


