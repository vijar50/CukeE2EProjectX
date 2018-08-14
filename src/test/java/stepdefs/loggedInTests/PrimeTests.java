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
import stepdefs.pages.LoggedInPages;


public class PrimeTests extends builderClass {
  private static Logger log = LogManager.getLogger(PrimeTests.class.getName());
  LoggedInPages lpage = PageFactory.initElements(driver, LoggedInPages.class);
  WebDriverWait wait = new WebDriverWait(driver, 3);
  String input;
  Actions action = new Actions(driver);

  @When("^I click on Try Prime$")
  public void i_click_on_try_prime() throws Throwable
  {
    lpage.primeLink.click();
  }

  @And("^I click on Start 30 Day Free Trial$")
  public void i_click_start_trial() throws Throwable
  {
    lpage.startTrialButton.click();
  }

  @And("^I enter my credit card details$")
  public void i_enter_my_card_details() throws Throwable
  {
    lpage.waitforElementPresent(lpage.nameOnCardField);
    lpage.nameOnCardField.sendKeys("Test Name");
    lpage.cardNumField.sendKeys("4563 7894 4561 1234");
  }

  @And("^I click add card$")
  public void i_add_card() throws Throwable
  {
    lpage.addCardButton.click();
  }

  @Then("^card addition fails$")
  public void card_addition_fails() throws Throwable
  {
    log.debug("Message: " + lpage.cardFailedMessage.getText());
  }
}