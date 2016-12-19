package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		String key="webdriver.gecko.driver";
		String value=".\\exefiles\\geckodriver.exe";
		System.setProperty(key, value);
		//FirefoxDriver f=new FirefoxDriver();
		WebDriver driver=new FirefoxDriver();  // upcasting
	}

}
