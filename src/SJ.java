import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Softwares\\\\WebDrivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();

		/*
		 * For Auto Suggestive Drop Downs
		 * driver.findElement(By.id("autosuggest")).sendKeys("ind"); 
		 * Thread.sleep(3000);
		 * List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		 * for(WebElement option :options) 
		 * {
		 * if(option.getText().equalsIgnoreCase("India"))
		 *  { option.click(); 
		 *  break; } 
		 *  }
		 * }
		 */
		
		
		// Dynamic Drop down list
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();				// From
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='VTZ']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='VTZ']")).click();		//To 
		
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();		//From Date as today date_There is active class
		
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));	// Attribute which is going to change which return value in console
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());		// which returns true or false >> This method not fair
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();  				// Selecting round trip radio button
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());		// which returns true or false >> This method not fair
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("its enabled");		// one method
			Assert.assertTrue(true);       // another method
						}
		else
		{
			Assert.assertTrue(false);  
		}
		
		
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int i=1;
		while (i<3)
		{
			driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
			i++;
		}
		for ( int j=1; j<2; j++)
		{
			driver.findElement(By.id("ctl00_mainContent_ddl_Child")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		}
		}


