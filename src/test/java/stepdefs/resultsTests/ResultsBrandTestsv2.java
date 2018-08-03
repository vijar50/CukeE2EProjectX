package stepdefs.resultsTests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.HomePagev2;
import stepdefs.pages.ResultsPagev2;


public class ResultsBrandTestsv2 extends builderClass {
  private static Logger log = LogManager.getLogger(ResultsBrandTestsv2.class.getName());
  ResultsPagev2 rpage = PageFactory.initElements(driver, ResultsPagev2.class);
  WebDriverWait wait = new WebDriverWait(driver, 3);

  @When("^I select a brand$")
  public void i_select_a_brand() throws Throwable
  {
    rpage.brandName.click();
    log.debug("Found the ASUS checkbox and clicked it");
  }

  @Then("^I see results from \"([^\"]*)\" only$")
  public void results_from_brand(String brand) throws Throwable
  {
    rpage.checkResultingBrands(brand);
  }

}