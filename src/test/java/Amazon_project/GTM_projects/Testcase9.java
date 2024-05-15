package Amazon_project.GTM_projects;


import org.testng.annotations.Test;

//verify that item can be added to the shopping cart from product pages


public class Testcase9 extends Launch_Quit
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
	a3.select_product();
	  a3.add_to_cart();	 
	 
	}

}
