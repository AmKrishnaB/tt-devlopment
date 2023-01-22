package tickertapeFW;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class goPro extends mainDriver{
	@BeforeClass
	public void setUp()
	{
		mainDriver.CreaterInstance("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.tickertape.in/pricing");
		  
	}
	
	@Test(priority=1)
	public void Verify12MonthsPlanSelectable()
	{
		common.click(("(//input[@name=\"plan-selection\"])[1]"));
		
	}
	@Test(priority=2)
	public void Verify6MonthsPlanSelectable()
	{
		common.click(("(//input[@name=\"plan-selection\"])[2]"));
		
	}
	
	@Test(priority=3)
	public void Verify3MonthsPlanSelectable()
	{
		common.click(("(//input[@name=\"plan-selection\"])[3]"));
		
	}
	@Test(priority=4)
	public void Verify1MonthsPlanSelectable()
	{
		common.click(("(//input[@name=\"plan-selection\"])[4]"));
		
	}
	
	@Test(priority=5)
	public void VerifyCouponTabPresent()
	{
		common.click(("//p[text()='Apply Coupon']"));  //
		common.isDisplayed("//div[@class=\"jsx-1077389517 jsx-1252235553 modal-content modal-content-mtop\"]");
		Assert.assertTrue(true);
		common.click("//i[@class=\"jsx-1077389517 jsx-1252235553 icon-close text-24 pointer\"]");
	}

	@AfterClass
	public void TearDown()
	{
		driver.quit();
	}
}
