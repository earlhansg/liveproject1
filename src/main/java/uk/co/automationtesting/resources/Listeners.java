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
		/*
		 * context.getName() = TestNGTest-543cb7be-8441-4356-a570-cbafc09f1dd7
		 * how about use this context.getClass().getName() to get the name of the class your listening ex. "OrderCompleteTest"
		 * sothat our report html has clear info about the test we're running
		 * or move ExtentManager.createTest() method in every test created by specific class ex. ExtentManager.createTest("Order Complete Test", "decription")
		 * reference link https://www.lambdatest.com/blog/extent-reports-in-selenium/
		 */
		ExtentManager.getReport();
		ExtentManager.createTest(context.getName(), context.getName());

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
