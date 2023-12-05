package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		//simple alert
		driver.findElement(By.id("alertBox")).click();
		driver.switchTo().alert();
		String msg=driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
		
		//confirmation alert
		driver.findElement(By.id("confirmBox")).click();
		String msg2=driver.switchTo().alert().getText();
		System.out.println(msg2);
		driver.switchTo().alert().dismiss();
		
		//Prompt alert
		driver.findElement(By.id("promptBox")).click();
		String msg3=driver.switchTo().alert().getText();
		System.out.println(msg3);
		driver.switchTo().alert().sendKeys("vamshi");
		driver.switchTo().alert().accept();

	}

}
