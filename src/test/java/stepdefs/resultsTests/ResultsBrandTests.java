package stepdefs.resultsTests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import stepdefs.builderClass;


public class ResultsBrandTests extends builderClass {
  private static Logger log = LogManager.getLogger(ResultsBrandTests.class.getName());

  @When("^I select a brand$")
  public void i_select_rating() throws Throwable
  {
    driver.findElement(By.name("s-ref-checkbox-ASUS")).click();
    log.debug("found the ASUS checkbox and clicked it");
    Thread.sleep(1000);
  }

  @Then("^I see results from \"([^\"]*)\" only$")
  public void results_from_brand(String brand) throws Throwable
  {
    //While the resultsTests are not empty, check the brand of all the resultsTests
    int i = 0;
    while(!driver.findElements(By.xpath("//*[@id='result_" + i + "']/div/div[3]/"
        + "div[2]/span[2]")).isEmpty()){
      String str = driver.findElement(By.xpath("//*[@id='result_" + i + "']/div/div[3]/"
          + "div[2]/span[2]")).getText();
      Assert.assertEquals(str, brand);
      log.debug("The " + i + " result is ASUS");
      i++;
    }
  }

}