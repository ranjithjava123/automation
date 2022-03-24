package org.runnerclass;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.archivers.sevenz.CLI;
import org.apache.commons.io.FileUtils;
import org.baseclass.Baseclass_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.pageobjectmanager.Page_Object_Managerr;
import org.baseclass.Add_Tocart;
import org.baseclass.Home_page;
import org.baseclass.Last;
import org.baseclass. Log_Outt;
import org.baseclass. Proceed_To_Checkout;
import org.baseclass .Scrnshh;

public class Runnerclass_Automation extends Baseclass_automation {

	 	public static WebDriver	driver = browser_configuration("chrome");

public static Page_Object_Managerr pom = new Page_Object_Managerr(driver);
	
	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.chrome.driver",
//	"C:\\Users\\Richard\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		implicitywait(2000,  TimeUnit.SECONDS);
		//driver.get("http://automationpractice.com/index.php");
		getUrl("http://automationpractice.com/index.php");
		
		//login
		
		//Home_page hp = new Home_page(driver);
		//WebElement fe1 = driver.findElement(By.xpath("(//a[@class='login'])"));
		//fe1.click();
		ClickOnElement(pom.get_instance_hp().getFe1());
//WebElement fe2 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		//fe2.sendKeys("autopro2@gmail.com");
		inputValueElement(pom.get_instance_hp().getFe2(),"autopro2@gmail.com");
//WebElement fe19 = driver.findElement(By.xpath("(//input[@type='password'])"));
		//fe19.sendKeys("abcc@123");
		inputValueElement(pom.get_instance_hp().getFe19(), "abcc@123");
		//add to cart
	//	Add_Tocart ad = new Add_Tocart(driver);
//WebElement fe3 = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		//fe3.click();
		ClickOnElement(pom.get_instance_ad().getFe3());
//WebElement fe4 = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		//fe4.click();
		ClickOnElement(pom.get_instance_ad().getFe4());
		//WebElement fe5 = driver.findElement(By.id("selectProductSort"));
		
		//Select s= new Select(fe5);
		//s.selectByValue("price:asc");
		dropdown("byvalue", pom.get_instance_ad().getFe5(), "price:asc");
//WebElement fe6=driver.findElement(By.xpath("(// input[@type='button'])[1]"));
		
		//fe6.click();
		ClickOnElement(pom.get_instance_ad().getFe6());
//WebElement fe7 = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		
	//	fe7.click();
		ClickOnElement(pom.get_instance_ad().getFe7());
		//checkout
		
		//Proceed_To_Checkout pd = new Proceed_To_Checkout(driver);
		
//WebElement fe8 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		//fe8.click();
		ClickOnElement(pom.get_instance_pd().getFe8());
//WebElement fe9 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		//fe9.click();
		ClickOnElement(pom.get_instance_pd().getFe9());
		//WebElement fe10 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		//fe10.sendKeys("autopro2@gmail.com");
		inputValueElement(pom.get_instance_pd().getFe10(), "autopro2@gmail.com");
		
		//WebElement fe11 = driver.findElement(By.xpath("(//input[@type='password'])"));
		//fe11.sendKeys("abcc@123");
		inputValueElement(pom.get_instance_pd().getFe11(), "abcc@123");
		
		//WebElement fe12 = driver.findElement(By.id("SubmitLogin"));
		//fe12.click();
		ClickOnElement(pom.get_instance_pd().getFe12());
		
		//WebElement fe13 = driver.findElement(By.name("processAddress"));
		//fe13.click();
		ClickOnElement(pom.get_instance_pd().getFe13());
		//WebElement fe14 = driver.findElement(By.id("cgv"));
		//fe14.click();
		ClickOnElement(pom.get_instance_pd().getFe14());
		//WebElement fe15 = driver.findElement(By.name("processCarrier"));
		//fe15.click();
		ClickOnElement(pom.get_instance_pd().getFe15());
		//WebElement fe16 = driver.findElement(By.xpath("(//a[@class='bankwire'])"));
		//fe16.click();
		ClickOnElement(pom.get_instance_pd().getFe16());
		//Actions ac = new Actions(driver);
		
		//WebElement fe17 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
	//	ac.moveToElement(fe17).build().perform();
		movetoelementt(pom.get_instance_pd().getFe17());
		
		//Take screenshot
		//Scrnshh scrr = new Scrnshh(driver);
    //  TakesScreenshot ts = (TakesScreenshot) driver;
       
    //   File sourcee = ts.getScreenshotAs(OutputType.FILE);
//File destin = new File("C:\\Users\\Richard\\eclipse-workspace\\Selenium\\scrnshot\\img.png");
		
	//	FileUtils.copyFile(sourcee, destin);
	
	screenshot();
	//logout
	//Last lg = new Last (driver);
		//WebElement fe18 = driver.findElement(By.xpath("//a[@class='logout']"));
	//	fe18.click();
		ClickOnElement(pom.get_instance_lg().getFe18());
		
		
	}

	

}
