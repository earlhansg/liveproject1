## FRAMEWORK IMPROVEMENTS PART 6

### CREATED waitForElementInvisible() in BasePage
- directly access the getDriver() since it was in the same class
- we can utilize it if the class extend to the BasePage (reduces redundancy)
<img src="https://github.com/earlhansg/liveproject1/blob/T8-FrameworkImprovementsPt6/images/ss8.png" style=" width:100% ; height:100% "  >

### USED waitForElementInvisible() in AddRemoveItemBasketTest 
<img src="https://github.com/earlhansg/liveproject1/blob/T8-FrameworkImprovementsPt6/images/ss9.png" style=" width:100% ; height:100% "  >

### UPDATED testng.xml and the 2 TESTCASES can run at the same time thanks to THREADLOCAL!
<img src="https://github.com/earlhansg/liveproject1/blob/T8-FrameworkImprovementsPt6/images/ss10.png" style=" width:100% ; height:100% "  >
