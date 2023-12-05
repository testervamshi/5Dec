package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		/*
		//single selection dropdown
		Select drpdwn=new Select(driver.findElement(By.id("course")));
		//drpdwn.selectByVisibleText("Java");
		//drpdwn.selectByIndex(3);
		drpdwn.selectByValue("net");
		
		//multi selection dropdown
		
		Select mltdwn=new Select(driver.findElement(By.xpath("//select[@id='ide']")));
		if(mltdwn.isMultiple()) {
			mltdwn.selectByIndex(0);
			mltdwn.selectByValue("vs");
		}*/
		
		//dropdown without select class
		//Select drpdwn=new Select(driver.findElement(By.id("course")));
		List<WebElement> alloptions=driver.findElements(By.xpath("//select[@id='course']//option"));
		
		
		for(int i=0;i<alloptions.size();i++) {
			String drp=alloptions.get(i).getText();
			System.out.println(drp);
		}
		for(WebElement value:alloptions) {
			if(value.getText().equals("Javascript")) {
				value.click();
				break;
			}
		}
		
	}

}
