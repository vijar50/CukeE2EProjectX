package stepdefs.homeTests;

import cucumber.api.java.After;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.HomePage;

//USING POM and LOGGING
public class HomeSearchTests extends builderClass {
  private static Logger log = LogManager.getLogger(HomeSearchTests.class.getName());
  HomePage home;

  @Given("^I am on the homepage on URL \"([^\"]*)\"$")
  public void i_am_on_the_page_on_URL(String url) throws Throwable
  {
    Assert.assertEquals(driver.getTitle(), "Amazon.co.uk: Low Prices in Electronics, "
        + "Books, Sports Equipment & more");
  }

  @Then("^I should see the logo$")
  public void i_should_see_the_logo()
  {
    home = new HomePage(driver);

    Assert.assertTrue(home.checkAmazonLogo());
    log.debug("Amazon Logo Displayed");
  }

  @When("^I fill in the search box with \"([^\"]*)\"$")
  public void i_fill_in_search(String searchText) throws Throwable
  {
    home = new HomePage(driver);

    home.getSearchBox().sendKeys(searchText);
    log.debug("Search query: " + searchText);
  }

  @When("^I click the search button$")
  public void i_click_on_button() throws Throwable
  {
    home = new HomePage(driver);

    home.clickSrchButton();
    log.debug("Search Button Clicked");
  }

  @When("^I click the dropdown and select \"([^\"]*)\"$")
  public void i_click_the_dropdown(String category) throws Throwable
  {
    home = new HomePage(driver);

    Select dropdown = new Select(home.departmentFilter());
    log.debug("Category: " + category);
    dropdown.selectByVisibleText(category);
  }

  @Then("^I am on the results page$")
  public void i_am_on_the_results_page() throws Throwable
  {
    //Assert.assertTrue(driver.findElement(By.xpath("//span[@id='s-result-count']")).isDisplayed());
    home = new HomePage(driver);
    Assert.assertTrue(home.resultsCheck());
    log.debug("On the results page");
  }

  @After
  public void tearDown() throws InterruptedException {
    log.debug("Close WebDriver");
    //Thread.sleep(1000);
    driver.close();
    //null clears all the objects in driver out of memory
    driver = null;
  }
}