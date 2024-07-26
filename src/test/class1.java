package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class class1 {
	
	@Test(groups= {"smoke"})
	public void demo()
	{
		System.out.println("hello dump");
	}
	
	@AfterTest
	public void MobileafterLoan()
	{
		System.out.println("execute last");
	}
	
	@Test
	public void demo2()
	{
		System.out.println("bye");
	}

}
