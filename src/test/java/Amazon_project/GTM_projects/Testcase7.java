package Amazon_project.GTM_projects;

import org.junit.Assert;
import org.testng.annotations.Test;

//ensure that the product detail page displays all necessary information(price,reviews,description)
public class Testcase7 extends Launch_Quit
{
	@Test
	public void product_details()
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
	a3.luggage_filter();
	a3.select_product();
	boolean price_check=  a3.price_details();
	  Assert.assertTrue(price_check);
	boolean product_description= a3.product_description();
	  Assert.assertTrue(product_description);
	 boolean customer_review= a3.customer_review();
	  Assert.assertTrue(customer_review); 
}
}