package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Tocart {
	public WebDriver driver;
	
	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
	private WebElement fe3;
	@FindBy(xpath="(//input[@type='checkbox'])[3]")
    private WebElement fe4;
	@FindBy(id="selectProductSort")
	private WebElement fe5;
	@FindBy(xpath="(// input[@type='button'])[1]")
	private WebElement fe6;
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement fe7;
	
	public WebElement getFe3() {
		return fe3;
	}
	
	public WebElement getFe4() {
		return fe4;
	}
	
	public WebElement getFe5() {
		return fe5;
	}
	
	public WebElement getFe6() {
		return fe6;
	}
	
	public WebElement getFe7() {
		return fe7;
	}
	
	public Add_Tocart (WebDriver driver2) {
        this.driver = driver2;
        PageFactory.initElements(driver2, this);
        
	}
}

