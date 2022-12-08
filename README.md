# SCREENSHOTS WHEN ERROR IN ASSERTION

## WHAT WE DID ?
- Created custom Listerner under "resources" directory
- update the pom.xml file, remove the "<scope>test</scope>" under org.testng dependency tag
- updated the AddRemoveItemBasketTest under "test" directory, added @Listeners(uk.co.automationtesting.resources.Listeners.class) outside of the class scope code
- intentionally failed the program to check if its working and take the screenshots under "targer/screenshots" directory
