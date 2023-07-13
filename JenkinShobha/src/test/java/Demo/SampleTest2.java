package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest2 {
	public void m1() {
		String BROWSER =System.getProperty("browser");
		String URL =System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
		
		WebDriver driver;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
		driver.get(URL);
		
	}

}
