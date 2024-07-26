package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day2 {

	@Test
	public void demo3()
	{
		System.out.println("raj");
	}
	
	@Test(groups= {"smoke"})
	public void demo4()
	{
		System.out.println("jaya");
	}
	
	@BeforeTest
	public void prereqisite()
	{
		System.out.println("execute first");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("will execute before every method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("will execute after method");
	}
	
}
