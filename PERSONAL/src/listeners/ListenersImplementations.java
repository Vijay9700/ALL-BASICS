package listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import base.Base;

public class ListenersImplementations implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("TEST STARTED",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TEST PASSED",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TEST FAILED",true);
		//String methodname = result.getMethod().getMethodName();
		TakesScreenshot ts=(TakesScreenshot) Base.driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		//File perm=new File("./screenshot/"+methodname+".png");
		File perm=new File("./screenshot/ss1.png");
		try {
			FileHandler.copy(temp, perm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TEST SKIPPED",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("TEST FINISHED",true);
	}
	

}
