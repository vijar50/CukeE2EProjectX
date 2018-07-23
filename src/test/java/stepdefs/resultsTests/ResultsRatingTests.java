package stepdefs.resultsTests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import stepdefs.builderClass;


public class ResultsRatingTests extends builderClass {
  private static Logger log = LogManager.getLogger(ResultsRatingTests.class.getName());

  @When("^I select a \"([^\"]*)\" rating$")
  public void i_select_rating(String rating) throws Throwable
  {

    String str = driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']")).getAttribute("class");

    //log.error("This is output from star element " + str);
    Assert.assertEquals(str, "a-icon a-icon-star-medium a-star-medium-4");
    log.debug("found the right star rating button");
    driver.findElement(By.xpath("//*[contains(text(), '4 Stars & Up')]")).click();
    Thread.sleep(1000);
  }

  @Then("^I don't see a lower rating on the results page$")
  public void i_dont_see_lower_rating() throws Throwable
  {
    Assert.assertFalse(driver.findElements(By.xpath("//i[@class='a-icon a-icon-star "
        + "a-star-3-5']")).size()>=1);
    Assert.assertFalse(driver.findElements(By.xpath("//i[@class='a-icon a-icon-star "
        + "a-star-3']")).size()>=1);
    log.debug("There are no 3 or 3.5 star rating products displayed");
  }

}