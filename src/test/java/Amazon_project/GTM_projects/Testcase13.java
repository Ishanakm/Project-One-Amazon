package Amazon_project.GTM_projects;

import org.testng.annotations.Test;

//check if user is able to apply for coupon code while ordering the product
public class Testcase13 extends Launch_Quit
{
@Test
public void coupon_code() throws InterruptedException
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
	 a4.use_this_payment_method();
	 a4.coupon_code();
	 Thread.sleep(1000);
	 a4.coupon_code_apply();
}
}
