package launching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.5.2");

	}

}
