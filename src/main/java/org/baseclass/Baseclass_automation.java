package org.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Baseclass_automation{
	
	public static WebDriver driver;

	public static WebDriver browser_configuration(String type) {
		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
	System.getProperty("user.dir") + "\\Driverr\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "value");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	
	public static void ClickOnElement(WebElement element) {
		// signinbutton.click();
		element.click();
	}

	public static void inputValueElement(WebElement element, String data) {
		// Mailid.sendkeys();
		element.sendKeys(data);
	}

	public static void close() {

		driver.close();
	}

	public static void getUrl(String url) {
		driver.get(url);
}

	//public static void clear(WebElement element) {

//		element.clear();
	//}

	public static void dropdown(String value, WebElement element, String i) {

		Select s= new Select(element);

		if (value.equalsIgnoreCase("byvalue")) {

			s.selectByValue(value);

		}

		else if (value.equalsIgnoreCase("bytext")) {

			s.selectByVisibleText(value);

		}

		else if (value.equalsIgnoreCase("byIndex")) {

			 s.selectByIndex(Integer.parseInt(i));

		}

	}

	public static void close(String type) {

		
			driver.close();

		

	}

	public static void implicitywait(int seconds, TimeUnit format) {

		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

	}
	
	
	public static void movetoelementt(WebElement element ) {
     Actions ac = new Actions(driver);
     ac.moveToElement(element).build().perform();


	}
	public static void screenshot() throws IOException {

	TakesScreenshot ts = (TakesScreenshot)driver;
	
	File scrsh = ts.getScreenshotAs(OutputType.FILE);
	
File savelocation = new File("C:\\Users\\Richard\\eclipse-workspace\\Selenium\\scrnshot");

	FileUtils.copyFile(scrsh, savelocation);
	
	}
	
}