package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch
{
	
	WebDriver driver;
	
	public void webBrowserInvoke(String BrowserName,String url)
	{
		if(BrowserName=="FireFox")
			{
				System.setProperty("webdriver.gecko.driver", "C://Users/Maruthi Veluru/Desktop/Selenium/geckodriver.exe");
				driver=new FirefoxDriver();
				System.out.println("FireFox Browser Launched");
			}
			else if(BrowserName=="Ie")
			{
				System.setProperty("webdriver.ie.driver", "C://Users/Maruthi Veluru/Desktop/Selenium/IEDriverServer.exe");
				driver =new InternetExplorerDriver();
				System.out.println("Internet Explorer Browser Launched");
			}
			else if(BrowserName=="Chrome")
			{
				System.setProperty("webdriver.chrome.driver","C://Users/Maruthi Veluru/Desktop/Selenium/chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("Chrome Browser Launched");
			}
		driver.get(url);
	}	
		
	public void webBrowserEndSession()
	{
		driver.quit();
		System.out.println("Browser Closed Successfully");
	}
	
	public void inputText(String Object, String ObjectType, String InputValue) 
	{
		if(ObjectType=="ID")
			{
				if(driver.findElement(By.id(Object)).isDisplayed())
					{
						
						System.out.println("provided Object"+ObjectType+ "is present in the Page");
						driver.findElement(By.id(Object)).sendKeys(InputValue);
						System.out.println("Input Value"+InputValue+"is successfully entered in the input field");
					} 
				else 
					System.out.println("provided Object"+ObjectType+ "is not present in the Page");
			}
			else if (ObjectType=="ClassName")
			{
				if(driver.findElement(By.className(Object)).isDisplayed())
					{
						
						System.out.println("provided Object"+ObjectType+ "is present in the Page");
						driver.findElement(By.className(Object)).sendKeys(InputValue);
						System.out.println("Input Value"+InputValue+"is successfully entered in the input field");
					} 
				else 
					System.out.println("provided Object"+ObjectType+ "is not present in the Page");
			}
			else if (ObjectType=="Name")
			{
				if(driver.findElement(By.name(Object)).isDisplayed())
					{
						System.out.println("provided Object"+ObjectType+ "is present in the Page");
						driver.findElement(By.name(Object)).sendKeys(InputValue);
						System.out.println("Input Value"+InputValue+"is successfully entered in the input field");
					} 
				else 
					System.out.println("provided Object"+ObjectType+ "is not present in the Page");
			}
			else if (ObjectType=="LinkText")
			{
				if(driver.findElement(By.linkText(Object)).isDisplayed())
					{
						System.out.println("provided Object"+ObjectType+ "is present in the Page");
						driver.findElement(By.linkText(Object)).sendKeys(InputValue);
						System.out.println("Input Value"+InputValue+"is successfully entered in the input field");
					} 
				else 
					System.out.println("provided Object"+ObjectType+ "is not present in the Page");
			}
			else if (ObjectType=="Xpath")
			{
				if(driver.findElement(By.xpath(Object)).isDisplayed())
					{
						System.out.println("provided Object"+ObjectType+ "is present in the Page");
						driver.findElement(By.xpath(Object)).sendKeys(InputValue);
						System.out.println("Input Value"+InputValue+"is successfully entered in the input field");
					} 
				else 
					System.out.println("provided Object"+ObjectType+ "is not present in the Page");
			}
			else if (ObjectType=="Css")
			{
				if(driver.findElement(By.cssSelector(Object)).isDisplayed())
					{
						System.out.println("provided Object"+ObjectType+ "is present in the Page");
						driver.findElement(By.cssSelector(Object)).sendKeys(InputValue);
						System.out.println("Input Value"+InputValue+"is successfully entered in the input field");
					} 
				else if(ObjectType=="text")
				{
					if(driver.findElement(By.linkText(Object)).isDisplayed())
						{
							System.out.println("provided Object"+ObjectType+ "is present in the Page");
							driver.findElement(By.linkText(Object)).sendKeys(InputValue);
							System.out.println("provided button/Link is clicked");
						} 
					}
				else 
					System.out.println("provided Object"+ObjectType+ "is not present in the Page");
			}
		
	}

	public void buttonClick(String Object, String ObjectType) 
	{
		if(ObjectType=="ID")
			{
				if(driver.findElement(By.id(Object)).isDisplayed())
					{
						System.out.println("provided Object"+ObjectType+ "is present in the Page");
						driver.findElement(By.id(Object)).click();
						System.out.println("provided button/Link is clicked");
					} 
				else 
					System.out.println("provided Object''"+ObjectType+ "'' is not present in the Page");
			}
			else if (ObjectType=="ClassName")
			{
				if(driver.findElement(By.className(Object)).isDisplayed())
					{
						System.out.println("provided Object"+ObjectType+ "is present in the Page");
						driver.findElement(By.className(Object)).click();
						System.out.println("provided button/Link is clicked");
					} 
				else 
					System.out.println("provided Object"+ObjectType+ "is not present in the Page");
			}
			else if (ObjectType=="Name")
			{
				if(driver.findElement(By.name(Object)).isDisplayed())
					{
						System.out.println("provided Object"+ObjectType+ "is present in the Page");
						driver.findElement(By.name(Object)).click();
						System.out.println("provided button/Link is clicked");
					} 
				else 
					System.out.println("provided Object"+ObjectType+ "is not present in the Page");
			}
			else if (ObjectType=="LinkText")
			{
				if(driver.findElement(By.linkText(Object)).isDisplayed())
					{
						System.out.println("provided Object"+ObjectType+ "is present in the Page");
						driver.findElement(By.linkText(Object)).click();
						System.out.println("provided button/Link is clicked");
					} 
				else 
					System.out.println("provided Object"+ObjectType+ "is not present in the Page");
			}
			else if (ObjectType=="Xpath")
			{
				if(driver.findElement(By.xpath(Object)).isDisplayed())
					{
						System.out.println("provided Object"+ObjectType+ "is present in the Page");
						driver.findElement(By.xpath(Object)).click();
						System.out.println("provided button/Link is clicked");
					} 
				else 
					System.out.println("provided Object"+ObjectType+ "is not present in the Page");
			}
			else if (ObjectType=="Css")
			{
				if(driver.findElement(By.cssSelector(Object)).isDisplayed())
					{
						System.out.println("provided Object"+ObjectType+ "is present in the Page");
						driver.findElement(By.cssSelector(Object)).click();
						System.out.println("provided button/Link is clicked");
					} 
			else if(ObjectType=="text")
			{
				if(driver.findElement(By.linkText(Object)).isDisplayed())
					{
						System.out.println("provided Object"+ObjectType+ "is present in the Page");
						driver.findElement(By.linkText(Object)).click();
						System.out.println("provided button/Link is clicked");
					} 
				}
				else
					System.out.println("provided Object"+ObjectType+ "is not present in the Page");
			}
		
	}
	
	
}
