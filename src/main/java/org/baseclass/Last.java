package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Last {
	public WebDriver driver;

	@FindBy(xpath = "//a[@class='logout']")
private WebElement fe18;
	
	public WebElement getFe18() {
		return fe18;
	}
	public Last (WebDriver driver2 ) {
        
this.driver = driver2;
PageFactory.initElements(driver2, this);

	}
}
