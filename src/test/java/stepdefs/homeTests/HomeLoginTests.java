package stepdefs.homeTests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.HomePage;

//Using POM and LOGGING
public class HomeLoginTests extends builderClass {
  private static Logger log = LogManager.getLogger(HomeDeptTests.class.getName());
  HomePage home;

 /* @When("^I click the sign in button$")
  public void i_click_on_signin_button() throws Throwable
  {
    home = new HomePage(driver);
    Actions action = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, 3);

    action.moveToElement(home.FlyoutLink()).build().perform();
    log.debug("Flyout link text" + home.FlyoutLink().getText());
    //Thread.sleep(1000);

    home.SignIn();
    log.debug("Sign in Button Clicked.");

  }*/

  /*@When("^I am on the login page$")
  public void i_am_on_the_login_page() throws Throwable
  {
    home = new HomePage(driver);
    Assert.assertEquals(home.getLoginTitle(), "Sign in");
    log.debug("Login Page Title: " + home.getLoginTitle());
  }*/

  /*@When("^I enter my username \"([^\"]*)\" and password \"([^\"]*)\"$")
  public void i_enter_credentials(String username, String password) throws Throwable
  {
    home = new HomePage(driver);
    home.setUsername(username);
    log.debug("Username is set to " + username);
    home.ContinueButton();
    //Couldn't get to this stage as amazon validates email address
    //home.setPassword(password);
    //driver.findElement(By.id("signInSubmit")).click();
  }*/

  /*@Then("^login fails with \"([^\"]*)\"$")
  public void login_fail(String failMessage) throws Throwable
  {
    home = new HomePage(driver);
    Assert.assertEquals(home.loginFailure(), failMessage);
    log.debug("Login Failed. Message: " + home.loginFailure());
  }*/

}