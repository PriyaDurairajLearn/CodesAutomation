package com.POMProject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageSample {
	
	WebDriver driver;
	
	public PageSample(WebDriver ldriver) {
		
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//span[contains(text(),'Log In')]") WebElement first_Login;
	@FindBy(xpath="//input[@placeholder='E-mail address']") WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button'][contains(text(),'Login')]") WebElement login_button;
	@FindBy(xpath="//div[contains(text(),'wrong')]") WebElement error1;
	@FindBy(xpath="//div[contains(text(),'Invalid')]") WebElement error2;
	@FindBy(xpath="//span[contains(text(),'Home')]") WebElement elem;
	
	public void loginToCRM(String user_name,String pass_word)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//first_Login.click();
		username.sendKeys(user_name);
		password.sendKeys(pass_word);
		login_button.click();
	}
	

}
