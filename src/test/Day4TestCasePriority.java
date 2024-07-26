package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Day4TestCasePriority {

		@Parameters({"url"})
		@Test
		public void webcarHomeLoan(String uname)
		{
			System.out.println("webcarHomeLoanperonal loan");
			System.out.println(uname);
		}
		
		@BeforeClass
		public void BeforeClass()
		{
			System.out.println("beforeclass");
		}
		
		@AfterClass
		public void Afterclass()
		{
			System.out.println("after class");
		}
		
		@Test
		public void MobileHomeLoan()
		{
			System.out.println("MobileHomeLoan");
		}
		
		@Test(groups= {"smoke"})
		public void LoginAPIHomeLoan()
		{
			System.out.println("LoginAPIHomeLoan");
		}
		
		@AfterSuite
		public void afterSuite()
		{
			System.out.println("aftersuite");
		}

}
