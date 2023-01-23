package tickertapeFW;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mmi extends mainDriver{
	
	@BeforeMethod
	public void setup() {
		mainDriver.CreaterInstance("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.tickertape.in/market-mood-index");
		try {
			driver.findElement(By.xpath("//i[@class=\"jsx-1245644719 jsx-2319868650 icon-Close text-24 text-primary\"]")).click();
			} catch (NoSuchElementException e) {
			}
		}
	
//	@Test(priority = 1)
//	public void urlTest() {
//		String strUrl = driver.getCurrentUrl();
//		Assert.assertEquals(strUrl, "https://www.tickertape.in/market-mood-index");
//	}
//	
//	@Test(priority = 2)
//	public void mmiLogoTest() {
//		Assert.assertTrue(common.isDisplayed("//*[@src=\"/images/svg/logos/mmi-by-tt-orange.svg\"]"));
//	}
//	
//	@Test(priority = 2)
//	public void helpButtonTest() {
//		Assert.assertTrue(common.isDisplayed("//*[@data-toggle=\"productToolsMMI\"]"));
//	}
	
	@Test(priority = 2)
	public void mmiTextTest() {
		Assert.assertTrue(common.isDisplayed("//h1[text()=\"Market Mood Index\"]"));
	}
	
	@Test(priority = 3)
	public void hover1Test() {
		
		common.hover("//div[@class=\"jsx-828043746 zone-hover-root ef\"]");
		Assert.assertTrue(common.isDisplayed("//div[text()=\"High extreme fear (<20) suggests a good time to open fresh positions, as markets are likely to be oversold and might turn upwards\"]"));
	}
	
//	@Test(priority = 3)
//	public void hover2Test() {
//		
//		common.hover("//div[@class=\"jsx-828043746 zone-hover-root fear\"]");
//		Assert.assertTrue(common.isDisplayed("//div[text()=\"Fear zone suggests that investors are fearful in the market, but the action to be taken depends on the MMI trajectory. See all zones for details\"]"));
//	}
//	
//	@Test(priority = 3)
//	public void hover3Test() {
//		
//		common.hover("//div[@class=\"jsx-828043746 zone-hover-root greed\"]");
//		Assert.assertTrue(common.isDisplayed("//div[text()=\"Greed zone suggests that investors are acting greedy in the market, but the action to be taken depends on the MMI trajectory. See all zones for details\"]"));
//	}
//	
//	@Test(priority = 3)
//	public void hover5Test() {
//		
//		common.hover("//div[@class=\"jsx-828043746 zone-hover-root eg\"]");
//		Assert.assertTrue(common.isDisplayed("//div[text()=\"High extreme greed (>80) suggests investors should avoid opening fresh positions as markets are overbought and likely to turn downwards\"]"));
//	}
//	
//	@Test(priority = 4)
//	public void historyTest() {
//		Assert.assertTrue(common.isDisplayed("(//*[text()=\"Download History\"])[2]"));
//	}
//
//	@Test(priority = 5)
//	public void shareButtonTest() {
//		Assert.assertTrue(common.isDisplayed("//*[@class=\"jsx-361878376 text-16 share-icon-wrapper icon-Share pointer\"]"));
//	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
