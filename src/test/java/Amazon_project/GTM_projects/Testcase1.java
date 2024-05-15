package Amazon_project.GTM_projects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//Test if a new user can successfully register
public class Testcase1 extends Launch_Quit
{
@Test
public void registration_amazon()
{
	
	Amazon_home_page a1=new Amazon_home_page(driver);
	a1.accnt_and_list();
	Amazon_registration_page a2=new Amazon_registration_page(driver);
	a2.create_account();
	a2.name();
	a2.mob_number();
	a2.password();
	a2.verify_mob_no();
	Assert.assertEquals(driver.getTitle(), "Authentication required");
}
}
