package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Firstt {
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement fe1;
	@FindBy(id="password")
	private WebElement fe2;
	@FindBy(id="login")
	private WebElement fe3;
	
	

	public WebElement getfe1() {
		return fe1;

	}
	
	public WebElement getfe2() {
		return fe2;

	}
	
	public WebElement getfe3() {
		return fe3;

	}
  public Firstt (WebDriver driver2) {
	
	this.driver = driver2;
	PageFactory.initElements(driver2, this);
	
  }
	
	

}
