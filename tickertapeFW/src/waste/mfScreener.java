package waste;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mfScreener extends mainDriver{
	@BeforeMethod
	public void setup() {
		mainDriver.CreaterInstance("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.tickertape.in/screener/mutual-fund");
		try {
			driver.findElement(By.xpath("//i[@class=\"jsx-1245644719 jsx-2319868650 icon-Close text-24 text-primary\"]")).click();
		} catch (NoSuchElementException e) {
		}
	}
//	@Test(priority = 1)
//	public void MFUniverseTabTest() {
//		common.click("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]");
//		String acturl=driver.getCurrentUrl();
//		String expurl="https://www.tickertape.in/screener/mutual-fund";
//		Assert.assertEquals(expurl, acturl);
//    }
//	@Test(priority = 2)
//	public void LiquidfundCheckBoxUnderMFUniverseTabTest() {
//		common.click("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]"); 
//	}
//	@Test(priority = 3)
//	public void FundTrackingNiftyCheckBoxUnderMFUniverseTabTest() {
//		common.click("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[2]");
//	}
//	
//	@Test(priority = 4)
//	public void categoryMFUniverseTabTest() {
//		common.click("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[2]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[3]");
//	}
//	
//	@Test(priority = 5)
//    public void planMFUniverseTabTest() {
//		common.click("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[2]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[3]");
//		common.click("(//div[@class=\"jsx-254693987 card-title\"])[1]");
//	}
//	@Test(priority = 6)
//	public void AUMcrMFUniverseTabTest() {
//		common.click("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[2]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[3]");
//		common.click("(//div[@class=\"jsx-254693987 card-title\"])[2]");
//	}
//	
//	@Test(priority =7 )
//	public void CAGR3yMFUniverseTabTest() {
//		common.click("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[2]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[3]");
//		common.click("(//div[@class=\"jsx-254693987 card-title\"])[3]");
//	}
//	
//	@Test(priority = 8)
//	public void ExpenseRatioMFUniverseTabTest() {
//		common.click("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[2]");
//		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[3]");
//	    common.click("(//div[@class=\"jsx-254693987 card-title\"])[4]");
//	}
	
	@Test(priority = 9)
	public void AddFillterFUniverseTabTest() {
		common.click("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]");
		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]");
		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[2]");
		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[3]");
	    common.click("//span[@class=\"jsx-4191592233 typography-button-large text-btn\"]");
	}
	
	@Test(priority = 10)
	public void CustomMFUniverseTabTest() {
		common.click("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]");
		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]");
		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[2]");
		common.click("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[3]");
		common.click("//span[@class=\"jsx-214020999 jsx-177278739 typography-body-regular-m universe-tab ml16 \"]");
	}
	
	@AfterMethod
	public void close() {
			driver.quit();
	}
}


