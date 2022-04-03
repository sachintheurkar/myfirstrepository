package webelementexample;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tables {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\my github repository\\selenium project\\resorces\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/webtables");
		List<WebElement> table=driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']"));
         Iterator<WebElement> itr=table.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next().getText());
        	 
         }
	
	}

}
