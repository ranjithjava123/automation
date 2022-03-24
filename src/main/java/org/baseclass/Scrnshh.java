package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scrnshh {
	public WebDriver driver;
	

	public  Scrnshh (WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
}
