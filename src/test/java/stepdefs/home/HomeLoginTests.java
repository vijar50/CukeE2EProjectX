package stepdefs.home;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import stepdefs.builderClass;


public class HomeLoginTests extends builderClass {

  @When("^I click the sign in button$")
  public void i_click_on_signin_button() throws Throwable
  {
    Actions action = new Actions(driver);
    WebElement sbutton = driver.findElement(By.id("nav-link-yourAccount"));
    action.moveToElement(sbutton).build().perform();
    driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/a")).click();
  }

  @When("^I am on the login page$")
  public void i_am_on_the_login_page() throws Throwable
  {
    String pageheader = driver.findElement(By.tagName("h1")).getText();
    Assert.assertEquals(pageheader, "Sign in");
  }

  @When("^I enter my credentials \"([^\"]*)\" and \"([^\"]*)\"$")
  public void i_enter_credentials(String username, String password) throws Throwable
  {
    driver.findElement(By.id("ap_email")).sendKeys(username);
    driver.findElement(By.id("continue")).click();
    driver.findElement(By.id("ap_password")).sendKeys(username);
    driver.findElement(By.id("signInSubmit")).click();
  }

  @Then("^login fails$")
  public void login_fail() throws Throwable
  {
    String message = driver.findElement(By.xpath("//ul[@class='a-unordered-list a-nostyle "
        + "a-vertical a-spacing-none']/li/span")).getText();
    Assert.assertEquals(message, "To better protect your account, please re-enter your "
        + "password and then enter the characters as they are shown in the image below.");
  }

}