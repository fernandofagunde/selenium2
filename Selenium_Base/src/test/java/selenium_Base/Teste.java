package selenium_Base;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste {

	WebDriver driver;

	@Before
	public void setUp() {
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		String filePath = "util/chromedriver.exe";
        File file = new File(filePath);
        String path = file.getPath();
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Tis Tech");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	@After
	public void tearDown() {
     driver.close();
     driver.quit();
	}

}
