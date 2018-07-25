package stepdefs.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*TO-DO List:
1. Update to Page Factory Model
2. Use Explicit Wait conditions on certain the methods
 */
public class HomePage {
  private static Logger log = LogManager.getLogger(HomePage.class.getName());

  WebDriver driver;
  WebElement ele;

  //Amazon Logo
  By amazonLogo = By.xpath("//div[@id='desktop-banner']");

  //Shop By Department
  By deptcat1 = By.id("nav-shop");
  By deptcat2 = By.xpath("//span[contains(text(),'Electronics & Computers')]");
  By deptcat3 = By.xpath("//span[contains(text(),'Headphones')]");

  //Page Title
  By title = By.tagName("h1");

  //Flyout
  By flyout = By.id("nav-link-yourAccount");

  //DeptFlyout
  By deptFlyout = By.id("nav-flyout-shopAll");

  //Sign in Button
  By signButton = By.xpath("//div[@id='nav-flyout-ya-signin']/a");

  //Home Search Box
  By homeSrch = By.id("twotabsearchtextbox");

  //Home Search Button
  By homeSrchButton = By.xpath("//*[@id='nav-search']/form/div[2]/div/input");

  //Department Filter Category
  By deptFilter = By.id("searchDropdownBox");

  //Results Counter
  By resultsCounter = By.xpath("//span[@id='s-result-count']");

  //Sign in page title
  By loginPage = By.tagName("h1");

  //Username field
  By username = By.id("ap_email");

  //Password field
  By password = By.id("ap_password");

  //Continue button
  By cont = By.id("continue");

  //Login Failure
  By loginFailMessage = By.xpath("//ul[@class='a-unordered-list a-nostyle "
               + "a-vertical a-spacing-none']/li/span");

  public HomePage(WebDriver driver){
    this.driver = driver;
  }

  public String getTitle(){
    return driver.findElement(title).getText();
  }

  public WebElement selectFirstCat(){
    //Needs Explicit Wait
    ele = driver.findElement(deptcat1);
    return ele;
  }

  public WebElement selectSecondCat(){
    //Needs Explicit Wait
    ele = driver.findElement(deptcat2);
    return ele;
  }

  public WebElement selectThirdCat(){
    //Needs Explicit Wait
    ele = driver.findElement(deptcat3);
    return ele;
  }

  public WebElement FlyoutLink(){
    //Needs Explicit Wait
    ele = driver.findElement(flyout);
    return ele;
  }

  public By deptFlyoutLink(){
    //Redundant
    return deptFlyout;
  }

  public String getLoginTitle(){
    return driver.findElement(loginPage).getText();
  }

  public void SignIn(){
    driver.findElement(signButton).click();
  }

  public void setUsername(String usn){
    driver.findElement(username).sendKeys(usn);
  }

  public void setPassword(String pw){
    driver.findElement(password).sendKeys(pw);
  }

  public void ContinueButton(){
    driver.findElement(cont).click();
  }

  public String loginFailure(){
    return driver.findElement(loginFailMessage).getText();
  }

  public boolean checkAmazonLogo(){
    return driver.findElement(amazonLogo).isDisplayed();
  }

  public WebElement getSearchBox(){
    return driver.findElement(homeSrch);
  }

  public void clickSrchButton(){
    driver.findElement(homeSrchButton).click();
  }

  public WebElement departmentFilter(){
    return driver.findElement(deptFilter);
  }

  public boolean resultsCheck(){
    return driver.findElement(resultsCounter).isDisplayed();
  }
}
