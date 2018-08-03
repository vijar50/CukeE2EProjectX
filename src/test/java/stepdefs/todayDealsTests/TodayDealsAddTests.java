package stepdefs.todayDealsTests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.TodayDealsPage;


public class TodayDealsAddTests extends builderClass {
  private static Logger log = LogManager.getLogger(TodayDealsAddTests.class.getName());
  TodayDealsPage todaypage = PageFactory.initElements(driver, TodayDealsPage.class);
  WebDriverWait wait = new WebDriverWait(driver, 3);

  @Then("^I click on Today Deals$")
  public void i_click_on_today_deals() throws Throwable
  {
    todaypage.todayDeals.click();
    log.debug("Today Deal Link clicked");
  }
  @And("^Im on the \"([^\"]*)\" page$")
  public void im_on_today_deals_page(String pagename) throws Throwable
  {
    String actual = todaypage.pageHeader.getText();
    log.debug(todaypage.pageHeader.getText());
    Assert.assertEquals(actual, pagename);
  }

  @When("^I click on a deal$")
  public void i_click_on_a_deal() throws Throwable
  {
    String buttonText = todaypage.deal.getText();
    log.debug("Button Text: " + buttonText);
    todaypage.deal.click();
    log.debug("Found a valid deal to add to basket");
  }

  @Then("^My basket counter is incremented$")
  public void basket_counter_incremented() throws Throwable
  {
    wait.until(ExpectedConditions.textToBePresentInElement(todaypage.cartcount, "1"));
    int count = Integer.parseInt(todaypage.cartcount.getText());
    log.debug("The basket has " + count + " item(s)");
  }

  @And("^I click checkout$")
  public void i_click_checkout() throws Throwable
  {
    todaypage.cartcount.click();
  }

  @Then("^My basket has an item$")
  public void basket_has_item() throws Throwable
  {
    int quantity = Integer.parseInt(todaypage.qty.getText());
    Assert.assertTrue(quantity == 1);
    log.debug("Quantity in basket: " + quantity);
  }
}