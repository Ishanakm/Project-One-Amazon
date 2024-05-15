package Amazon_project.GTM_projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_login_page 
{
	ChromeDriver driver;
	// 1)finding the element by using @FindBy annotation
		
	      @FindBy(name="email")
	      WebElement email_txt_fld;

	      @FindBy(id="continue")
	      WebElement continue_button;
	      
	      @FindBy(name="password")
	      WebElement password_txt_fld;
	      
	      @FindBy(id="signInSubmit")
	      WebElement signin_button;
	      
	//2)separate methods for each components to perform actions
	          
	           public void email_feild()
	           {
	        	   email_txt_fld.sendKeys("6362378221");
	           }
	           public void continu_button()
	           {
	        	   continue_button.click();
	           }
	           public void right_password()
	           {
	        	   password_txt_fld.sendKeys("isha@123");
	           }
	           public void wrong_password()
	           {
	        	   password_txt_fld.sendKeys("isha@");
	           }
	           public void signin_button()
	           {
	        	   signin_button.click();
	           }

//initialize using pagefactory class
	public Amazon_login_page(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}









}
