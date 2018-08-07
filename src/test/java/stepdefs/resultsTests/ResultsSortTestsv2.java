package stepdefs.resultsTests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.ResultsPagev2;


public class ResultsSortTestsv2 extends builderClass {
  private static Logger log = LogManager.getLogger(ResultsSortTestsv2.class.getName());
  ResultsPagev2 rpage = PageFactory.initElements(driver, ResultsPagev2.class);
  WebDriverWait wait = new WebDriverWait(driver, 3);

  @Given("^I am on the results on URL \"([^\"]*)\"$")
  public void i_am_on_the_results_page_on_URL(String url) throws Throwable
  {
    driver.get(url);
    log.debug("I am on: " + driver.getTitle());
  }

  @When("^I sort by \"([^\"]*)\"$")
  public void i_sort_by(String sortcat) throws Throwable
  {
   rpage.resultDropdown().selectByVisibleText(sortcat);
   log.debug("I have selected: " + sortcat + " from the dropdown");
  }

  @Then("^\"([^\"]*)\" is displayed$")
  public void result_is_displayed(String product) throws Throwable
  {
    rpage.waitForResultsToLoad();
    //Thread.sleep(2000);
    Assert.assertEquals(rpage.checkResultsOrdering() , false);
    log.debug("The results are: " + rpage.checkResultsOrdering());
  }

  @Then("^\"([^\"]*)\" is not displayed$")
  public void is_not_displayed(String product) throws Throwable
  {
    rpage.waitForResultsToLoad();
    Assert.assertEquals(rpage.checkResultsOrdering() , true);
    log.debug("The results are: " + rpage.checkResultsOrdering());
  }

}