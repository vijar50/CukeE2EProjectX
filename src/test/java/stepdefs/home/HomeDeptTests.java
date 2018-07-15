package stepdefs.home;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import stepdefs.builderClass;


public class HomeDeptTests extends builderClass {

  @When("^I shop by Department I choose \"([^\"]*)\" and \"([^\"]*)\"$")
  public void i_shop_by(String subcat1, String subcat2) throws Throwable
  {
    Actions action = new Actions(driver);
    WebElement ele = driver.findElement(By.id("nav-shop"));
    action.moveToElement(ele).build().perform();
    Thread.sleep(1000);
    ele = driver.findElement(By.xpath("//span[contains(text(),'Electronics & Computers')]"));
    action.moveToElement(ele).build().perform();
    driver.findElement(By.xpath("//span[contains(text(),'Headphones')]")).click();


  }

  @Then("^I am on the \"([^\"]*)\" page$")
  public void product_landing_page(String title) throws Throwable
  {

    Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), title);
  }

}