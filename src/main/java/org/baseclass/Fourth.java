package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fourth {
	public WebDriver driver;
	@FindBy(id="first_name")
	private WebElement fe15;
	@FindBy(id="last_name")
	private WebElement fe16;
	@FindBy(id="address")
	private WebElement fe17;
	@FindBy(xpath="(//input[contains(@onkeypress,'return OnlyNumbers')])[1]")
	private WebElement fe18;
	@FindBy(id="cc_type")
	private WebElement fe19;
	@FindBy(id="cc_exp_month")
	private WebElement fe20;
	@FindBy(id="cc_exp_year")
	private WebElement fe21;
	@FindBy(xpath="(//input[contains(@onkeypress,'return OnlyNumbers')])[2]")
	private WebElement fe22;
	@FindBy(id="book_now")
	private WebElement fe23;
	
	public Fourth (WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
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
public WebElement getFe18() {
	return fe18;
}	
public WebElement getFe19() {
	return fe19;
}	
public WebElement getFe20() {
	return fe20;
}
public WebElement getFe21() {
	return fe21;
}
public WebElement getFe22() {
	return fe22;
}
public WebElement getFe23() {
	return fe23;
}



	
}
