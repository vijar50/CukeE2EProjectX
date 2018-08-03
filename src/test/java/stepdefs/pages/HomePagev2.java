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

  //Amazon Logo
  @FindBy(how = How.XPATH , using = "//div[@id='desktop-banner']")
  public WebElement amazonLogo;

  //Search Input Field
  @FindBy(how = How.ID , using = "twotabsearchtextbox")
  public WebElement srchInField;

  //Search Button
  @FindBy(how = How.XPATH , using = "//*[@id='nav-search']/form/div[2]/div/input")
  public WebElement srchButton;

  //Department Filter
  @FindBy(how = How.ID , using = "searchDropdownBox")
  public WebElement deptFilter;

  //Results Counter Element
  @FindBy(how = How.XPATH , using = "//span[@id='s-result-count']")
  public WebElement resultsCounter;

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

  //Shop by Department
  @FindBy(how = How.ID , using = "nav-shop")
  public WebElement deptcat1;

  //Electronics and Computers Category
  @FindBy(how = How.XPATH , using = "//span[contains(text(),'Electronics & Computers')]")
  public WebElement deptcat2;

  //Headphones Category
  @FindBy(how = How.XPATH , using = "//*[@id='nav-flyout-shopAll']/div[3]/div[13]/div[1]/div/a[4]/span")
  public WebElement deptcat3;

  //Department Flyout
  @FindBy(how = How.ID , using = "nav-flyout-shopAll")
  public WebElement deptFlyout;

  //Page Header
  @FindBy(how = How.TAG_NAME , using = "h1")
  public WebElement title;

  public HomePagev2(WebDriver driver){
    this.driver = driver;
    //Using the wait in the constructor
    wait=new WebDriverWait(driver, 5);
  }

  public void waitAndClickOnSignInContextMenu(){
    wait.until(ExpectedConditions.visibilityOf(signButton));
    signButton.click();
  }

  public void waitForFlyout(){
    wait.until(ExpectedConditions.visibilityOf(deptFlyout));
    log.debug("Menu Displayed? " + deptFlyout.isDisplayed());
  }
}
