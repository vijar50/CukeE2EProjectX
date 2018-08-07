package stepdefs.resultsTests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.ResultsPagev2;


public class ResultsRatingTestsv2 extends builderClass {
  private static Logger log = LogManager.getLogger(ResultsRatingTestsv2.class.getName());
  ResultsPagev2 rpage = PageFactory.initElements(driver, ResultsPagev2.class);
  WebDriverWait wait = new WebDriverWait(driver, 3);

  @When("^I select a \"([^\"]*)\" rating$")
  public void i_select_rating(String rating) throws Throwable
  {
    String str = rpage.fourStarItem.getAttribute("class");
    Assert.assertEquals(str, "a-icon a-icon-star-medium a-star-medium-4");
    log.debug("This is output from star link"
        + " element " + str);

    rpage.fourStarLink.click();
  }

  @Then("^I don't see a lower rating on the results page$")
  public void i_dont_see_lower_rating() throws Throwable
  {
    rpage.waitForResultsToLoad();
    Assert.assertFalse(rpage.threeFiveStarRating.size() >= 1);
    Assert.assertFalse(rpage.threeStarRating.size() >= 1);
    log.debug("There are no 3 or 3.5 star rating products displayed");
  }
}