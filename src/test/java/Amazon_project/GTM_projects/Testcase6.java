package Amazon_project.GTM_projects;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

//verify that searching with filters(eg: catagory,price range) yeilds accurate results

public class Testcase6 extends Launch_Quit
{

	@Test
	public void search_with_filter() throws IOException 
	{
	
		Amazon_home_page a1 = new Amazon_home_page(driver);
		a1.accnt_and_list();
		Amazon_login_page a2 = new Amazon_login_page(driver);
		a2.email_feild();
		a2.continu_button();
		a2.right_password();
		a2.signin_button(); 
		a1.search_product();
		Amazon_product_page a3=new Amazon_product_page(driver);
		a3.luggage_filter();
		a3.price_filter();
		TakesScreenshot tss=driver;
		File source=tss.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\User\\eclipse-workspace\\GTM_projects\\screenshot\\one."+Math.random()+"png");
		FileHandler.copy(source, destination);
	}
}

