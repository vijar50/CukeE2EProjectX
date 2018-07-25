package stepdefs.resultsTests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.ResultsPage;


public class ResultsRatingTests extends builderClass {
  private static Logger log = LogManager.getLogger(ResultsRatingTests.class.getName());
  ResultsPage results;

  @When("^I select a \"([^\"]*)\" rating$")
  public void i_select_rating(String rating) throws Throwable
  {
    results = new ResultsPage(driver);

    String str = results.starRating().getAttribute("class");
    Assert.assertEquals(str, "a-icon a-icon-star-medium a-star-medium-4");
    log.debug("This is output from star element " + str);

    results.clickFourStars();

  }

  @Then("^I don't see a lower rating on the results page$")
  public void i_dont_see_lower_rating() throws Throwable
  {
    Assert.assertFalse(results.threeFiveStars().size() > 1);
    Assert.assertFalse(results.threeFiveStars().size() > 1);
    log.debug("There are no 3 or 3.5 star rating products displayed");
  }

}