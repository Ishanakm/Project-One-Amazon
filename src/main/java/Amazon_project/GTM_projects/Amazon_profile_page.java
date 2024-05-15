package Amazon_project.GTM_projects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_profile_page 
{
	ChromeDriver driver;
	@FindBy(xpath="(//span[@class='a-declarative'])[3]")
	WebElement edit_name;
	
	@FindBy(id="editProfileNameInputId")
	WebElement name_fld;
	
	@FindBy(linkText ="Change profile photo")
	WebElement photo_upload;

	@FindBy(xpath="//div[@class='a-column a-span4 a-span-last']")
	WebElement continue_button;
	
	@FindBy(xpath="(//div[@class='accordion-trigger-content desktop'])[1]")
	WebElement gndr_department_dropdwn;
	
	@FindBy(xpath="(//button[@class='attribute-action'])[1]")
	WebElement gndr_edit_button;
	
	@FindBy(xpath="//button[@class='text-option  '] ")
	WebElement gender_selection_button;
	

	@FindBy(xpath="(//input[@class='a-button-input'])[4]")
	WebElement gender_save_button;
	

	@FindBy(xpath="(//div[@class='accordion-trigger-content desktop'])[2]")
	WebElement height_weight_drpdwn;
	

	@FindBy(xpath="(//button[@class='attribute-action'])[3]")
	WebElement height_weight_edit_button;
	

	@FindBy(xpath="(//input[@class='number-input-box'])[1]")
	WebElement enter_height;
	
	@FindBy(xpath="(//input[@class='number-input-box'])[2]")
	WebElement enter_weight;
	
	@FindBy(linkText="Save")
	WebElement height_weight_save_button;
	
//2)separate methods for each components to perform actions	
	
	public void edit_profile_name_pen()
     { 
     	edit_name.click();
     }
	public void name_field()
	{
         name_fld.sendKeys(Keys.CONTROL+"a");
         name_fld.sendKeys(Keys.CONTROL+"del");
         name_fld.sendKeys("ishana");
	}
	public void upload_photo()
	{
		photo_upload.sendKeys("C:\\Users\\User\\Desktop.JPG");
	}
    public void continu()
    {
    	continue_button.click();
    	}
    public void gender_dropdown()
    {
    	gndr_department_dropdwn.click();	
    }
    public void gender_edit()
    {
    	gndr_edit_button.click();
    }
    public void select_gender()
    {
    	gender_selection_button.click();
    }
    public void save_gender()
    {
    	gender_save_button.click();
    }
    public void height_weightdropdown()
    {
    	height_weight_drpdwn.click();	
    }
    public void height_weight_edit()
    {
    	height_weight_edit_button.click();
    }
    public void enter_height()
    {
    	Actions a1=new Actions(driver);
    	a1.doubleClick(enter_height);
    	enter_height.sendKeys("160");
    } 
    public void enter_weight()
    {
    	Actions a1=new Actions(driver);
    	a1.doubleClick(enter_weight);
    	enter_weight.sendKeys("50");
    }
    public void height_weight_save()
    {
    	height_weight_save_button.click();
    }
    
//3)initializing the elements using pagefactory class inside the constructor
  public  Amazon_profile_page(ChromeDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  } 		    
  }






