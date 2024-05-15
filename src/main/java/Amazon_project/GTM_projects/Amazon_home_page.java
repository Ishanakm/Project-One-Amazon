package Amazon_project.GTM_projects;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_home_page
{
	ChromeDriver driver;
// 1)finding the element by using @FindBy annotation
	
	@FindBy(id="nav-link-accountList")
	WebElement hoverovertosignin;
 
      @FindBy(id="twotabsearchtextbox")
      WebElement search_bar;
      
     

      
      @FindBy(partialLinkText="Account & Lists")
      WebElement accound_and_list_hoverover;
      
      @FindBy(xpath="//span[@class='sc-ksBlkl sc-jRwbcX fedVjG fqsXfW']")
      WebElement manage_profile_button;
      
      @FindBy(linkText="View")
      WebElement view_button;
//2)separate methods for each components to perform actions
           public void accnt_and_list()
            {
        	   hoverovertosignin.click();
            }
           public void search_product()
           {
        	   search_bar.sendKeys("bag");
        	   search_bar.sendKeys(Keys.ENTER);
        	   }
           public void accnt_and_list_hoverover(WebDriver driver )
           {
           	Actions  a1=new Actions(driver);
     	   a1.moveToElement(accound_and_list_hoverover).perform();
           	
           }
           public void manage_profile()
           {
        	   manage_profile_button.click();
           }
           public void view_profile()
           {
        	   view_button.click();
           }
      
        @FindBy(id="nav-orders")
        WebElement return_orders;
        public void return_and_orders()
        {
      	  return_orders.click();
        }
        
        @FindBy(id="twotabsearchtextbox")
        WebElement search_bar_iphone;
        public void search_product_iphone()
        {
      	  search_bar_iphone.sendKeys("lunch box");
      	  search_bar_iphone.sendKeys(Keys.ENTER);
     	   }
 //initialize using pagefactory class
public Amazon_home_page(ChromeDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}










}
