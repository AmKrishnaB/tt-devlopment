package tickertapeFW;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class portfolio extends mainDriver{
	@BeforeClass
	public void setUp()
	{
		mainDriver.CreaterInstance("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.tickertape.in/portfolio");
		   try 
			{
				driver.findElement(By.xpath("//div[@class=\"jsx-1505615841 close-header pointer sticky-close\"]")).click();
			}
			catch(NoSuchElementException e)
			{
				System.out.println("Pop up disabled");
			}
	}
	
	@Test
	public void VerifyHomePage()
	{
		String title =driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Trade your favourite stocks | Basket by Tickertape");	
	}
	
	
	
	@Test
	public void VerifySocialButton()
	{
		WebElement button=driver.findElement(By.xpath("//h5[text()='Social']"));
		String Element_Name=button.getText();
		System.out.println(Element_Name);
		Assert.assertEquals(Element_Name, "Social");
	}
	
	
	
	@Test
	public void VerifyTickerTapeDropDownDisplay() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@id=\"tt-vertical\"]")).click();
		
	}
	
	@Test
	public void VerifyYourBasketTextPresent()
	{
		WebElement text=driver.findElement(By.xpath("//h2[text()='Your basket']"));
		String basketText=text.getText();
		System.out.println("basketText");
		Assert.assertEquals(basketText, "Your basket");
	}
	
	@Test
	public void VerifySearchStocksButtonPresent()
	{
		WebElement SearchStocks=driver.findElement(By.xpath("//button[@class=\"jsx-2679829868 jsx-2491292752 regular primary button-root\"]"));
		String Text=SearchStocks.getText();
		Assert.assertEquals(Text,"Search stocks");
	}
	
	@Test
	public void VerifySearchButtonAccessible() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class=\"jsx-2679829868 jsx-2491292752 regular secondary portfolio-btn button-root\"]")).click();
		
	}
	
	
	@Test
	public void VerifyBaslketButtonPresent()
	{
		WebElement SearchStocks=driver.findElement(By.xpath("//a[text()='Basket']"));
		String Text=SearchStocks.getText();
		Assert.assertEquals(Text,"Basket");
	}
	
	@Test
	public void VerifyBaslketButtonAccessble()
	{
		common.click("//a[@class=\\\"breadcrumb\\\"]");
	}
	
	@Test
	public void tickerTapelogoPresentBottom()
	{
		WebElement BottomLogo=driver.findElement(By.xpath("//img[@class=\"jsx-3148341370 tt-logo\"]"));
		String Text=BottomLogo.getText();
		System.out.println(Text);
	}
	
	@Test
	public void VerifySearchTextBox()
	{
		driver.findElement(By.xpath("type=\"search\"")).sendKeys("Apollo");
	}
	
	@Test
	public void VerifyStockScreenerlinkPresent()
	{
		WebElement stockScreener=driver.findElement(By.xpath("//a[@href='/screener/equity']"));
		String name=stockScreener.getText();
		Assert.assertEquals(name,"Stock Screener");
	}
	
	@Test
	public void VerifyStockScreenerlinkAccessable()
	{
		driver.findElement(By.xpath("//a[@href='/screener/equity']")).click();
	}
	
	@Test
	public void VerifyMFScreenerlinkPresent()
	{
		WebElement stockScreener=driver.findElement(By.xpath("//a[@href='/screener/mutual-fund']"));
		String name=stockScreener.getText();
		Assert.assertEquals(name,"MF Screener");
	}
	
	@Test
	public void VerifyMFScreenerlinkAccessable()
	{
		driver.findElement(By.xpath("//a[@href='/screener/mutual-fund']")).click();
	}
	
	@Test
	public void VerifyMutualFundslinkPresent()
	{
		WebElement stockScreener=driver.findElement(By.xpath("//a[@href='/mutualfunds/equity']"));
		String name=stockScreener.getText();
		Assert.assertEquals(name,"Mutual Funds");
	}
	
	@Test
	public void VerifyMutualFundslinkAccessable()
	{
		driver.findElement(By.xpath("//a[@href='/mutualfunds/equity']")).click();
	}
	
	@Test
	public void VerifyMMIlinkPresent()
	{
		WebElement stockScreener=driver.findElement(By.xpath("//a[@href='/market-mood-index']"));
		String name=stockScreener.getText();
		Assert.assertEquals(name,"MMI");
	}
	
	@Test
	public void VerifyMMIlinkPresentAccessable()
	{
		driver.findElement(By.xpath("//a[@href='/market-mood-index']")).click();
	}
	
	@Test
	public void VerifystockdealslinkPresent()
	{
		WebElement stockScreener=driver.findElement(By.xpath("//a[@href='/stockdeals']"));
		String name=stockScreener.getText();
		Assert.assertEquals(name,"Stock Deals");
	}
	
	@Test
	public void VerifystockdealslinkAccessable()
	{
		driver.findElement(By.xpath("//a[@href='/stockdeals']")).click();
	}
	
	@Test
	public void VerifySociallinkPresent()
	{
		WebElement stockScreener=driver.findElement(By.xpath("(//a[@href='/social'])[2]"));
		String name=stockScreener.getText();
		Assert.assertEquals(name,"Social");
	}
	
	@Test
	public void VerifySociallinkPresentAccessable()
	{
		driver.findElement(By.xpath("(//a[@href='/social'])[2]")).click();
	}
	
	@Test
	public void VerifyLearnlinkPresent()
	{
		WebElement stockScreener=driver.findElement(By.xpath("//a[@href='http://www.tickertape.in/learn/']"));
		String name=stockScreener.getText();
		Assert.assertEquals(name,"Learn");
	}
	
	@Test
	public void VerifyLearnlinkAccessable()
	{
		driver.findElement(By.xpath("//a[@href='http://www.tickertape.in/learn/']")).click();
	}
	

	@Test
	public void VerifyBloglinkPresent()
	{
		WebElement stockScreener=driver.findElement(By.xpath("//a[@href='https://www.tickertape.in/blog/']")); 
		String name=stockScreener.getText();
		Assert.assertEquals(name,"Blog");
	}
	
	@Test
	public void VerifyBloglinkPresentAccessable()
	{
		driver.findElement(By.xpath("//a[@href='https://www.tickertape.in/blog/']")).click(); 
	}
	
	@Test
	public void VerifPricinglinkPresent()
	{
		WebElement stockScreener=driver.findElement(By.xpath("//a[@href='/pricing']"));
		String name=stockScreener.getText();
		Assert.assertEquals(name,"Pricing");
	}
	
	@Test
	public void VerifPricinglinkPresentAccessable()
	{
		driver.findElement(By.xpath("//a[@href='/pricing']")).click(); 
	}
	
	@Test
	public void VerifCancellationlinkPresent()
	{
		WebElement stockScreener=driver.findElement(By.xpath("//a[@href='/meta/cancellation']"));
		String name=stockScreener.getText();
		Assert.assertEquals(name,"Cancellation Policy");
	}
	
	@Test
	public void VerifCancellationlinkPresentAccessable()
	{
		driver.findElement(By.xpath("//a[@href='/meta/cancellation']")).click(); 
	}
	
	@Test
	public void VerifTermslinkPresent()
	{
		WebElement stockScreener=driver.findElement(By.xpath("//a[@href='/meta/terms']"));
		String name=stockScreener.getText();
		Assert.assertEquals(name,"Terms");
	}

	@Test
	public void VerifTermslinkPresentAccessable()
	{
		driver.findElement(By.xpath("//a[@href='/meta/terms']")).click(); 
	}
	
	@Test
	public void VerifPrivacylinkPresent()
	{
		WebElement stockScreener=driver.findElement(By.xpath("//a[@href='/meta/privacy']"));
		String name=stockScreener.getText();
		Assert.assertEquals(name,"Privacy");
	}
	
	@Test
	public void VerifPrivacylinkPresentAccessable()
	{
		driver.findElement(By.xpath("//a[@href='/meta/privacy']")).click(); 
	}
	
	@Test
	public void VerifDisclaimerlinkPresent()
	{
		WebElement stockScreener=driver.findElement(By.xpath("//a[@href='/meta/disclaimer']"));
		String name=stockScreener.getText();
		Assert.assertEquals(name,"Disclaimer");
	}
	
	@Test
	public void VerifDisclaimerlinkPresentAccessable()
	{
		driver.findElement(By.xpath("//a[@href='/meta/disclaimer']")).click(); 
	}
	
	@Test
	public void VerifAboutUslinkPresent()
	{
		WebElement stockScreener=driver.findElement(By.xpath("//a[@href='/meta/about']"));
		String name=stockScreener.getText();
		Assert.assertEquals(name,"About Us");
	}
	
	@Test
	public void VerifAboutUslinkPresentAccessable()
	{
		driver.findElement(By.xpath("//a[@href='/meta/about']")).click(); 
	}
	
	@Test
	public void VerifSupportlinkPresent()
	{
		WebElement stockScreener=driver.findElement(By.xpath("//a[@href='http://help.tickertape.in/']"));
		String name=stockScreener.getText();
		Assert.assertEquals(name,"Support");
	}
	
	@Test
	public void VerifSupportlinkPresenAccessable()
	{
		driver.findElement(By.xpath("//a[@href='http://help.tickertape.in/']")).click(); 
	}
	
	@Test
	public void VerifContactUSlinkPresent()
	{
		WebElement stockScreener=driver.findElement(By.xpath("//a[@href='/meta/about#contact']"));
		String name=stockScreener.getText();
		Assert.assertEquals(name,"Contact Us");
	}
	
	@Test
	public void VerifContactUSlinkPresentAccessable()
	{
		driver.findElement(By.xpath("//a[@href='/meta/about#contact']")).click(); 
	}
	
	@Test
	public void VerifCareerlinkPresent()
	{
		WebElement stockScreener=driver.findElement(By.xpath("//a[@href='https://tickertape.freshteam.com/jobs']")); 
		String name=stockScreener.getText();
		Assert.assertEquals(name,"Career");
	}
	
	@Test
	public void VerifCareerlinkPresentAccessable()
	{
		driver.findElement(By.xpath("//a[@href='https://tickertape.freshteam.com/jobs']")).click(); 
	}
	
	@Test
	public void VerifYouTubeLinkAccessable()
	{
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/channel/UCbnsKJ2aIL0BG6tar_f9Dlw']")).click(); 
	}
	
	@Test
	public void VerifTwitterLinkAccessable()
	{
		driver.findElement(By.xpath("//a[@href='https://twitter.com/tickertapeIN']")).click(); 
	}
	
	@Test
	public void VerifLinkedInLinkAccessable()
	{
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/tickertapein/']")).click(); 
	}
	
	@Test
	public void VerifInstaGramkAccessable()
	{
		 common.click("//a[@href='https://www.instagram.com/tickertapein/']");
	}
	
	
	@AfterClass
	public void TearDown()
	{
		driver.quit();
	}
}
