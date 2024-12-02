package MXPLAYER;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MxPlayer.MXplayer_capabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class mxPLAYER extends MXplayer_capabilities {
	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException {
		driver = Cap();
		Thread.sleep(5000);
	}
	@Test
	public void Test1() throws InterruptedException {
		System.out.println("Open the MX player");
		Thread.sleep(5000);
		//Click on the Deny Button
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"DENY\")")).click();
		Thread.sleep(5000);
		//Click on the Allow Access
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"ALLOW ACCESS\")")).click();
		Thread.sleep(5000);
		//Click on the Allow
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"ALLOW\")")).click();
		Thread.sleep(5000);
		//click on the View Mode
		driver.findElement(MobileBy.AccessibilityId("View Mode")).click();
		Thread.sleep(5000);
		//click on the Search Button
		driver.findElement(MobileBy.AccessibilityId("Search")).click();
		Thread.sleep(5000);
		//click on the Search Button
		driver.findElement(MobileBy.AccessibilityId("Done")).click();
		Thread.sleep(5000);
		//click on the View Menu
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		Thread.sleep(5000);
		//Click on the Fields
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Fields\")")).click();
		Thread.sleep(5000);
		//Click on the Resolution
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Resolution\")")).click();
		Thread.sleep(5000);
		//Click on the Done Button
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Done\")")).click();




		
	}

}
