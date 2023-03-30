package browser_details;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDetails {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./all_necessary_files/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	open the browser
	driver.manage().window().maximize();
//	driver.get("https://www.google.com");
//	navigates to the web address
	driver.navigate().to("https://www.google.com");
	
//	To get url of the project
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
//	To get title
	String title = driver.getTitle();
	System.out.println(title);
	

	
//	sleep after 5 seconds or wait 5secs
	Thread.sleep(5000);
//	close the browser
    driver.quit();
	}

}
