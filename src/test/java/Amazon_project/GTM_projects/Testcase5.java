package Amazon_project.GTM_projects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//test searching for products using its name like shoe
//we need->home page
public class Testcase5 extends Launch_Quit
{

	@Test
	public void edit_profile() {
		
		Amazon_home_page a1 = new Amazon_home_page(driver);
		a1.accnt_and_list();
		Amazon_login_page a2 = new Amazon_login_page(driver);
		a2.email_feild();
		a2.continu_button();
		a2.right_password();
		a2.signin_button();
		a1.search_product();
	}
}
