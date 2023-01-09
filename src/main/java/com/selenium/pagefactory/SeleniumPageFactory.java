package com.selenium.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageFactory {

	WebDriver driver;
public	SeleniumPageFactory(){
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
		@FindBy(xpath ="//*[@name='username']")
		private WebElement user;
		
		@FindBy(xpath ="//*[@name='password']")
		private WebElement password;
		
		//private By username = By.xpath("");
		
		@FindBy(xpath ="//*[@type='submit']")
		private WebElement loginBtn;
		
		@FindBy(xpath ="//*[@class='oxd-topbar-header-breadcrumb']")
		private WebElement dashboard;
		
		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getUser() {
			return user;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}

		public WebElement getDashboard() {
			return dashboard;
		}
	
		
}















}


