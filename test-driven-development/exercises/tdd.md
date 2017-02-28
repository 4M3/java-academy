#1.- Select all the options that are describing TDD.
A)	TDD is the approach keeping test one step ahead of your code <br/>
B)	Is also refereed like Test Driven Design. <br/>
C)	Write your initial implementation and write the initial test<br/>
D)	Write your full functional code and write the Junit.<br/>
E)	The idea of this approach is you are designing and developing your code in conjunction with your test.<br/>

#2.- What is the best option to define the next sentence?

The premise of this approach is to write a statement or a set of statement resulting in a failing test. This would result in a red bar in the unit test runner’s display. Next you implement the functionality. This should result in a green bar displayed in the test runner. Once this is complete, you decide if refactoring is needed.<br/>

A)	Red - Green-Refactor Pattern<br/>
B)	Mockito /Easy Mock/PowerMock<br/>
C)	MVC Pattern   <br/>
D)	Test Case Assertion Refactoring pattern <br/>

#3.- Mention some Framewors in Java Supporting Testing TDD

#4.-explain what is not correct in the next process using TTD?
Image 1<br/>
Image 2<br/>
  

#5.- Identify Red/Green/Refactor and explain the TDD in the next screenshots 
 

Image 3<br/>
Image 4<br/>
Image 5<br/>
Image 6<br/>
Image 7<br/>
Image 8<br/>
  
  

#6.- from the previous screenshots, finish the Junit and implementation code following the TTD methodology (enumerate and explain the steps to follow)

Generate a Random orderNumber in your test_transform_success method and validate that transform method is returning the orderNumber generated.<br/>
The target in our junit: <br/>
{<br/>
String randomOrder=generateOrderNumber();<br/>
Assert.assertEquals(randomOrder ,result.getOrderNumber());<br/>
}<br/>

#7.- Which of the following annotations marks a method to setup test data before each test method execution in the testing class?
A)@After<br/>
B)@BeforeClass<br/>
C)@Before<br/>
D)@AfterClass<br/>



#8.- Test-Driven Development is sometimes referred to as Test-Driven Design due to its focus on designing a system in a modular manner that is testable? Elaborate on answer


#9.- Which of the following is considered an anti-pattern of TDD?
A) Developing a complete user store or use case before writing any unit testing code<br/>
B) Following the red/green/refactor approach to developing code<br/>
C) Setting up a fresh test fixture for each automated test method<br/>
D) All the options.<br/>

#10) Mention some commons Myths about TDD

