package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverTest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//Webdriver is an interface provide by selenium
		//chromedriver is a class provided by selenium
		//driver is an object reference which is of type..
		//webdriver & it is pointing to an object..
		//of type of chromeDriver
		//so whatever abstrat method are in webDriver...
		//are implemented in chromeDriver

		//maximize window
		driver.manage().window().maximize();
	

		driver.get("https://nichethyself.com/tourism/home.html");

		//-Type username as stc
		//To type something in a text box using selenium ,is a two step process
		//1. Tell selenium how to get the element on which typinghas to be done.
		//2.Do the typing "stc123"


		//1.Tell selenium how to get the element on which typing has to be done
		WebElement user=driver .findElement(By.name("username"));  //way 2 ----driver.findElement(By.name("username")).sendKeys("stc123");
		user.sendKeys("stc123");



		//findElement() tells Selenium how to serch an element on the page on which action has to be taken
		//In Current Case our element is username

		WebElement pass=driver .findElement(By.name("password"));
		pass.sendKeys("12345");
		//above it is called method chaining.
		//return type of the first call decides which method you can call in the chain.
		//Above findElement returns WebElement so after findElement you can 
		//call any methods available in WebElement

user.submit();
		String expectedTitleAfterLogin="My account";
		String actualTitleAfterLogin;
		actualTitleAfterLogin=driver.getTitle();
		if(expectedTitleAfterLogin.equals(actualTitleAfterLogin))
		{
			System.out.println("Test Case Passed!!!");
		}
		else {
			System.out.println("Test Case Failed!!!");
		}

	}

}


