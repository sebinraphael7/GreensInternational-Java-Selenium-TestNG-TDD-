package practi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pRACT2 {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://react.greens-intl.ae/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[@class='item-label']")).click();
		System.out.println("seb");
		Thread.sleep(2000);
		
//		WebElement ele = driver.findElement(By.xpath("//p[@content='Use Email Address']"));
//		Actions a=new Actions(driver);
//		a.moveToElement(ele).click().perform();
//		ele.sendKeys(Keys.RETURN);
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
		driver.findElement(By.xpath("//div[@class='actionbtn']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("testerrllp1@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Tester123#");
		driver.findElement(By.xpath("//p[normalize-space()='Keep me signed in']")).click();
		String ur1 = driver.getCurrentUrl();
		System.out.println(ur1);
		driver.findElement(By.xpath("//div[normalize-space()='Sign in']")).click();
//		String ele = driver.findElement(By.xpath("//div[contains(text(),'User not found!, please login again')]")).getText();
//		System.out.println(ele);
		Thread.sleep(1000);
		String ur2 = driver.getCurrentUrl();
		System.out.println(ur2);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement toastElement=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'User not found!, please login again')]")));
		String toastmessage = toastElement.getText();
		System.out.println(toastmessage);
//		driver.close();
	}

}
