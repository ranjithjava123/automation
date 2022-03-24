package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_Outt {
	public WebDriver driver;
	
@FindBy(id="logout")
private WebElement fe24;

public WebElement getFe24() {
	return fe24;
}
public Log_Outt (WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver2, this);
}

}
