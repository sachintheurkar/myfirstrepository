package com.abc.commonfunctionallity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//we are developing framework----------skeleton---it just  plug and play

public class browser_launch {
	
	public static WebDriver driver;
	public static Properties Property;
	
	public void browser_initilization() {
		ReadProperty();
		String browsername=Property.getProperty("browsername");
		if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "path");
		driver=new ChromeDriver();
		
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe"); 
		driver=new FirefoxDriver();
		}
		else{
		System.setProperty("webdriver.edge.driver", "path");
		driver=new EdgeDriver();
		}		
	
       driver.get(Property.getProperty("url"));
	}
	public static void ReadProperty()  {
		try {
			Property=new Properties();
			Property.load(new FileInputStream("src/main/resources/config.properties"));
	
		}catch(FileNotFoundException e){
			
		}catch(IOException t) {
			
		}
	}
	
	

}