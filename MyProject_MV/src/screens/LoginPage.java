/**
 * 
 */
package screens;

import utilities.BrowserLaunch;

/**
 * @author 362138
 *
 */
public class LoginPage 
{
	BrowserLaunch browser;
	
	public void launchBrowser()
	{
		browser.webBrowserInvoke("Ie", "https://www.usaa.com/inet/ent_logon/Logon?redirectjsp=true");
	}
	public void logOnLinkClick()
	{
		browser.buttonClick("//*[@id=\'usaa-my-profile\']/span", "Xpath");
	}
	
	public void onlineIdEnter()
	{
		browser.inputText("input#usaaNum.id.j_Username", "Css", "maruthi.veluru");
	}
	
	public void passwordEnter()
	{
		browser.inputText("#usaaPass", "Css", "OMsamdp@2006");
	}
	
	public void logOnButtonClick()
	{
		browser.buttonClick("#login", "Css");
	}
		
	public void pinEnter()
	{
		browser.inputText("#pinTextField", "Css", "4571");
	}
	
	public void pinNextButtonClick()
	{
		browser.buttonClick("#ida > span", "Css");
	}
}
