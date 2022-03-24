package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
public WebDriver driver;
@FindBy(id="radiobutton_1")
private WebElement fe13;
@FindBy(id="continue")
private WebElement fe14;

public Select_Hotel(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver2, this);
}
	
	public WebElement getFe13() {
		return fe13;
	}
	public WebElement getFe14() {
		return fe14;
	}
	
	
}
