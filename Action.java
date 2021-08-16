package learnselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen\\eclipse-workspace\\Selenium testing\\Drivers\\chromedriver.exe");
		String url = "https://www.google.co.in/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement gmail = driver.findElement(By.xpath("(//a [@class = 'gb_f'])[1]"));
		WebElement images = driver.findElement(By.xpath("(//a [@class = 'gb_f'])[2]"));
		Actions act = new Actions(driver);
		act.contextClick(gmail).build().perform();
		//act.moveToElement(gmail).build().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.switchTo();
		
		//Thread.sleep(3000);
		//driver.close();
		
	}

}
