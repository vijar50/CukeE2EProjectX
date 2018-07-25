package stepdefs.resultsTests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.ResultsPage;


public class ResultsSortTests extends builderClass {
  private static Logger log = LogManager.getLogger(ResultsSortTests.class.getName());
  ResultsPage results;

  @Given("^I am on the results on URL \"([^\"]*)\"$")
  public void i_am_on_the_page_on_URL(String url) throws Throwable
  {
    driver = initDriver();
    driver.get(url);
    Assert.assertEquals(driver.getTitle(), "Amazon.co.uk: GTX 1080 - Graphics Cards / " +
            "Components: Computers & Accessories");
  }

  @When("^I sort by \"([^\"]*)\"$")
  public void i_sort_by(String sortcat) throws Throwable
  {
    results = new ResultsPage(driver);
    results.resultDropdown().selectByVisibleText(sortcat);
    Thread.sleep(1000);
  }

  @Then("^\"([^\"]*)\" is displayed$")
  public void result_is_displayed(String product) throws Throwable
  {
    Assert.assertEquals(results.searchRes().getText(), product);
    log.debug("Search Result: " + results.searchRes().getText());
  }

  @Then("^\"([^\"]*)\" is not displayed$")
  public void is_not_displayed(String product) throws Throwable
  {
    //used findElements so I can use .size, findElement will throw exception
    Assert.assertFalse(results.searchResult().size()>1);
  }

}