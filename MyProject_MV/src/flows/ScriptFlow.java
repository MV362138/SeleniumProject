/**
 * 
 */
package flows;

import java.util.concurrent.BrokenBarrierException;

import org.openqa.selenium.WebDriver;

import screens.LoginPage;
import utilities.BrowserLaunch;


/**
 * @author 362138
 *
 */
public class ScriptFlow {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	
	
	public static void main(String[] args) throws InterruptedException
	{
	
//		WebDriver driver;
//		BrowserLaunch bl= new BrowserLaunch();
//		LoginPage login = new LoginPage();
//		
//		login.launchBrowser();
//		login.logOnLinkClick();
//		login.onlineIdEnter();
//		login.passwordEnter();
//		login.logOnButtonClick();
//		login.pinEnter();
//		login.pinNextButtonClick();
//		
			BrowserLaunch browser=new BrowserLaunch();
		
			browser.webBrowserInvoke("Chrome", "https://www.usaa.com/inet/ent_logon/Logon?redirectjsp=true");
			browser.buttonClick("//*[text()='Advice']", "text");
			browser.buttonClick("//*[text()='Retirement']", "text");
			browser.buttonClick("How Much Retirement Savings You Will Need", "text");
			browser.inputText("//*[@id='idf']", "Xpath", "65");
			
		/*	browser.inputText("//input[@name='j_username']", "Xpath", "maruthi.veluru");
			browser.inputText("#usaaPass", "Css", "OMsamdp@2006");
			browser.buttonClick("#login", "Css");
			browser.inputText("#pinTextField", "Css", "4571");
			browser.buttonClick("#ida > span", "Css");
	*/
	}

}
