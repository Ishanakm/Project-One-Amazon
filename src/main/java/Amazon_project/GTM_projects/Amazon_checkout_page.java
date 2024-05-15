package Amazon_project.GTM_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_checkout_page 
{
	ChromeDriver driver;
     
     @FindBy(id="addressChangeLinkId")
     WebElement change_button;
    
    public void adress_change()
    {
    	change_button.click();
    }
     
     @FindBy(xpath="(//input[@name='submissionURL'])[2]")
	  WebElement address_checkbox;
    
    public void select_address()
    {
    	boolean ansr=address_checkbox.isSelected();
    	if(ansr==false)
    	{
    		address_checkbox.click();
    	}
    }	
    	
    	 @FindBy(id="shipToThisAddressButton")
        WebElement use_this_address_button;
       
        public void use_this_address()
        {
        	use_this_address_button.click();
       	  }
        

   	 @FindBy(id="add-new-address-popover-link")
       WebElement add_new_address_button;
      
       public void add_new_address()
       {
    	   add_new_address_button.click();
      	  }
//add new address
       
       @FindBy(xpath="(//select)[2]")
       WebElement country_dropdown;
     
       public void country_region()
       {
    	   Select s1=new Select(country_dropdown);
    	   s1.selectByIndex(4);
      	  }
       
       @FindBy(id="address-ui-widgets-enterAddressFullName")
       WebElement fullname_feild;
       
       public void full_name()
       {
    	   fullname_feild.sendKeys("ishana");
      	  }
       
       
       @FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
       WebElement mob_no_feild;
       
       public void mbl_number()
       {
    	   mob_no_feild.sendKeys("6362378221");
      	  }
     
       @FindBy(id="address-ui-widgets-enterAddressPostalCode")
       WebElement pincode_feild;
       
       public void pincode()
       {
    	   pincode_feild.sendKeys("571237");
      	  }
       
       @FindBy(id="address-ui-widgets-enterAddressLine1")
       WebElement house_number_field;
     public void house_number()
       {
    	   house_number_field.sendKeys("457");
      	  }
       
       @FindBy(id="address-ui-widgets-enterAddressLine2")
       WebElement village_field;
     public void street_village()
       {
    	   village_field.sendKeys("madenadu");
      	  }
       
       @FindBy(id="address-ui-widgets-landmark")
       WebElement landmark_field;
      public void landmark()
       {
    	   landmark_field.sendKeys("near school");
      	  }
       
      
      @FindBy(id="address-ui-widgets-enterAddressCity")
      WebElement city_field;
      public void city()
       {
    	  city_field.sendKeys("madikeri");
      	  }
       
      @FindBy(xpath="(//select)[3]")
      WebElement state_dropdown;
       public void state()
      {
   	   Select s1=new Select(state_dropdown);
   	   s1.selectByVisibleText("KARNATAKA");
     	  }

       @FindBy(id="address-ui-widgets-form-submit-button")
       WebElement new_use_this_address_button;
       public void new_use_this_address()
       {
    	   new_use_this_address_button.click();
      	  }
 //payment method 
       
       @FindBy(id="payChangeButtonId")
       WebElement payment_change_button;
        public void payment_method_change()
       {
    	   payment_change_button.click();
      	  }
        
        @FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[2]")
        WebElement Creditcard_checkbox;
        public void credit_card()
       {	boolean ansr=Creditcard_checkbox.isSelected();
     	if(ansr==false)
     	{
     		Creditcard_checkbox.click();
     	}
      	  }
       @FindBy(linkText="Enter card details")
       WebElement enter_card_details;
       public void card_details()
       {
    	   enter_card_details.click();
    	   driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[1]")));
       }
       
       @FindBy(xpath="//input[@name='addCreditCardNumber']")
       WebElement card_number;
       public void card_number()
       {
    	   card_number.sendKeys("123456789098765");
       }
       
        @FindBy(xpath="//input[@name='ppw-accountHolderName']")
       WebElement nick_name;
       public void nick_name()
       {
    	   nick_name.sendKeys(Keys.CONTROL+"a");
    	   nick_name.sendKeys("ishana");
    	  
       }
        
       @FindBy(linkText="2024")
       WebElement expirey_date_dropdown;
        public void expiry_date()
       {
        	expirey_date_dropdown.click();
        	expirey_date_dropdown.sendKeys(Keys.ARROW_DOWN);
        	expirey_date_dropdown.sendKeys(Keys.ARROW_DOWN);
        	expirey_date_dropdown.sendKeys(Keys.ENTER);
      	  }
        
        @FindBy(name="ppw-widgetEvent:AddCreditCardEvent")
        WebElement  enter_card_detail;
        public void enter_card_details()
        {
        	enter_card_detail.click();
        }
       
        @FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[3]")
  	  WebElement netbanking_checkbox;
      
      public void net_banking()
      {
      	boolean ansr=netbanking_checkbox.isSelected();
      	if(ansr==false)
      	{
      		netbanking_checkbox.click();
      	}
      }
     
      @FindBy(xpath="(//select)[1]")
      WebElement Netbanking_dropdown;
       public void netbanking_option()
      {
   	   Select s1=new Select(Netbanking_dropdown);
   	   s1.selectByIndex(10);
     	  }
      
      @FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[4]")
      WebElement other_upi_checkbox;
      public void other_upi_app()
     {	boolean ansr=other_upi_checkbox.isSelected();
   	if(ansr==false)
   	{
   		other_upi_checkbox.click();
   	}
    	  }
      
    @FindBy(name="__sif_encryptedVPA_collect")
    WebElement enter_upi_id;
    public void upi_id()
    {
    	enter_upi_id.sendKeys("ishanakodambadi@okaxis");
    }
    
    @FindBy(name="ppw-widgetEvent:ValidateUpiIdEvent")
    WebElement verify_button;
    public void verify()
    {
    	verify_button.click();
    }
       
      @FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[5]")
      WebElement EMI_checkbox;
      public void EMI()
     {	boolean ansr=EMI_checkbox.isSelected();
   	if(ansr==false)
   	{
   		EMI_checkbox.click();
   	}
     }
    @FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[6]")
    WebElement COD;
    public void cash_on_delivery()
   {	boolean ansr=COD.isSelected();
 	if(ansr==false)
 	{
 		COD.click();
 	}
    	  }
      
         
         @FindBy(xpath="(//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent'])[1]")
         WebElement use_this_payment_button;
         public void use_this_payment_method()
        {
        	 use_this_payment_button.click();
       	  }
         
         @FindBy(xpath="(//input[@name='placeYourOrder1'])[3]")
         WebElement place_your_order_button;
         public void place_your_order()
        {
        	 place_your_order_button.click();
       	  }
         
        @FindBy(linkText="Review or edit your recent orders")
        WebElement order_review;
        public void ordeer_review()
        {
        	order_review.click();
        }
       
         @FindBy(id="spc-gcpromoinput")
         WebElement coupon_code;
         public void coupon_code()
         {
        	 coupon_code.sendKeys("12344");
         }
         
         @FindBy(id="gcApplyButtonId-announce")
         WebElement apply;
         public void coupon_code_apply()
         {
        	 apply.click();
         }
         
         
 public Amazon_checkout_page(ChromeDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 }
 
       
       
       
       
       
}