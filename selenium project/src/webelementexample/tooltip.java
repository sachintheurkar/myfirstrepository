package webelementexample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\selenium project\\resorces\\chromedriver.exe");
		//when you create object then automatically browser will launch
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		Actions obj=new Actions(driver);
		
		obj.clickAndHold(driver.findElement(By.xpath("//button[@id='toolTipButton']"))).perform();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.className("tooltip-inner")).getText());
		
		

	}

}
