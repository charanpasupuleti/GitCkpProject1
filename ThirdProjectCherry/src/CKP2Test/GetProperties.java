package CKP2Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
		//ChromeDriver drive = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver");
		FirefoxDriver drivef = new FirefoxDriver();
		
		drivef.get("https://www.amazon.in"); //using get method
		drivef.navigate().to("https://www.amazon.in"); // using navigate method
		
		drivef.manage().window().fullscreen();
		
		 WebElement locator = drivef.findElement(By.id("twotabsearchtextbox"));
		 
		locator.sendKeys("cherry");
		System.out.println("values entered is : " +locator.getAttribute("value"));
		
	
	
/*		String actProp1 = drive.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).getText();
		System.out.println(actProp1);
		
		String ExpProp1 = "Customer Service";	
		String ExpProp2 = "Customer service";
		String ExpProp3 = "Customer service";
		String ExpProp4 = "Customer service";
		String ExpProp5 = "ervice";
		
		if (actProp1.equals(ExpProp1)) 
			
		{
			System.out.println("Expected and Actual properties are same");
		}
		
		else
		{
			System.out.println("Expected and Actual properties are different");
		}
	
if (actProp1.equalsIgnoreCase(ExpProp2)) 
			
		{
			System.out.println("Expected and Actual properties are same");
		}
		
		else
		{
			System.out.println("Expected and Actual properties are different");
		}
	
if (actProp1.contentEquals(ExpProp3)) 
	
{
	System.out.println("Expected and Actual properties are same");
}

else
{
	System.out.println("Expected and Actual properties are different");
}


if (actProp1.contains(ExpProp5)) 
	
{
	System.out.println("Expected and Actual properties are same");
}

else
{
	System.out.println("Expected and Actual properties are different");
}


String actProp2 = drive.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).getAttribute("innerHTML");
if (actProp2.contains(ExpProp5)) 
	
{
	System.out.println("Expected and Actual properties are same");
}

else
{
	System.out.println("Expected and Actual properties are different");
}
*/
	}
	

}


