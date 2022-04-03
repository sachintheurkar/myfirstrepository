package com.abc.orangehrmtest;

import org.openqa.selenium.By;

import com.abc.commonfunctionallity.browser_launch;
import com.abc.orangehrm.pages.dashboard;
import com.abc.orangehrm.pages.loginpage;

public class loginpagetest extends browser_launch  {

	public static void main(String[] args) throws InterruptedException {

		browser_launch browser=new browser_launch();
		browser.browser_initilization();
		
		loginpage loginpage=new loginpage(driver);
		
		loginpagetest logintest=new loginpagetest();
		logintest.login_insuccessfully("Admn","admn123");
		logintest.login_successfully("Admin","admin123");
		
		
	}
	public void login_successfully(String username,String password) throws InterruptedException {
  
   loginpage loginpage=new loginpage(driver);
   loginpage.getUsernametext().sendKeys("Admin");
   loginpage.getPasswordtext().sendKeys("admin123");
   loginpage.getLoginBtn().click();
   Thread.sleep(1000);
   dashboard dashboard=new dashboard(driver);
   
   	if(dashboard.dashboardlabel().isDisplayed()) {
		System.out.println("user is able to login successfully");
	}else {
		System.out.println("user is not login successfully");
	}

		
	}
	public void login_insuccessfully(String username,String password) throws InterruptedException {
		  loginpage loginpage=new loginpage(driver);
		   loginpage.getUsernametext().sendKeys("Admn");
		   loginpage.getPasswordtext().sendKeys("admn123");
		   loginpage.getLoginBtn().click();
		   Thread.sleep(1000);
		 
	if(loginpage.getinvalidlabelmessage().isDisplayed()) {
		System.out.println("user is not enter with invalid credential");
	}else {
		System.out.println("user is enter with valid credential");
	}

		
	}

}
