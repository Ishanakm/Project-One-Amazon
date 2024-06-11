package Amazon_project.GTM_projects;
//verify login is successful with correct email and password



import org.testng.Assert;
import org.testng.annotations.Listeners;
//import org.testng.Assert;
import org.testng.annotations.Test;


public class Testcase2  extends Launch_Quit
{
@Test(retryAnalyzer=Amazon_project.GTM_projects.Retry_class.class)
public void signin()
{
	Amazon_home_page a1=new Amazon_home_page(driver);
	a1.accnt_and_list();
	Amazon_login_page a2=new Amazon_login_page(driver);
	a2.email_feild();
	a2.continu_button();
	a2.right_password();
	a2.signin_button();
    System.out.println(driver.getTitle());
  Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

}
}