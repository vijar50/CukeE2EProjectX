package stepdefs.homeTests;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefs.builderClass;
import stepdefs.pages.HomePagev2;


public class HomeSearchTestsv2 extends builderClass {

  private static Logger log = LogManager.getLogger(HomeSearchTestsv2.class.getName());
  HomePagev2 hpage = PageFactory.initElements(driver, HomePagev2.class);
  WebDriverWait wait = new WebDriverWait(driver, 3);

  @Given("^I am on the homepage on URL \"([^\"]*)\"$")
  public void i_am_on_the_homepage_URL(String url) throws Throwable
  {

    driver.get("http://www.amazon.co.uk");
    Assert.assertEquals(driver.getTitle(), "Amazon.co.uk: Low Prices in Electronics, "
        + "Books, Sports Equipment & more");
    log.debug("Web Driver set up successfully");
  }

  @Then("^I should see the logo$")
  public void i_should_see_the_logo()
  {
    Assert.assertTrue(hpage.amazonLogo.isDisplayed());
    log.debug("Amazon Logo Displayed");
  }

  @When("^I fill in the search box with \"([^\"]*)\"$")
  public void i_fill_in_search(String searchText) throws Throwable
  {
    hpage.srchInField.sendKeys(searchText);
    log.debug("Search query: " + searchText);
  }

  @When("^I click the search button$")
  public void i_click_on_button() throws Throwable
  {
    hpage.srchButton.click();
    log.debug("Search Button Clicked");
  }

  @When("^I click the dropdown and select \"([^\"]*)\"$")
  public void i_click_the_dropdown(String category) throws Throwable
  {
    Select dropdown = new Select(hpage.deptFilter);
    dropdown.selectByVisibleText(category);
    log.debug("Category selected: " + category);
  }

  @Then("^I am on the results page$")
  public void i_am_on_the_results_page() throws Throwable
  {
    Assert.assertTrue(hpage.resultsCounter.isDisplayed());
    log.debug("On the results page");


  }

  @After
  public void tearDown() throws InterruptedException {
    Thread.sleep(1000);

  }
}