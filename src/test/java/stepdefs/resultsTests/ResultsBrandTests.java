package stepdefs.resultsTests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.ResultsPage;


public class ResultsBrandTests extends builderClass {
  private static Logger log = LogManager.getLogger(ResultsBrandTests.class.getName());
  ResultsPage results;

  /*@When("^I select a brand$")
  public void i_select_a_brand() throws Throwable
  {
    results = new ResultsPage(driver);
    results.clickBrand();
    log.debug("Found the ASUS checkbox and clicked it");
  }*/

  /*@Then("^I see results from \"([^\"]*)\" only$")
  public void results_from_brand(String brand) throws Throwable
  {
    results.checkResultingBrands(brand);
  }*/

}