package Amazon_project.GTM_projects;


import org.testng.annotations.Test;

//validate the entire checkout process ,including address selection,payment method selection, and order review

public class Testcase11 extends Launch_Quit
{

	@Test
	public void checkout_process() throws InterruptedException
	{

	Amazon_home_page a1 = new Amazon_home_page(driver);
	a1.accnt_and_list();
	Amazon_login_page a2 = new Amazon_login_page(driver);
	a2.email_feild();
	a2.continu_button();
	a2.right_password();
	a2.signin_button(); 
	a1.search_product_iphone();
	Amazon_product_page a3=new Amazon_product_page(driver);
	a3.select_product();
	a3.buy_now();
	Amazon_checkout_page a4= new Amazon_checkout_page(driver);
	//a4.other_upi_app();
	//a4.upi_id();
	//a4.verify();
	//
	a4.adress_change();
	a4.select_address();
	a4.use_this_address();
	Thread.sleep(2000);
	a4.place_your_order();
	a4.ordeer_review();
}
}