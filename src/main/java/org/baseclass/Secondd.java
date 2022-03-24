package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
      
public class Secondd {
	public  WebDriver driver;
@FindBy(id="location")
	private WebElement fe4;
@FindBy(id="hotels")
	private WebElement fe5;
@FindBy (id="room_type")
	private WebElement fe6;
@FindBy (id="room_nos")
	private WebElement fe7;
@FindBy (xpath="(//input[@type='text'])[2]")
	private WebElement fe8;
@FindBy (xpath=("(//input[@type='text'])[3]"))
	private WebElement fe9;
@FindBy (id="adult_room")
	private WebElement fe10;
@FindBy(id="child_room")
	private WebElement fe11;
@FindBy(id="submit")
    private WebElement fe12;

public Secondd (WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver2, this);
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






}
