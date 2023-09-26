package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MyFirstTestNGTest {

	WebDriver driver;
  @Test
  public void loginTonicheTyselfclass() {
	  System.out.println("I am inside login to Niche Thyself class");
	  
	  driver.get("https://nichethyself.com/tourism/home.html");
	  WebElement user=driver .findElement(By.name("username")); 
		user.sendKeys("stc123");
		
		WebElement pass=driver .findElement(By.name("password"));
		pass.sendKeys("12345");
		
		user.submit();
		String expectedTitleAfterLogin="My account";
		String actualTitleAfterLogin;
		actualTitleAfterLogin=driver.getTitle();
		/*if(expectedTitleAfterLogin.equals(actualTitleAfterLogin))
		{
			System.out.println("Test Case Passed!!!");
		}
		else {
			System.out.println("Test Case Failed!!!");
		}*/
		
		assertEquals(actualTitleAfterLogin,expectedTitleAfterLogin);

	}

  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  //System.out.println("I am inside before method");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	 // System.out.println("I am inside after method");
	  driver.quit();
  }
  

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am inside before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am inside after class");
  }

}
