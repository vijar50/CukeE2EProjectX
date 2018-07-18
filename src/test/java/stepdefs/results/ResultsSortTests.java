package stepdefs.results;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import stepdefs.builderClass;


public class ResultsSortTests extends builderClass {

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
    Select dropdown = new Select(driver.findElement(By.id("sort")));
    dropdown.selectByVisibleText(sortcat);
    Thread.sleep(1000);
  }

  @Then("^\"([^\"]*)\" is displayed$")
  public void is_displayed(String product) throws Throwable
  {
    Assert.assertTrue(driver.findElement(By.xpath("//a[@title='PNY GeForce GTX 1080 Ti Custom" +
            " Design']")).isDisplayed());
  }

  @Then("^\"([^\"]*)\" is not displayed$")
  public void is_not_displayed(String product) throws Throwable
  {
    //used findElements so I can use .size, findElement will throw exception
    Assert.assertFalse(driver.findElements(By.xpath("//a[@title='PNY GeForce GTX 1080 Ti " +
            "Custom Design']")).size()>1);
  }

}