package stepdefs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class builderClass {
  //This file will create the driver object and we will call it before test execution
  public static WebDriver driver;

  public WebDriver initDriver() {

    //System.setProperty("webdriver.chrome.driver", "C:\\Resources\\chromedriver.exe");
    System.setProperty("webdriver.chrome.driver", "/usr/local/google/home/rajivmal/Downloads/chromedriver");
    driver = new ChromeDriver();
    return driver;
  }
}