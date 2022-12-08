# Running Tru TESTNG

``` python
  <?xml version="1.0" encoding="UTF-8"?>
  <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
  <suite name="Suite">
    <test thread-count="5" name="Test">
      <classes>
        <class name="uk.co.automationtesting.AddRemoveItemBasketTest"/>
      </classes>
    </test> <!-- Test -->
  
    <test thread-count="5" name="Test2">
      <classes>
        <class name="uk.co.automationtesting.OrderCompleteTest"/>
      </classes>
    </test> <!-- Test -->  
  </suite> <!-- Suite -->
```
