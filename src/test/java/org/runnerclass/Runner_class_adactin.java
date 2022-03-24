package org.runnerclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.baseclass.Baseclass_adactin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pageobjectmanager.Page_Object_Manager1;
import org.baseclass.Firstt;
import org.baseclass.Fourth;
import org.baseclass.Log_Outt;
import org.baseclass.Secondd;
import org.baseclass.Select_Hotel;

public class Runner_class_adactin extends Baseclass_adactin {
	
	public static WebDriver driver = browser_Configuration("chrome");	
	public static Page_Object_Manager1 p1 = new Page_Object_Manager1(driver);


	public static void main(String[] args) throws IOException {
	//	System.setProperty("webdriver.chrome.driver",
	//			"C:\\Users\\Richard\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	//	WebDriver driver = new ChromeDriver();
	
		//driver.get("http://adactinhotelapp.com/index.php");
	getUrl("http://adactinhotelapp.com/index.php");
	implicitlywait(3000, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//firstp
	Firstt f1 = new Firstt(driver);

		//WebElement fe1 = driver.findElement(By.id("username"));
		//fe1.sendKeys("sandy");
		inputValueElement(p1.get_instance_f1().getfe1(), particular_data_adactin(1, 5));
		//WebElement fe2 = driver.findElement(By.id("password"));
	//	fe2.sendKeys("SE4567GF");
		inputValueElement(p1.get_instance_f1().getfe2(),particular_data_adactin(2,5));
		
		//WebElement fe3 = driver.findElement(By.id("login"));
		//fe3.click();
		clickonelement(p1.get_instance_f1().getfe3());
		//hotelsearchpage
		
		//Secondd f2 = new Secondd(driver);
		//WebElement fe4 = driver.findElement(By.id("location"));
		//Select l = new Select(fe4);
		//l.selectByValue("New York");
		dropdown("byvalue",p1.get_instance_f2().getFe4(), "NewYork");
	
		
		//WebElement fe5 = driver.findElement(By.id("hotels"));	
		//Select h = new Select(fe5);
		//h.selectByVisibleText("Hotel Sunshine");
		dropdown("byvalue",p1.get_instance_f2().getFe5(),"Hotel Sunshine");
		//WebElement fe6 = driver.findElement(By.id("room_type"));
		//Select r = new Select(fe6);
		//r.selectByIndex(0);
		dropdown("byIndex", p1.get_instance_f2().getFe6(),"0");
		//WebElement fe7 = driver.findElement(By.id("room_nos"));
		//Select n = new Select(fe7);
		//n.selectByValue("1");
		dropdown("byvalue", p1.get_instance_f2().getFe7(),"1");
		//WebElement fe8 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		//fe8.sendKeys("03/04/2022");
		inputValueElement(p1.get_instance_f2().getFe8(), "03/04/2022");
		
	//	WebElement fe9 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		//fe9.sendKeys("05/04/2022");
inputValueElement(p1.get_instance_f2().getFe9(), "05/04/2022");
		
		//WebElement fe10 = driver.findElement(By.id("adult_room"));
	//	Select mem = new Select(fe10);
		//mem.selectByValue("1")
		dropdown("byvalue", p1.get_instance_f2().getFe10(),"1");
		//WebElement fe11 = driver.findElement(By.id("child_room"));
		//Select c = new Select(fe11);
		//c.selectByValue("0");
		dropdown("byvalue", p1.get_instance_f2().getFe11(),"0");
		//WebElement fe12 = driver.findElement(By.id("Submit"));
		//fe12.click();
		clickonelement(p1.get_instance_f2().getFe12());
		
		//hotel
	//	Select_Hotel f3= new Select_Hotel(driver);
		
		
		//WebElement fe13 = driver.findElement(By.id("radiobutton_1"));
		//fe13.click();
		clickonelement(p1.get_instance_f3().getFe13());
		
		
		//WebElement fe14 = driver.findElement(By.id("continue"));
		//fe14.click();
		clickonelement(p1.get_instance_f3().getFe14());
		
		//details
		//Fourth f4 = new Fourth(driver);
		
		
	//	WebElement fe15 = driver.findElement(By.id("first_name"));
		//fe15.sendKeys("sandy");
		inputValueElement(p1.get_instance_f4().getFe15(), "sandy");
	//	WebElement fe16 = driver.findElement(By. id("last_name"));
		//fe16.sendKeys("sand");
		inputValueElement(p1.get_instance_f4().getFe16(), "sand");
		//WebElement fe17 = driver.findElement(By.id("address"));
		//fe17.sendKeys("2/12 newyork");
		inputValueElement(p1.get_instance_f4().getFe17(), "2/12 newyork");
		//WebElement fe18 = driver.findElement(By.xpath("(//input[contains(@onkeypress,'return OnlyNumbers')])[1]"););
		
	//	fe18.sendKeys("6352465784567456");
		inputValueElement(p1.get_instance_f4().getFe18(), "6352465784567456");
		//WebElement fe19 = driver.findElement(By.id("cc_type"));
		//Select ty = new Select(fe19);
		//ty.selectByValue("AMEX");
		dropdown("byvalue",p1.get_instance_f4().getFe19(),"AMEX");
		//WebElement fe20 = driver.findElement(By.id("cc_exp_month"));
		//Select month = new Select(fe20);
		//month.selectByIndex(3);
		dropdown("byindex", p1.get_instance_f4().getFe20(),"3");
		//WebElement fe21 = driver. findElement(By.id("cc_exp_year"));
		//Select yr = new Select(fe21);
	    //yr.selectByVisibleText("2022");
	    dropdown("byvalue",p1.get_instance_f4().getFe21(),"2022" );
	    //WebElement fe22 = driver.findElement(By.xpath("(//input[contains(@onkeypress,'return OnlyNumbers')])[2]"));
		//fe22.sendKeys("3243");
		inputValueElement(p1.get_instance_f4().getFe22(), "3243");
		//WebElement fe23 = driver.findElement(By.id("book_now"));
		//fe23.click();
		clickonelement(p1.get_instance_f4().getFe23());
		
		//logout
		
		//Log_Outt f5 = new Log_Outt(driver);
		//WebElement fe24 = driver.findElement(By.id("logout"));
		//fe24.click();
		clickonelement(p1.get_instance_f5().getFe24());
		
		
		
		
}


	
}
