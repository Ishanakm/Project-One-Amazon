package Amazon_project.GTM_projects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_product_page 
{
	ChromeDriver driver;
	// 1)finding the element by using @FindBy annotation
	
	@FindBy(linkText="Laptop Backpacks")
	WebElement luggage_link;
	
	@FindBy(className="s-range-input")
	WebElement price_slider;
	
	@FindBy(xpath="(//a[@target='_blank'])[2]")
	WebElement select_product;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[1]")
	WebElement price_detail;
	
	@FindBy(id="detailBullets_feature_div")
	WebElement product_description;
	
	@FindBy(xpath="(//div[@class='a-fixed-left-grid a-spacing-none'])[1]")
	WebElement customer_review;
	
	@FindBy(xpath="//span[@id='submit.add-to-cart']")
	WebElement add_to_cart_button;
	
	@FindBy(id="buy-now-button")
	WebElement buy_now_button;
	
	public void buy_now()
	{
		buy_now_button.click();
		}
	
	@FindBy(xpath="//a[@data-csa-c-content-id='sw-gtc_CONTENT']")//(//a[@class='a-button-text'])[1]")
	WebElement go_to_cart;
	
	@FindBy(xpath="(//select[@name='quantity'])[1]")
	WebElement quantity_button;
	
	@FindBy(xpath="(//span[@class='a-declarative'])[10]  ")
	WebElement delete_button;
	
	@FindBy(xpath="//select[@id='s-result-sort-select']")
	WebElement sortby_drp_dwn;
	
	
	@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
	WebElement four_star_rating;
	
	@FindBy(linkText="Half Moon")
	WebElement brand_checkbox;
//2)separate methods for each components to perform actions
    
    public void luggage_filter()
    {
    	luggage_link.click();
    }
    public void price_filter()
    {
    	price_slider.click();
    }
    public void select_product()
    {
    	select_product.click();
    	 Set<String> g1=driver.getWindowHandles();
 	    System.out.println(g1);
 	    Iterator<String>   s1=g1.iterator();
 	 String s3=   s1.next();//first time next will give the parent id
 	  String s4=  s1.next();
 	  driver.switchTo().window(s4);
    }
    public  boolean price_details()
    {
    	boolean ansr=price_detail.isDisplayed();
    	return ansr;
    }
    public boolean product_description()
    {
    	boolean ansr=product_description.isDisplayed();
    	return ansr;
    }
    public boolean customer_review()
    {
    	boolean ansr=customer_review.isDisplayed();
    	return ansr;
    }
    public void add_to_cart()
    {
    	add_to_cart_button.click();
    }
    public void go_to_cart()
    {
    	go_to_cart.click();
    }
    public void add_quantity()
    {
    	Select s1=new Select(quantity_button);
    	s1.selectByIndex(2);
    }
    public void delete_item()
    {
    	delete_button.click();
    }
    public void sort_by()
    {
    	Select s1=new Select(sortby_drp_dwn);
    	s1.selectByIndex(1);
    	//s1.selectByVisibleText("Newest Arrivals");
    }
    public void ratings()
    {
    	four_star_rating.click();
    }
    public void brand()
    {
    	boolean ansr=brand_checkbox.isSelected();
    	if(ansr==false)
    		brand_checkbox.click();
    	}
//initialize using pagefactory class
          public Amazon_product_page(ChromeDriver driver)
            {
        	  this.driver=driver;
        	  PageFactory.initElements(driver, this);
             }









}
	
	
	

