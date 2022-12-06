# TestNG Tutorial with MAVEN

## STEPS AHEAD

- We are going to 
	- create framework using much of what we have learnt up to this point
	- create a new Maven project
	- test various pagesfrom test store
	- make use of the Page Object Model
	- use a BaseClass to store reusable methods
	- usa a .properties file to store global variables
	- use a testng.xml file to control what tests to run

## LEARNING OBJECTIVES
- Participating in this live project will help join the dots by helping you understand how everything so far fits together
- We are building a framework which will consist of a number of different technologies
- This project will be similar to how you would test a web application in the real world
- Practice helps you retain information

## THE REQUIREMENTS
- We first need to understand:
	- What are we trying to test?
- We can do this by going through a user journey using the browser
	- This will inform us what pages and actions are required
- Once we understand this, we will then know what our test is going to do and what page object classes we need to create

## THE PLAN
- We are going to create page object classes one page at a time
- We are going asses what elements exist and what we may want to interact with
- We will then form an object class for the specific page
- We are going to create 8 objet classes for each page involved to place an order on the test store (test1)
- We will then reuse some page objects to test adding and the removal of a product from the test store basket (test2)
