package Amazon_project.GTM_projects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_registration_page
{
   ChromeDriver driver;
    @FindBy(xpath="//a[@id='createAccountSubmit']")
    WebElement create_account_button;
 
	public void create_account()
	{
		create_account_button.click();
	}
	
	  @FindBy(name="customerName")
	  WebElement name_txt_fld;
	  
	  public void name()
		{
		  name_txt_fld.sendKeys("ishana");
		}
	  
	  @FindBy(id="ap_phone_number")
	    WebElement mob_no_txt_fld;
	 
	public void mob_number()
		{
		mob_no_txt_fld.sendKeys("9480570045");
		}
	
	  @FindBy(name="password")
	  WebElement password_txt_fld;
	  
	  public void password()
	  {
		  password_txt_fld.sendKeys("ishana@1234");
		  
	  }
	  @FindBy(id="continue")
	  WebElement verify_button;
	  
	  public void verify_mob_no()
	  {
		  verify_button.click();
		  
	  }
	  
	  Amazon_registration_page(ChromeDriver driver)
	   {
		  this.driver=driver;
         PageFactory.initElements(driver, this);
}
}