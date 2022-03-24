
package org.pageobjectmanager;	
	
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.support.PageFactory;	
import org.baseclass.Firstt;	
import org.baseclass.Fourth;	
import org.baseclass.Log_Outt;	
import org.baseclass.Secondd;	
import org.baseclass.Select_Hotel;	
	
public class Page_Object_Manager1 {	
  public WebDriver driver;	
  	
  private Firstt f1;	
  private Secondd f2;	
  private Select_Hotel f3;	
  private Fourth f4 ;	
  private Log_Outt f5;	
  	
	
	public Page_Object_Manager1(WebDriver driver2) {
	
	this.driver = driver2;
	PageFactory.initElements(driver2,this);
}	
	
	public Firstt get_instance_f1() {
f1 = new Firstt(driver);	
return f1;	
}	
	
	public Secondd get_instance_f2() {
f2 = new Secondd(driver);	
return f2;	
	}
	
	public Select_Hotel get_instance_f3() {
f3 = new Select_Hotel(driver);	
return f3;	
	}
	
	public Fourth get_instance_f4() {
f4 = new Fourth(driver);	
return f4;	
	}
	public Log_Outt get_instance_f5() {
f5 = new Log_Outt(driver);	
    return f5;	
}	
	}
 	
    	
    	
    	
