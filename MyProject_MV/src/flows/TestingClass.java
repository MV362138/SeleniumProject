package flows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users/Maruthi Veluru/Desktop/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Launched");
		driver.get("https://www.usaa.com/inet/ent_logon/Logon");
		
		
		if(driver.findElement(By.xpath("//*[@id=\'usaa-your-life-events-tab\']/a/span")).isDisplayed())
		{
			driver.findElement(By.xpath("//*[@id=\'usaa-your-life-events-tab\']/a/span")).click();
			System.out.println("Advice link is clicked");
		}
		
		if(driver.findElement(By.xpath("//*[text()='Retirement']")).isDisplayed())
		{
			driver.findElement(By.xpath("//*[text()='Retirement']")).click();
			System.out.println("Retirement link is clicked");
		}
			
		if(driver.findElement(By.xpath("//*[@id=\'data-config-id:clabel5\']/span/div/div[1]/div/div[3]/a")).isDisplayed())
		{
			driver.findElement(By.xpath("//*[@id=\'data-config-id:clabel5\']/span/div/div[1]/div/div[3]/a")).click();
			System.out.println("Retirement Savings Calculator Calcuate link is clicked");
		}
		
		
		
//		if(driver.findElement(By.cssSelector("#id14")).isDisplayed())
//		{
			driver.findElement(By.xpath("//*[@id='yui_3_3_0_4_151806964333720']/div[6]")).click();
//			driver.findElement(By.xpath("//*[@id='yui_3_3_0_4_151806964333720']/div[6]")).click();
//			driver.findElement(By.xpath("//*[@id='yui_3_3_0_4_151806964333720']/div[6]")).sendKeys("65");
			System.out.println("What is your age? is updated with 68");
//		}

		if(driver.findElement(By.xpath("//*[@id='id19']")).isDisplayed())
		{
			driver.findElement(By.xpath("//*[@id='id19']")).click();
			driver.findElement(By.xpath("//*[@id='id19']")).sendKeys("77000");
			System.out.println("What is your yearly income? is updated with 77000");
		}
		
	}

}
