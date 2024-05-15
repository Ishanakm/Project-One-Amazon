package Amazon_project.GTM_projects;


import org.testng.annotations.Test;

//go to orders page and click on your last orderd product and give 5 star rating
public class Testcase14 extends Launch_Quit
{

	@Test
	public void five_star_ratings()
	{
		Amazon_home_page a1 = new Amazon_home_page(driver);
		a1.accnt_and_list();
		Amazon_login_page a2 = new Amazon_login_page(driver);
		a2.email_feild();
		a2.continu_button();
		a2.right_password();
		a2.signin_button(); 
		a1.return_and_orders();
		Amazon_orders_page a4=new Amazon_orders_page(driver);
		a4.orders_dropdown();
		a4.write_review();
		a4.rating();
	}
}
