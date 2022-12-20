## PARALLEL EXECUTION

- It means to run our tests in parallel (i.e., at the same time)
- We would do this to run tests at a faster pace (not having to wait until the one before, finishes)
- We can achieve parallel execution by amending the TestNG.xml file
- We add some very simple configuration to our "suite" tags 

## TESTNG.XML

``` python
<suite name="Parallel_Testing" parallel="methods" thread-count="2">
```

- 'parallel' can equal:
	- Methods: This will run all the methods listed in the testng.xml file
	- Tests: This will run all the test listed in the testng.xml file
	- Classes: This will run all the classes listed in the testng.xml file
	- 'thread-count' simply indicates the maximum number of method/tests etc. to run at the same time

## PROBLEMS WITH CURRENT DESIGN

``` python
public class BasePage {
	public static WebDriver driver;
	private String url;
}
```
- As we are using 'public static WebDriver' our tests become confused when we try to run more than one test at the same time
- This is because the tests will flight for the same driver object
- We need to produce a way so that our tests "understand" to use their own driver object
- We are going to also use this opportunity to improve our overall framework design

## TRYING TO RUN PARALLEL EXECUTION WITH OUR CURRENT CODE
- Update testng to execute parallel
<img src="https://github.com/earlhansg/liveproject1/blob/T7-ParallelExecution/images/ss3.png" style=" width:100% ; height:100% "  >

- Errors
<img src="https://github.com/earlhansg/liveproject1/blob/T7-ParallelExecution/images/ss4.png" style=" width:100% ; height:100% "  >
<img src="https://github.com/earlhansg/liveproject1/blob/T7-ParallelExecution/images/ss5.png" style=" width:100% ; height:100% "  >
<img src="https://github.com/earlhansg/liveproject1/blob/T7-ParallelExecution/images/ss6.png" style=" width:100% ; height:100% "  >

## WHAT IS THREAD LOCAL?
- The Java ThreadLocal class enables you to create variables that can only be read and written by the same thread
- A thread is a unit of execution and so multiple threads can execute the same code at the same time
- So, if two threads (e.g. tests) are executing the same code, and the code has a reference to the same ThreadLocal variable, the two threads cannot see each others variables
- This can resolve the "static WebDriver" issue where resources are currently being shared (confusing our tests)

<img src="https://github.com/earlhansg/liveproject1/blob/T7-ParallelExecution/images/ss1.png" style=" width:100% ; height:100% "  >
<img src="https://github.com/earlhansg/liveproject1/blob/T7-ParallelExecution/images/ss2.png" style=" width:100% ; height:100% "  >
