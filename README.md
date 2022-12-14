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