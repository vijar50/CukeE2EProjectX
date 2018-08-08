package stepdefs.loggedInTests;

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
import stepdefs.pages.LoggedInPages;


public class LoggedInSuccessfulTests extends builderClass {
  private static Logger log = LogManager.getLogger(LoggedInSuccessfulTests.class.getName());
  LoggedInPages lpage = PageFactory.initElements(driver, LoggedInPages.class);
  WebDriverWait wait = new WebDriverWait(driver, 3);

  @And("^I enter my password \"([^\"]*)\" and sign in$")
  public void i_enter_password(String password) throws Throwable
  {
    lpage.passwordLocator.sendKeys(password);
    lpage.signInButton.click();
    log.debug("Sign in attempted");
  }

  @Then("^\"([^\"]*)\" is signed in$")
  public void login_succeeded(String username) throws Throwable
  {
    Assert.assertEquals(lpage.signedInAs.getText(), "Hello, " + username);
    log.debug("Signed in as: " + username);
  }
}