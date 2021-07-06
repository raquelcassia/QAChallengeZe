package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverUtils {
	
	
	public static WebDriver driver;
	
	
	public static void IniciandoChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
		
		driver = new ChromeDriver();

	}

	public static void IniciandoDriver() {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("https://www.ze.delivery/");
		driver.manage().window().maximize();

	}

	public static void Iniciar() {
		IniciandoChrome();
		IniciandoDriver();
	}

	public static void QuitChrome() {
		driver.quit();
	}



}
