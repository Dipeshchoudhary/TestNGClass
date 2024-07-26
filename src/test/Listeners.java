package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListeners interface which implements testNG listeners
public class Listeners implements ITestListener{
	
		public void onTestSuccess(ITestResult result)
		{
			System.out.println("successfully executes listeners passcode");
		}
		
		public void onTestFailure(ITestResult result)
		{
			System.out.println("Listners are failing plz check:=="+result.getName());
		}
}
