package org.centerlight.aerial.businessobject.automation;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BOAutomationForILS {
	private static final Logger logger = LogManager.getLogger(BOAutomationForILS.class);
	public BOAutomationForILS(){
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://clh.medecision.com/InfoViewApp/logon.jsp");
		logger.debug("open webpage");
		
//		WebElement iframe = driver.findElement(By.id("infoView_home"));
		driver.switchTo().frame("infoView_home");

		driver.findElement(By.id("passwordTextEdit")).clear();
		driver.findElement(By.id("passwordTextEdit")).sendKeys("clhc01");
		driver.findElement(By.id("passwordTextEdit")).submit();
		logger.debug("input password and hit enter");
		driver.switchTo().frame("headerPlusFrame");
		driver.findElement(By.id("IconImg_Txt_btnListing")).click();
		logger.debug("changed to document list");
		driver.switchTo().frame("workspaceBodyFrame");
		driver.findElement(By.name("ListingURE_searchText")).sendKeys();
		driver.findElement(By.name("ListingURE_searchText")).submit();
		logger.debug("searchText");
		
//		driver.findElement(By.className("logon_button logon_button_no_hover")).submit();

        // Now submit the form. WebDriver will find the form for us from the element
//        element.submit();

        // Check the title of the page
//        logger.debug("Page title is: " + driver.getTitle());
        
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
//        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver d) {
//                return d.getTitle().toLowerCase().startsWith("cheese!");
//            }
//        });

        // Should see: "cheese! - Google Search"
//        System.out.println("Page title is: " + driver.getTitle());
        
        //Close the browser
//        driver.quit();
//        logger.debug("close browser");
	}
}
