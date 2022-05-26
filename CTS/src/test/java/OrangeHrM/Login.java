package OrangeHrM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	@Test
	public void login_Success() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String USERNAME= System.getProperty("USERNAME");
		System.out.println("The title is "+driver.getTitle()+" USERNAME "+USERNAME);
		driver.close();
	}

}
