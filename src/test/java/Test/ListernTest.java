package Test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.Screenshot;

public class ListernTest extends BaseDriver implements ITestListener {
	
	public void onTestFailure (ITestResult result)
	{
		
		System.out.println(result+"madam fail");
		try {
			Screenshot.takesScreenshot(driver, "FailCase");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestStart(ITestResult result) {//
		System.out.println("started" + result.getName()); //getName method of ITestResult.	
	}
//	
//	public void onTestSuccess(ITestResult result) {
//		System.out.println("test is succesfull" + result.getName());
//	}
	
//	public void onTestFail(ITestResult result)  {
//		System.out.println("test is fail" + result.getName());
//		try {
//			Screenshot.takesScreenshot(driver, "kunal");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
//	public void onTestSkiped(ITestResult result) {
//		System.out.println("test is skiped" + result.getName());
//	}

}
