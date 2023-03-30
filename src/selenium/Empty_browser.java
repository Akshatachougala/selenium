package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Empty_browser {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./all_necessary_files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com");
		driver.quit();
		System.setProperty("webdriver.chrome.driver", "./all_necessary_files/geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.quit();
//		System.setProperty("webdriver.chrome.driver", "./all_necessary_files/chromedriver.exe");
//		WebDriver driver3=new InternetExplorerDriver();
 
		System.setProperty("webdriver.chrome.driver", "./all_necessary_files/msedgedriver.exe");
		WebDriver driver2=new EdgeDriver();
		driver2.quit();
	}

}
