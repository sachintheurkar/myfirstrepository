package webelementexample;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox {

	public static void main(String[] args) {

     System.setProperty("webdriver.geckodriver","D:\\workspace\\selenium project\\resorces\\geckodriver.exe");
     FirefoxDriver obj=new FirefoxDriver();
     obj.get("https://demoqa.com/checkbox");
     obj.manage().window().maximize();
     obj.navigate().forward();
     System.out.println(obj.getTitle());
     WebElement obj1=obj.findElement(By.xpath("//label[@for='tree-node-home']"));
    // obj1.click();
    // WebElement obj2=obj.findElement(By.xpath("//div[@id='result']"));
    // System.out.println(obj2.getText());
    WebElement home= obj.findElement(By.xpath("//button[@aria-label=\"Toggle\"]"));
     home.click();
		/*
		 * //FIND THE ADDRESS OF THE CHECKBOX IF NOT ALREADY SELECTED WebElement
		 * homecheckbox=driver.findelement(By.xpath("//label))
		 * if(!HomeCheckbox.isSelected()) { HOMECHECKBOX.CLICK(); }
		 */
    	//print the result which display after selecting the checkbox home
     //main difference between findelement and findelements is findelements not give the nosuch element exception
     // List<WebElement> result=obj.findElements(By.xpath("//div[@id='result']"));
      //if(result.size()>0) {
    	//  System.out.println(result.get(0).getText());
     // }
     	
     
    
     
	}

}
