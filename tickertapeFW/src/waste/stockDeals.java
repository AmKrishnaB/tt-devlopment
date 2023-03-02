package waste;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class stockDeals extends mainDriver{
	
	@BeforeMethod
	public void setup() {
		mainDriver.CreaterInstance("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.tickertape.in/stockdeals");
		try {
			driver.findElement(By.xpath("//i[@class=\"jsx-1245644719 jsx-2319868650 icon-Close text-24 text-primary\"]")).click();
			} catch (NoSuchElementException e) {
			}
		}
	
	@Test(priority = 1)
	public void urlTest() {
		String strUrl = driver.getCurrentUrl();
		Assert.assertEquals(strUrl, "https://www.tickertape.in/stockdeals");
	}
	
	@Test(priority = 2)
	public void logoIconTest() {
		Assert.assertTrue(common.isDisplayed("//*[@src=\"/images/svg/logos/stock-deals-word-mark-orange.svg\"]"));
	}
	
//	@Test(priority = 2)
//	public void textTest() {
//		Assert.assertTrue(common.isDisplayed("//h3[text()=\"What are Stock deals?\"]"));
//	}
//
//	@Test(priority = 2)
//	public void paraTest() {
//		Assert.assertTrue(common.isDisplayed("//p[text()=\"When a large amount of a company's shares are bought or sold, they might have significant impact on the stock price. These transactions are usually done either by high net worth individuals and institutions (ex: mutual funds, banks) or promoters and top employees of the company itself. They are called Bulk / Block deals and Insider Trades respectively.\"]"));
//	}
//	
//	
//	@Test(priority = 3)
//	public void box1Test() {
//		Assert.assertTrue(common.isDisplayed("//*[@class=\"jsx-2809787372 jsx-3428714150 jsx-3801796067 relative filters filter-search shadow-onhover\"]"));
//	}
//
//	@Test(priority = 3)
//	public void box2Test() {
//		Assert.assertTrue(common.isDisplayed("//*[@class=\"jsx-2809787372 jsx-3428714150 jsx-3801796067 absolute filter-by-date-inner pointer\"]"));
//	}
//	
//	@Test(priority = 3)
//	public void box3Test() {
//		Assert.assertTrue(common.isDisplayed("//*[@class=\"jsx-2809787372 jsx-3428714150 jsx-3801796067 absolute full-width filter-person-inner\"]"));
//	}
//	
//	@Test(priority = 3)
//	public void box4Test() {
//		Assert.assertTrue(common.isDisplayed("//*[@class=\"trade-type-menu-close text-teritiary text-13 font-regular\"]"));
//	}
//	
//	@Test(priority = 3)
//	public void box5Test() {
//		Assert.assertTrue(common.isDisplayed("//*[@class=\"jsx-2809787372 jsx-3428714150 jsx-3801796067 relative filters filter-dropdown categories\"]"));
//	}
//	
//	@Test(priority = 3)
//	public void box6Test() {
//		Assert.assertTrue(common.isDisplayed("//*[@class=\"jsx-2809787372 jsx-3428714150 jsx-3801796067 absolute filter-by-idea-inner pointer\"]"));
//	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
