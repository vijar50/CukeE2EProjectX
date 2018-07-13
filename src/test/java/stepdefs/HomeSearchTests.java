package stepdefs;

import cucumber.api.java.After;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class HomeSearchTests extends builderClass {

  @Given("^I am on the homepage on URL \"([^\"]*)\"$")
  public void i_am_on_the_page_on_URL(String url) throws Throwable
  {
    driver = initDriver();
    driver.get(url);
    Assert.assertEquals(driver.getTitle(), "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more");
  }

  @Then("^I should see the logo$")
  public void i_should_see_the_logo()
  {
    Assert.assertTrue(driver.findElement(By.xpath("//div[@id='desktop-banner']")).isDisplayed());
  }

  @When("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
  public void i_fill_in_search(String searchBox, String searchText) throws Throwable
  {
    driver.findElement(By.id(searchBox)).sendKeys(searchText);
  }

  @When("^I click the search button$")
  public void i_click_on_button() throws Throwable
  {
    driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
  }

  @When("^I click the dropdown and select \"([^\"]*)\"$")
  public void i_click_the_dropdown(String category) throws Throwable
  {
    Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
    Assert.assertEquals(category, "Fashion");
    dropdown.selectByVisibleText(category);
  }

  @Then("^I am on the results page$")
  public void i_am_on_the_results_page() throws Throwable
  {
    Assert.assertTrue(driver.findElement(By.xpath("//span[@id='s-result-count']")).isDisplayed());
  }

  @After
  public void tearDown() throws InterruptedException {
    Thread.sleep(1000);
    driver.close();
    //null clears all the objects in driver out of memory
    driver = null;
  }
}