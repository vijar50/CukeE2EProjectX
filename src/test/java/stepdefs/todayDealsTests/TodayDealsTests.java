package stepdefs.todayDealsTests;

import com.google.common.collect.ImmutableList;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.ResultsPage;
import stepdefs.pages.TodayDealsPage;


public class TodayDealsTests extends builderClass {
  private static Logger log = LogManager.getLogger(TodayDealsTests.class.getName());
  TodayDealsPage todaypage = PageFactory.initElements(driver, TodayDealsPage.class);
  WebDriverWait wait = new WebDriverWait(driver, 3);

  @Then("^I click on Today Deals$")
  public void i_click_on_today_deals() throws Throwable
  {
    //Navigate to Today Page
    todaypage.todayDeals.click();
    log.debug("Today Deal Link clicked");
  }
  @And("^Im on the \"([^\"]*)\" page$")
  public void im_on_today_deals_page(String pagename) throws Throwable
  {
    //POTENTIALLY FLAKEY TEST
    //Checks the page header
    String actual = todaypage.pageHeader.getText();
    log.debug(todaypage.pageHeader.getText());
    Assert.assertEquals(actual, pagename);
  }

  @When("^I click on a deal$")
  public void i_click_on_a_deal() throws Throwable
  {
    //Check the deal logic
    String buttonText = todaypage.deal.getText();
    log.debug("Button Text: " + buttonText);
    todaypage.deal.click();
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