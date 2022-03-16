package webelementexample;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementoperation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\workspace\\selenium project\\resorces\\chromedriver.exe");
		//when you create object then automatically browser will launch
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		//find the address and perform the operation
		//enter the value in full name field
		//address of element is called as lacator
		//different way of finding locator===8 type
		WebElement Fullname=driver.findElement(By.xpath("//input[@id='userName']"));
		//to enter the value in element we use sand keys method from webelement
		Fullname.sendKeys("sachin theurkar");
		//to enter the value in email
		//find the element by using =findelement method
	     WebElement Email=driver.findElement(By.cssSelector("input[autocomplete='off'][type='email'"));
	     Email.sendKeys("sachintheurkar@gmail.com");
	     Fullname.clear();//IT WILL DELETE THE FULLNAME OF LINE NO 25
	     Fullname.sendKeys("Sachin Rajaram Theukar");
	     WebElement submit=driver.findElement(By.cssSelector("button[id='submit']"));
	    System.out.println(submit.getText());
	    System.out.println("height "+submit.getSize().getHeight());
	    System.out.println("width "+submit.getSize().getWidth());
	    System.out.println(Fullname.getAttribute("id"));
	    // submit.click();
	     
	     
	}

}
