package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners2 implements ITestListener {

	
	//This belongs to ITestListener and will execute before starting  of test set/batch
	public void onStart(ITestContext arg) {
		
		System.out.println("Starts test execution ....."+arg.getName());
		
		
		
	}
	
	
	//This belongs to ITestListener and will execute after starting  of test set/batch
	public void onFinish(ITestContext arg) {
		
		System.out.println("Finish test execution ....."+arg.getName());
		
		
		
	}
	//This belongs to ITestListener and will execute before the main test  start . @Test
	public void onTestStart(ITestResult argo) {
		
		System.out.println("Starts test ....."+argo.getName());
		
		
		
	}
	//This belongs to ITestListener and will execute when a test is skipped 
	public void onTestSkipped(ITestResult argo) {
		
		System.out.println("Skip test ....."+argo.getName());
		
		
		
	}
	
	//This belongs to ITestListener and will execute when a test is passed 
	public void onTestSuccess(ITestResult argo) {
		
		System.out.println("Passed test ....."+argo.getName());
		
		
		
	}
	//This belongs to ITestListener and will execute when a test is failed 
	public void onTestFailure(ITestResult argo) {
		
		System.out.println("Failed test ....."+argo.getName());
		
		
		
	}
	
	
	//This belongs to ITestListener and will execute when a test is failed 
	public void onTestFailedButWithinSuccessParcentage(ITestResult argo) {
		
		System.out.println("onTestFailedButWithinSuccessParcentage ....."+argo.getName());
		
		
		
	}
	
	
	}
