package uk.co.automationtesting.resources;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import uk.co.automationtesting.base.BasePage;
import uk.co.automationtesting.base.ExtentManager;

public class Listeners extends BasePage implements ITestListener {

	public Listeners() throws IOException {
		super();
	}

	public synchronized void onStart(ITestContext context) {
		ExtentManager.getReport();
		ExtentManager.createTest(context.getHost(), context.getName());

	}

	public synchronized void onTestFailure(ITestResult result) {
		ExtentManager.getTest().fail(result.getThrowable());
		try {
			System.out.println("Test failed: " + result.getName());
			takeSnapShot(result.getMethod().getMethodName());
			ExtentManager.attachImage();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public synchronized void onFinish(ITestContext context) {
		ExtentManager.flushReport();
	}

}