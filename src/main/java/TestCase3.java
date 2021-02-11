
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase3 extends BaseTest{
	 WebDriver driver;

	@Test(groups="bvt")
	

	public void LoginValid() throws InterruptedException
	{   
		
		/*System.setProperty("webdriver.chrome.driver","E:\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dev.veri-fuel.com/qa/");*/
	
		
		driver.findElement(By.xpath(".//input[@id='Username']")).sendKeys("rashireg_buyer@kodecorp.com");
		driver.findElement(By.xpath(".//input[@id='Password']")).sendKeys("ultr@low");
       driver.findElement(By.xpath(".//button[text()='Log In']")).click();
   /*    
      String ExpectedTitle="http://dev.veri-fuel.com/qa/RFP/QuoteTerminal";
      Thread.sleep(1000);

      
      String ActualTitle=driver.getCurrentUrl();
     /* Assert.assertEquals(ActualTitle, ExpectedTitle);
      if(ExpectedTitle.equals(ActualTitle))
      {
   	   System.out.println("Login failed");
      }
      else
      {
  
      }*/
}
}
