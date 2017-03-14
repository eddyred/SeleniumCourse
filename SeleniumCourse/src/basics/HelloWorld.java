package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Eduardo R/Desktop/curso selenium+java/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:/Users/Eduardo R/Desktop/curso selenium+java/geckodriver.exe");
		/*ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--test-type");*/
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.udemy.com/");
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}
}
