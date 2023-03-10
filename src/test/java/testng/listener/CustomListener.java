package testng.listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

/**
 * "ITestListener" - Classes implement the interface org.testng.ITestListener
 * are notified in real time of when a test starts, passes, fails, skips, etc..
 * 
 * @author Jagatheshwaran N
 */
public class CustomListener implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		System.out.println("Captured the details of PASSED test case ==> " + result.getName());
		Reporter.log("Captured the details of PASSED test case ==> " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Captured the details of FAILED test case ==> " + result.getName());
		Reporter.log("Captured the details of FAILED test case ==> " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Captured the details of SKIPPED test case ==> " + result.getName());
		Reporter.log("Captured the details of SKIPPED test case ==> " + result.getName());
	}
}
