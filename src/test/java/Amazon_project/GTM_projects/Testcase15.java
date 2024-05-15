package Amazon_project.GTM_projects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//reach till cart page without login in amazon application
public class Testcase15 extends Launch_Quit
{
@Test
public void reach_till_cart1()
{
	
      Amazon_home_page a1 = new Amazon_home_page(driver);
	  a1.search_product();
	  Amazon_product_page a2=new Amazon_product_page(driver);
	  a2.select_product();
	  a2.add_to_cart();
	  
}
}