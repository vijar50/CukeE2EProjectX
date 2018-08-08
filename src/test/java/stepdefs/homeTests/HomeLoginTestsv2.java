package stepdefs.homeTests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.HomePagev2;


public class HomeLoginTestsv2 extends builderClass {
  private static Logger log = LogManager.getLogger(HomeLoginTestsv2.class.getName());
  HomePagev2 hpage = PageFactory.initElements(driver, HomePagev2.class);
  WebDriverWait wait = new WebDriverWait(driver, 3);

  @When("^I click the sign in button$")
  public void i_click_on_signin_button() throws Throwable
  {
    Actions action = new Actions(driver);
    //This is flakey
    action.moveToElement(hpage.profContextMenu).build().perform();
    hpage.waitAndClickOnSignInContextMenu();
    log.debug("Sign in Button Clicked.");

  }

  @And("^I am on the login page$")
  public void i_am_on_the_login_page() throws Throwable
   {
     Assert.assertEquals(hpage.lp.getText(), "Sign in");
     log.debug("Login Page Title: " + hpage.lp.getText());
   }

  @And("^I enter my username \"([^\"]*)\"$")
  public void i_enter_credentials(String username) throws Throwable
  {
    hpage.usernameLocator.sendKeys(username);
    log.debug("Username is set to " + username);
    hpage.contButton.click();
    //Couldn't get to this stage as amazon validates email address
    //home.setPassword(password);
    //driver.findElement(By.id("signInSubmit")).click();
  }

  @Then("^login fails with \"([^\"]*)\"$")
  public void login_fail(String failMessage) throws Throwable
  {
    Assert.assertEquals(hpage.failureMessage.getText(), failMessage);
    log.debug("Login Failed. Message: " + hpage.failureMessage.getText());
  }
}