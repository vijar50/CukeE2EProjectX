package stepdefs.todayDealsTests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.TodayDealsPage;


public class TodayDealsPriceTests extends builderClass {
  private static Logger log = LogManager.getLogger(TodayDealsPriceTests.class.getName());
  TodayDealsPage todaypage = PageFactory.initElements(driver, TodayDealsPage.class);
  WebDriverWait wait = new WebDriverWait(driver, 3);

  @When("^I click \"([^\"]*)\"$")
  public void i_click_dotd(String dotd) throws Throwable
  {
    Assert.assertEquals(todaypage.dealOfTheDay.getText(), dotd);
    log.debug("The link is: " + dotd);
    todaypage.dealOfTheDay.click();

  }
  @Then("^I only see items that are deals")
  public void i_only_see_items_that_are_deals() throws Throwable
  {
    //Thread.sleep(2000);
    todaypage.checkDealOfTheDay();
  }

}