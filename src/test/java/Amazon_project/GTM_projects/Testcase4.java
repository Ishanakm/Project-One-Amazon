package Amazon_project.GTM_projects;

import org.testng.annotations.Test;

//check if user can successfully edit their profile information
public class Testcase4 extends Launch_Quit
{
//WebDriver driver;
	@Test
	public void edit_profile()
	{
	Amazon_home_page a1=new Amazon_home_page(driver);
	a1.accnt_and_list();
	Amazon_login_page a2=new Amazon_login_page(driver);
	a2.email_feild();
	a2.continu_button();
	a2.right_password();
	a2.signin_button();
   a1.accnt_and_list_hoverover(driver);
   a1.manage_profile();
   a1.view_profile();
   Amazon_profile_page a3=new Amazon_profile_page(driver);
  

   a3.gender_dropdown();
   a3.gender_edit();
   a3.select_gender();
   a3.save_gender(); 
  
  
	}
}