package stepdefs.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class HomePagev2 {
  private static Logger log = LogManager.getLogger(HomePagev2.class.getName());

  WebDriver driver;
  WebDriverWait wait;

  //Today Deals Link
  @FindBy(how = How.TAG_NAME, using = "h1")
  public WebElement lp;

  //Right Profile Context Menu
  @FindBy(how = How.ID , using = "nav-link-yourAccount")
  public WebElement profContextMenu;

  //Sign in Button on Context Menu
  @FindBy(how = How.XPATH , using = "//div[@id='nav-flyout-ya-signin']/a")
  public WebElement signButton;

  //Username Locator
  @FindBy(how = How.ID , using = "ap_email")
  public WebElement usernameLocator;

  //Continue Sign in after username
  @FindBy(how = How.ID , using = "continue")
  public WebElement contButton;

  //Login Failure Message
  @FindBy(how = How.XPATH , using = "//ul[@class='a-unordered-list a-nostyle "
      + "a-vertical a-spacing-none']/li/span")
  public WebElement failureMessage;

  public HomePagev2(WebDriver driver){
    this.driver = driver;
    //Using the wait in the constructor
    wait=new WebDriverWait(driver, 5);
  }

  public void waitAndClickOnSignInContextMenu(){
    wait.until(ExpectedConditions.visibilityOf(signButton));
    signButton.click();
  }
}
