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


public class AddressTests extends builderClass {
  private static Logger log = LogManager.getLogger(AddressTests.class.getName());
  LoggedInPages lpage = PageFactory.initElements(driver, LoggedInPages.class);
  WebDriverWait wait = new WebDriverWait(driver, 3);
  Actions action = new Actions(driver);

  @When("^I click on Your Account$")
  public void i_click_on_yourAcc_link() throws Throwable
  {
    lpage.yourAccLink.click();
  }

  @And("^I click on \"([^\"]*)\"$")
  public void i_click_start_trial(String linkName) throws Throwable
  {
    Assert.assertEquals(lpage.yourAddressesLink.getText(), linkName);
    lpage.yourAddressesLink.click();
  }

  @And("^I click add Address$")
  public void i_enter_my_card_details() throws Throwable
  {
    lpage.addAddress.click();
  }

  @And("^I enter my address details$")
  public void i_add_card() throws Throwable
  {
    lpage.fullNameInput.sendKeys("Tim");
    lpage.phoneNumInput.sendKeys("02081231234");
    lpage.selectCountry();
    lpage.postCodeField.sendKeys("WC1H 9EU");
    lpage.streetAddressField.sendKeys("4434 Alpha Street, " + lpage.randomAlphaNumeric(8));
    lpage.townCityField.sendKeys("London");
    lpage.countyField.sendKeys("Middlesex");
  }

  @Then("^I add the Address$")
  public void card_addition_fails() throws Throwable
  {
    lpage.addAddressButton.click();
  }
}