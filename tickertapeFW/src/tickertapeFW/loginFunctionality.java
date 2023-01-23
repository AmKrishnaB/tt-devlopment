package tickertapeFW;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginFunctionality extends mainDriver{
	@BeforeMethod
	public void setup() {
		mainDriver.CreaterInstance("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.tickertape.in/");
		try {
			driver.findElement(By.xpath("//i[@class=\"jsx-1245644719 jsx-2319868650 icon-Close text-24 text-primary\"]")).click();
		} catch (NoSuchElementException e) {
		}
	}
	
//	@Test(priority = 1)
//	public void urlTest() {
//		String strUrl = driver.getCurrentUrl();
//		Assert.assertEquals(strUrl, "https://www.tickertape.in/");
//	}
//	
//	@Test(priority = 2)
//	public void loginHoverTest() throws InterruptedException {
//		common.hover("//h5[@class=\"jsx-24004412 typography-body-medium-l navtext \"]");
//		Thread.sleep(1000);
//		boolean popup = common.isDisplayed("//div[@class=\"jsx-160258998 overflowmenu-root theme-dark transition-all transition-all-01\"]");
//		Assert.assertTrue(popup);
//	}
//	
//	@Test(priority = 3)
//	public void loginButtonTest() throws InterruptedException {
//		common.hover("//h5[@class=\"jsx-24004412 typography-body-medium-l navtext \"]");
//		Thread.sleep(1000);
//		common.click("//*[@class=\"jsx-2679829868 jsx-1727362249 regular secondary button-root\"]");
//		Thread.sleep(1000);
//		String strUrl = driver.getCurrentUrl();
//		Assert.assertEquals(strUrl, "https://www.tickertape.in/login");
//	}
//	
//	@Test(priority = 4)
//	public void googleSigninTest() throws InterruptedException {
//		common.hover("//h5[@class=\"jsx-24004412 typography-body-medium-l navtext \"]");
//		common.click("//*[@class=\"jsx-2679829868 jsx-1727362249 regular secondary button-root\"]");
//		boolean logo = common.isDisplayed("//*[@alt=\"Google Logo\"]");
//		Assert.assertTrue(logo);
//	}
//	
//	@Test(priority = 4)
//	public void appleSigninTest() throws InterruptedException {
//		Thread.sleep(1000);
//		common.hover("//h5[@class=\"jsx-24004412 typography-body-medium-l navtext \"]");
//		driver.findElement(By.xpath("//*[@class=\"jsx-2679829868 jsx-1727362249 regular secondary button-root\"]")).click();
//		boolean logo = common.isDisplayed("//*[@alt=\"apple\"]");
//		Assert.assertTrue(logo);
//	}
//	
//	@Test(priority = 4)
//	public void fbSigninTest() throws InterruptedException {
//		Thread.sleep(1000);
//		common.hover("//h5[@class=\"jsx-24004412 typography-body-medium-l navtext \"]");
//		common.click("//*[@class=\"jsx-2679829868 jsx-1727362249 regular secondary button-root\"]");
//		boolean logo = common.isDisplayed("//*[@alt=\"FB\"]");
//		Assert.assertTrue(logo);
//	}
//	
//	@Test(priority = 4)
//	public void emailSigninTest() throws InterruptedException {
//		Thread.sleep(1000);
//		common.hover("//h5[@class=\"jsx-24004412 typography-body-medium-l navtext \"]");
//		common.click("//*[@class=\"jsx-2679829868 jsx-1727362249 regular secondary button-root\"]");
//		boolean logo = common.isDisplayed("//*[@alt=\"Email Logo\"]");
//		Assert.assertTrue(logo);
//	}
//	
//	@Test(priority = 5)
//	public void signinTest() throws InterruptedException {
//		Thread.sleep(1000);
//		common.hover("//h5[@class=\"jsx-24004412 typography-body-medium-l navtext \"]");
//		common.click("//*[@class=\"jsx-2679829868 jsx-1727362249 regular secondary button-root\"]");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@alt=\"Email Logo\"]")).click();
//		boolean input = common.isDisplayed("//input[@type=\"email\"]");
//		Assert.assertTrue(input);
//	}
	
	@Test(priority = 6)
	public void emptyInputTest() throws InterruptedException {
		Thread.sleep(1000);
		common.hover("//h5[@class=\"jsx-24004412 typography-body-medium-l navtext \"]");
		common.click("//*[@class=\"jsx-2679829868 jsx-1727362249 regular secondary button-root\"]");
		common.click("//*[@alt=\"Email Logo\"]");
		common.click("//*[@class=\"jsx-2679829868 jsx-2491292752 large primary email-login-btn button full-width button-root\"]");
		Assert.assertTrue(common.isDisplayed("//p[text()=\" Please enter an email address to continue \"]"));
	}
	
	@Test(priority = 6)
	public void invalidInputTest() throws InterruptedException {
		Thread.sleep(1000);
		common.hover("//h5[@class=\"jsx-24004412 typography-body-medium-l navtext \"]");
		common.click("//*[@class=\"jsx-2679829868 jsx-1727362249 regular secondary button-root\"]");
		common.click("//*[@alt=\"Email Logo\"]");
		common.sendKeys("//input[@type=\"email\"]", "123ABC");
		common.click("//*[@class=\"jsx-2679829868 jsx-2491292752 large primary email-login-btn button full-width button-root\"]");
		boolean error = driver.findElement(By.xpath("//p[text()=\" Please enter a valid email in the format - ashokkumar@example.com \"]")).isDisplayed();
		Assert.assertTrue(error);
	}
	
	@Test(priority = 7)
	public void validInputTest() throws InterruptedException {
		Thread.sleep(1000);
		common.hover("//h5[@class=\"jsx-24004412 typography-body-medium-l navtext \"]");
		driver.findElement(By.xpath("//*[@class=\"jsx-2679829868 jsx-1727362249 regular secondary button-root\"]")).click();
		common.click("//*[@alt=\"Email Logo\"]");
		common.sendKeys("//input[@type=\"email\"]", "abc@xyz.com");
		common.click("//*[@class=\"jsx-2679829868 jsx-2491292752 large primary email-login-btn button full-width button-root\"]");
		Assert.assertTrue(common.isDisplayed("//h3[text()=\"Verify your email to continue\"]"));
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
