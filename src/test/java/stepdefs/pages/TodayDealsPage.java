package stepdefs.pages;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class TodayDealsPage {
  private static Logger log = LogManager.getLogger(TodayDealsPage.class.getName());

  WebDriver driver;
  WebDriverWait wait;

  //Today Deals Link
  @FindBy(how = How.XPATH, using = "//div[@id='nav-xshop']/a[2]")
  public WebElement todayDeals;

  //Today Deals Page Headers
  @FindBy(how = How.XPATH, using = "//div[contains(text(),'Today')]")
  public WebElement pageHeader;

  //A Deal - Is not a View or See Options or a Deal has ended or Learn More
  @FindBy(how = How.XPATH, using = "//*[contains(text(), 'Add to Basket')]")
  public WebElement deal;

  //Cart Count
  @FindBy(how = How.ID, using = "nav-cart-count")
  public WebElement cartcount;

  //Deal of the day
  @FindBy(how = How.XPATH , using = "//*[@id='widgetFilters']/div[3]/span[1]/div/a")
  public WebElement dealOfTheDay;

  /*//Price Range
  @FindBy(how = How.XPATH , using = "//*[@id='widgetFilters']/div[1]/span[1]/div/a")
  public WebElement price_range1;*/

  //Quantity in Checkout
  @FindBy(how = How.CSS, using = ".a-dropdown-prompt")
  public WebElement qty;

  /*//Item Price
  @FindBy(how = How.XPATH , using = "//*[@id='100_dealView_0']/div/div[2]/div/div/div[3]/div/span")
  public WebElement iprice;*/

  public TodayDealsPage(WebDriver driver){

    this.driver = driver;
    //Using the wait in the constructor
    wait=new WebDriverWait(driver, 5);

  }

  public void checkDealOfTheDay(){
    WebDriverWait wait=new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='100_dealView_0']/div/div[2]/"
        + "div/div/div[2]/div/span[1]")));
    int i = 0;

    while(!driver.findElements(By.xpath("//*[@id='100_dealView_" + i + "']/div/div[2]/"
        + "div/div/div[2]/div/span[1]")).isEmpty()){
      String str = driver.findElement(By.xpath("//*[@id='100_dealView_" + i + "']/div/div[2]/"
          + "div/div/div[2]/div/span[1]")).getText();
      Assert.assertEquals(str, "DEAL OF THE DAY");
      log.debug("The " + i + " deal is: " + str);
      i++;

    }
  }
}
