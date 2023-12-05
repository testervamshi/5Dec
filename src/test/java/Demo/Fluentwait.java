package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().window().maximize();
		Wait<WebDriver> wait=new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(ElementNotInteractableException.class);

		
		
		driver.findElement(By.id("btn1")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn1']/following::input[1]")));
		driver.findElement(By.xpath("//button[@id='btn1']/following::input[1]")).sendKeys("test");

	}

}
