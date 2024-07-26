package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3TestCasePriority {

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	
	@AfterClass
	public void bafterclass()
	{
		System.out.println("after executing all the methods class");
	}
	
	@Test
	public void webLoginCarLoan()
	{
		System.out.println("webLoginCarLoan");
	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("beforesuite");
	}
	
	@Test
	public void MobileCarLoan()
	{
		System.out.println("MobileCarLoan");
	}
	
	@Test
	public void MobileCarLoanlogin()
	{
		System.out.println("MobileCarLoanlogin");
		Assert.assertTrue(false);
	}
	
	@Parameters({"url","apikey/username"})
	@Test
	public void MobileCarLoanlogout(String urlname,String key)
	{
		System.out.println("MobileCarLoanlogout");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test(dataProvider="getdata")
	public void MobileCarLoansingIn(String username,String password)
	{
		System.out.println("MobileCarLoansingIn");
		System.out.println(username);
		System.out.println(password);
	} 
	
	@Test
	public void MobileCarLoansignout()
	{
		int a=1,b=0;
		int c=a/b;
		System.out.println(c);
		System.out.println("MobileCarLoansignout");
	}
	
	@Test(dependsOnMethods= {"MobileCarLoansingIn","MobileCarLoansignout"})
	public void LoginAPICarLoan()
	{
		System.out.println("LoginAPICarLoan");
	}

	@DataProvider
	public Object[][] getdata()
	{
		//combination usernam-password - with good credit history
		//usernam-password- with no credit history
		//usernam-password - with bad credit history
		
		Object[][] data=new Object[3][2];
		data[0][0]="firstusername";
		data[0][1]="firsstpassword";
		
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		
		return data;
		
	}
}