import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","D:\\workspace\\selenium project\\resorces\\geckodriver.exe");
	     FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/search?client=firefox-b-d&q=cricbuzz");
		System.out.println(driver.getTitle());
		//driver.navigate().forward();
		driver.manage().window().maximize();
		
	}


}
