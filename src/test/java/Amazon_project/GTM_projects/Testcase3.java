package Amazon_project.GTM_projects;

import org.testng.annotations.Test;

public class Testcase3 extends Launch_Quit
{
@Test
public void login_wrong_password()
{
	Amazon_home_page a1=new Amazon_home_page(driver);
	a1.accnt_and_list();
	Amazon_login_page a2=new Amazon_login_page(driver);
	a2.email_feild();
	a2.continu_button();
	a2.wrong_password();
	a2.signin_button();
}
}
