package org.pageobjectmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.baseclass.Add_Tocart;
import org.baseclass.Home_page;
import org.baseclass.Last;
import org.baseclass.Proceed_To_Checkout;
import org.baseclass.Scrnshh;

public class Page_Object_Managerr {
	public WebDriver driver;
	//private classname referencename
	private Home_page hp;
	private Add_Tocart ad;
	private Proceed_To_Checkout pd;
	private Scrnshh scrr;
	private	Last lg;
	
	public Page_Object_Managerr(WebDriver driver2) {
	
	this.driver = driver2;
	PageFactory.initElements(driver2,this);
}
	public Home_page get_instance_hp() {
		 hp = new Home_page(driver);
		return hp;
		

	}
	public Add_Tocart get_instance_ad() {
         ad= new Add_Tocart(driver);
         return ad;
	}
	
	public Proceed_To_Checkout get_instance_pd(){
	pd = new Proceed_To_Checkout(driver);
	return pd;
	}
	public Scrnshh get_instance_scrr() {
		scrr = new Scrnshh(driver);
		return scrr;
	}
	
	public Last get_instance_lg() {
		lg = new Last(driver);
		return lg;
	}
	
}








