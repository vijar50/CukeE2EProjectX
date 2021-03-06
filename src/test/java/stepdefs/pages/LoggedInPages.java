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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class LoggedInPages {
  private static Logger log = LogManager.getLogger(LoggedInPages.class.getName());

  WebDriver driver;
  WebDriverWait wait;
  //NAV LINKS --------------------------------------------------

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

  //Nav Link Try Prime
  @FindBy(how = How.ID , using = "nav-link-prime")
  public WebElement primeLink;

  //Nav Link Your Account
  @FindBy(how = How.ID , using = "nav-link-yourAccount")
  public WebElement yourAccLink;

  //Your Addresses Link
  @FindBy(how = How.XPATH , using = "//*[contains(text(), 'Your Addresses')]")
  public WebElement yourAddressesLink;

  //Add Address
  @FindBy(how = How.CSS , using = "#ya-myab-address-add-link")
  public WebElement addAddress;

  //WISH LIST FLOW --------------------------------------------

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

  //First List Item
  @FindBy(how = How.CSS , using = "div[id*='itemTitle_']")
  public WebElement listItem;

  //Remove Item Button
  @FindBy(how = How.CSS , using = "span[id='a-autoid-6'] span input")
  public WebElement removeItemButton;

  //Deleted Message
  @FindBy(how = How.CSS , using = "div[class='a-box a-alert-inline a-alert-inline-success'] div div")
  public WebElement deletedStatusMessage;

  //Create a List link
  @FindBy(how = How.ID , using = "createList")
  public WebElement createListLink;

  //List Pop up
  @FindBy(how = How.CSS , using = "a-popover-wrapper")
  public WebElement popUpWindow;

  //New List Name Input Field
  @FindBy(how = How.CSS , using = "#WLNEW_list_name")
  public WebElement newListNameInput;

  //Create List Button
  @FindBy(how = How.CSS , using = ".a-form-actions span:nth-child(3) span span input")
  public WebElement createListButton;

  //ADD ADDRESS FORM --------------------------------------------

  //Full Name field
  @FindBy(how = How.ID , using = "address-ui-widgets-enterAddressFullName")
  public WebElement fullNameInput;

  //Phone Number field
  @FindBy(how = How.ID , using = "address-ui-widgets-enterAddressPhoneNumber")
  public WebElement phoneNumInput;

  //Country field
  @FindBy(how = How.ID , using = "address-ui-widgets-countryCode-dropdown-nativeId")
  public WebElement countryField;

  //Postcode field
  @FindBy(how = How.ID , using = "address-ui-widgets-enterAddressPostalCode")
  public WebElement postCodeField;

  //Street Address field
  @FindBy(how = How.ID , using = "address-ui-widgets-enterAddressLine1")
  public WebElement streetAddressField;

  //Town/City field
  @FindBy(how = How.ID , using = "address-ui-widgets-enterAddressCity")
  public WebElement townCityField;

  //County field
  @FindBy(how = How.ID , using = "address-ui-widgets-enterAddressStateOrRegion")
  public WebElement countyField;

  //Add Address button
  @FindBy(how = How.CSS , using = "#a-autoid-0 span input")
  public WebElement addAddressButton;

  //PRIME FLOW --------------------------------------------------

  //Start 30 Day Free Trial Link
  @FindBy(how = How.CSS , using = "#prime-footer-cta span input")
  public WebElement startTrialButton;

  //Name on Card Field
  @FindBy(how = How.CSS , using = "input[id*='40']")
  public WebElement nameOnCardField;

  //Card Number Field
  @FindBy(how = How.CSS , using = "input[id*='41']")
  public WebElement cardNumField;

  //Add Card Button
  @FindBy(how = How.NAME , using = "ppw-widgetEvent:AddCreditCardEvent")
  public WebElement addCardButton;

  //Error Message
  @FindBy(how = How.TAG_NAME , using = "h4")
  public WebElement cardFailedMessage;

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

  public void waitforTextPresent(String input, WebElement a){
    wait.until(ExpectedConditions.textToBePresentInElement(a, input));
  }

  public void waitforElementPresent(WebElement a){
    wait.until(ExpectedConditions.visibilityOf(a));
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

  public void checkAndRemoveItem(){
    if (removeItemButton.isDisplayed()){
      removeItemButton.click();
    }
  }

  public void selectCountry(){
    Select dropdown = new Select(countryField);
    dropdown.selectByVisibleText("United Kingdom");
  }
}
