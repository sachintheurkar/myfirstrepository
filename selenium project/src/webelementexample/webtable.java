package webelementexample;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtable {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","D:\\workspace\\selenium project\\resorces\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/webtables");
		List<WebElement> coloumnname=driver.findElements(By.xpath("//div[@class='rt-tr']"));
		 System.out.println(coloumnname.size());
		Iterator<WebElement> itr=coloumnname.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getText());
			}
		
	}

}
