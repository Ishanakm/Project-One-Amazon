package Amazon_project.GTM_projects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_orders_page 

{
ChromeDriver driver;

@FindBy(xpath="(//select)[2]")
WebElement orders_dropdown;
public void orders_dropdown()
{
	Select s1=new Select(orders_dropdown);
	s1.selectByIndex(3);
}

@FindBy(xpath="(//a[@id='Write-a-product-review_2'])[1]")
WebElement write_reviw_button;
public void write_review()
{
	write_reviw_button.click();
}

@FindBy(xpath="(//button[@class='ryp__star__button'])[5]")
WebElement five_star_rating;
public void rating()
{
	five_star_rating.click();
}
public Amazon_orders_page (ChromeDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

}
