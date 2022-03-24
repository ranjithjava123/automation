package org.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_To_Checkout {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Proceed to checout]")
	private WebElement fe8;
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement fe9;
	@FindBy(xpath="By.xpath(\"(//input[@type='text'])[3]\")")
	private WebElement fe10;
    @FindBy(xpath ="(//input[@type='password'])")
	private WebElement fe11;
    @FindBy(id = "SubmitLogin")
	private WebElement fe12;
    @FindBy(name = "processAddress")
	private WebElement fe13;
    @FindBy(id ="cgv")
    private WebElement fe14;
    @FindBy(name = "processCarrier")
	private WebElement fe15;
    @FindBy(xpath = "(//a[@class='bankwire'])")
	private WebElement fe16;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement fe17;
    
    public WebElement getFe8() {
		return fe8;
	}
    public WebElement getFe9() {
		return fe9;
	}
    public WebElement getFe10() {
		return fe10;
	}
    public WebElement getFe11() {
		return fe11;
	}
    public WebElement getFe12() {
		return fe12;
	}
    public WebElement getFe13() {
		return fe13;
	}
    public WebElement getFe14() {
		return fe14;
	}
    public WebElement getFe15() {
		return fe15;
    }
    public WebElement getFe16() {
		return fe16;
	}
    public WebElement getFe17() {
		return fe17;
		
    }
    
    public Proceed_To_Checkout(WebDriver driver2) {
    	this.driver = driver2;
    	PageFactory.initElements(driver2, this);
		
	}
    
	

	

}
