package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public WebDriver driver;
	@FindBy(xpath="(//a[@class='login'])")
	private WebElement fe1;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement fe2;
	@FindBy(xpath="(//input[@type='password'])")
	private WebElement fe19;
	
	public WebElement getFe1() {
		return fe1;
	}
	public WebElement getFe2() {
		return fe2;
	}
	public WebElement getFe19() {
		return fe19;
	}

	public Home_page (WebDriver driver2 ) {
	        
	this.driver = driver2;
	PageFactory.initElements(driver2, this);
	
	
	
	
}
}




