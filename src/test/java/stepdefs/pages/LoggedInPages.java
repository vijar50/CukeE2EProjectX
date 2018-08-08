package stepdefs.pages;

import java.util.Random;
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


public class LoggedInPages {
  private static Logger log = LogManager.getLogger(LoggedInPages.class.getName());

  WebDriver driver;
  WebDriverWait wait;
  //Password Locator
  @FindBy(how = How.ID , using = "ap_password")
  public WebElement passwordLocator;

  //Sign in Button for Login Test
  @FindBy(how = How.ID, using = "signInSubmit")
  public WebElement signInButton;

  //Your Account Widget
  @FindBy(how = How.CSS , using = "a[class='nav-a nav-a-2 nav-truncate'] span")
  public WebElement signedInAs;

  //Nav Link Your Lists
  @FindBy(how = How.ID , using = "nav-link-wishlist")
  public WebElement yourListsDropdownLink;

  //Wish List List Item
  @FindBy(how = How.XPATH , using = "//*[@id='nav-flyout-wl-items']/div/a[1]/span")
  public WebElement wishListLink;

  //Lists Flyout
  @FindBy(how = How.ID , using = "nav-flyout-wishlist")
  public WebElement listsFlyout;

  //Your Lists Tab
  @FindBy(how = How.ID , using = "my-lists-tab")
  public WebElement yourListsTab;

  //Add Idea to List
  @FindBy(how = How.CSS , using = "#wfaLink span a")
  public WebElement addIdeaToListLink;

  //Idea Input field
  @FindBy(how = How.ID , using = "wfaTextInput")
  public WebElement ideaInput;

  //Add to List Button
  @FindBy(how = How.ID , using = "wfa-note-add-button")
  public WebElement addToListButton;

  public LoggedInPages(WebDriver driver){
    this.driver = driver;
    //Using the wait in the constructor
    wait=new WebDriverWait(driver, 5);
  }

  public void waitForFlyout(){
    //Same Method in Homepagev2 - can refactor
    wait.until(ExpectedConditions.visibilityOf(wishListLink));
    log.debug("Menu Displayed? " + wishListLink.isDisplayed());
  }

  private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
  public String randomAlphaNumeric(int count) {
    StringBuilder builder = new StringBuilder();
    while (count-- != 0) {
      int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
      builder.append(ALPHA_NUMERIC_STRING.charAt(character));
    }
    return builder.toString();
  }

  public WebElement newWishListItem(String str){
    return driver.findElement(By.xpath("//span[text()='"+str+"']"));
  }
}
