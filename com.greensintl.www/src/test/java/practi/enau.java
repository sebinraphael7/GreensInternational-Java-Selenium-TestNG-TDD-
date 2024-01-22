package practi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class enau {
	@Test
	public void email() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://react.greens-intl.ae/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[@class='item-label']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@content='Use Email Address']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("testerrllp1@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Tester123#");
		driver.findElement(By.xpath("//p[normalize-space()='Keep me signed in']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Sign in']")).click();
//		WebDriverWait wait= new WebDriverWait(driver, 10);
//		WebElement toast = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='Toastify__toast-body']")));
		 Thread.sleep(2000);
		WebElement toast = driver.findElement(By.xpath("//div[@class='Toastify__toast-body']"));
		String toastMessage=toast.getText();
		System.out.println(toastMessage);
		
//		String userNotFound = "User not found!, please login again";
//		String userNotFound = "prog ";
		String successfulLogin = "Logged in successfully!";
		
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(toastMessage.contains(successfulLogin),"Toast message does not does not contain expected text");
		sa.assertAll();  
		driver.close();
		
		
		
	
		
	}

}