package Amazon_project.GTM_projects;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//check if products can be sorted by relevance, price , ratings, etc

public class Testcase8 extends Launch_Quit
{

	@Test
	public void sort_the_product() 
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
        a3.sort_by();	
        a3.ratings();
   
}

}