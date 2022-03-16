package webelementexample;

import org.openqa.selenium.firefox.FirefoxDriver;

public class frameexample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\workspace\\selenium project\\resorces\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("");

	}

}
