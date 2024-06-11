package Amazon_project.GTM_projects;

import java.io.IOException;


import org.testng.annotations.Test;

//check if user is able to select each payment method
public class Testcase12 extends Launch_Quit
{

	@Test
	public void cpayment_method() throws IOException, InterruptedException
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
	a3.select_product();
	a3.buy_now();
	 Amazon_checkout_page a4=new Amazon_checkout_page(driver);
	  a4.EMI();
	  a4.other_upi_app(); 
	  a4.upi_id();
	  Thread.sleep(1000);
	  a4.cash_on_delivery();	
	  a4.net_banking();
	  a4.netbanking_option();
	  a4.credit_card();
	

}
}