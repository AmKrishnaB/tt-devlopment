package tickertapeFW;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class landingPage extends mainDriver{
	
	@BeforeMethod
	public static void setup () {
		mainDriver.CreaterInstance("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.tickertape.in/");
		
		try
		{
		driver.findElement(By.xpath("//i[@class=\"jsx-1245644719 jsx-2319868650 icon-Close text-24 text-primary\"]")).click();
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Pop up not displayed");
		}
	}
	
//	@Test(priority=1)
//	public void pageTitleTest() {
//		String title= driver.getTitle();
//		String Exp_title ="Stock Analysis & Best Financial Tools for Indian Stock Market Evaluation | Tickertape";
//		Assert.assertEquals(title, Exp_title);
//	}
//	
//	@Test(priority=2)
//	public void validatePagelogoTest() {
//		common.isDisplayed("//img[@alt=\"Product logo\"]");
//	}
//	
//	@Test(priority=3)
//	public void  validateLogoArrowTest() {
//		common.isDisplayed("//i[@data-toggle=\"products\"]");
//	}
//	
//	@Test(priority = 4)
//	public void ValidateArrowClickTest() {
//		common.click("//i[@data-toggle=\"products\"]");
//	}
//	
//	@Test(priority = 5)
//	public void logoHoverTest() {
//		common.hover("//span[@data-toggle=\"products\"]");
//	}
//	
//	@Test(priority = 6)
//	public void LogoClickTest() {
//		common.click("//span[@data-toggle=\"products\"]");
//	}
//	
//	@Test(priority = 7)
//	public void backToHomeArrowTest() {
//		common.hover("//span[@data-toggle=\"products\"]");
//		common.isDisplayed("//i[@class=\"jsx-1857641964 icon-chevron-left text-20 text-white mr4\"]");
//	}
	
	@Test(priority = 8)
	public void backToHomeTextdisplayTest() throws InterruptedException {
		common.hover("//span[@data-toggle=\"products\"]");
		Thread.sleep(1000);
		common.isDisplayed("//span[text()=\"Back to home\"]");
	}
	
	@Test(priority = 9)
	public void SearchBoxDisplayTest() {
		common.isDisplayed("//input[@aria-controls=\"react-autowhatever-1\"]");
	}
	
	@Test(priority = 10)
	public void searchBoxFunctionalityTest() {
		common.sendKeys("//input[@aria-controls=\"react-autowhatever-1\"]", "TATA");
	}
//	@Test(priority = 11)
//	public void socialTabVisibilityTest() {
//		common.isDisplayed("//a[contains (@class,\"jsx-24004412 social-link navicon\")]");
//	}
//	
//	@Test(priority = 12)
//	public void socialIconVisibilityTest() {
//		common.isDisplayed("//i[@class=\"jsx-24004412 icon-Social text-16\"]");
//	}
//	
//	@Test(priority = 13)
//	public void SocialTabClickTest() throws InterruptedException {
//		common.click("//a[contains (@class,\"jsx-24004412 social-link navicon\")]");
//		Thread.sleep(8000);
//		String exp_URL= driver.getCurrentUrl();
//		String actutal_URL="https://www.tickertape.in/social";
//		Assert.assertEquals(exp_URL, actutal_URL);
//	}
//	
//	@Test(priority = 14)
//	public void socialIconClickTest() throws InterruptedException {
//		common.click("//i[@class=\"jsx-24004412 icon-Social text-16\"]");
//		Thread.sleep(8000);
//		String exp_URL= driver.getCurrentUrl();
//		String actutal_URL="https://www.tickertape.in/social";
//		Assert.assertEquals(exp_URL, actutal_URL);
//	}
//	
//	@Test(priority = 15)
//	public void logInTabDisplayTest() {
//		common.isDisplayed("//i[@class=\"jsx-24004412 icon-account text-16\"]");
//	}
//	
//	@Test(priority = 16)
//	public void loginIconVisibilityTest() {
//		common.isDisplayed("//i[@class=\"jsx-24004412 icon-account text-16\"]");
//	}
//	
//	@Test (priority = 17)
//	public void loginIconClickTest() {
//		common.click("//i[@class=\"jsx-24004412 icon-account text-16\"]");
//	}
//	
//	@Test(priority = 18)
//	public void loginIconHoverTest() {
//		common.hover("//i[@class=\"jsx-24004412 icon-account text-16\"]");
//	}
//	
//	@Test(priority = 19)
//	public void logInTabClickTest() {
//		common.click("//i[@class=\"jsx-24004412 icon-account text-16\"]");
//	}
//	
//	@Test(priority = 20)
//	public void loginTabHoverTest() {
//		common.hover("//i[@class=\"jsx-24004412 icon-account text-16\"]");
//	}
//	
//	@Test(priority = 21) 
//	public void loginArrowVisibilityTest() {
//		common.isDisplayed("//i[@class=\"jsx-24004412 icon-chevron-down text-teritiary ml4 text-16\"]");
//	}
//	
//	@Test(priority = 22)
//	public void loginArrowClickTest() {
//		common.click("//i[@class=\"jsx-24004412 icon-chevron-down text-teritiary ml4 text-16\"]");
//	}
//	
//	@Test(priority = 23)
//	public void loginArrowHoverTest() {
//		common.hover("//i[@class=\"jsx-24004412 icon-chevron-down text-teritiary ml4 text-16\"]");
//	}
//	
//	@Test(priority = 24)
//	public void loginButtonClickTest() throws InterruptedException {
//		Thread.sleep(1000);
//		common.hover("//i[@class=\"jsx-24004412 icon-chevron-down text-teritiary ml4 text-16\"]");
//		common.click("//button[contains(@class,\"jsx-2679829868 \")]");
//		Thread.sleep(2000);
//		String exp_URL=driver.getCurrentUrl();
//		String actual_URL="https://www.tickertape.in/login";
//		Assert.assertEquals(exp_URL, actual_URL);
//	}
//	
//	@Test(priority = 25)
//	public void portfolioVisibilityTest() throws InterruptedException {
//		common.hover("//i[@class=\"jsx-24004412 icon-chevron-down text-teritiary ml4 text-16\"]");
//		Thread.sleep(1000);
//		common.isDisplayed("//i[@class=\"jsx-1033646475 relative icon-portfolio text-20\"]");
//	}
//	
//	@Test(priority = 26)
//	public void portfolioclickTest() throws InterruptedException {
//		common.hover("//i[@class=\"jsx-24004412 icon-chevron-down text-teritiary ml4 text-16\"]");
//		Thread.sleep(1000);
//		common.click("//i[@class=\"jsx-1033646475 relative icon-portfolio text-20\"]");
//		Thread.sleep(8000);
//		String exp_URL=driver.getCurrentUrl();
//		String actual_URL="https://www.tickertape.in/portfolio";
//		Assert.assertEquals(exp_URL, actual_URL);
//	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}

}
