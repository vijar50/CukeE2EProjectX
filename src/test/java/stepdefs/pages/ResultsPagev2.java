package stepdefs.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class ResultsPagev2 {
  private static Logger log = LogManager.getLogger(ResultsPagev2.class.getName());

  WebDriver driver;
  WebDriverWait wait;

  //Amazon Logo
  @FindBy(how = How.NAME , using = "s-ref-checkbox-ASUS")
  public WebElement brandName;

  //Sort Dropdown
  @FindBy(how = How.ID , using = "sort")
  public WebElement sortResults;

  //Star Ratings
  @FindBy(how = How.XPATH , using = "//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
  public WebElement fourStarItem;

  @FindBy(how = How.XPATH , using = "//*[contains(text(), '4 Stars & Up')]")
  public WebElement fourStarLink;

  @FindBy(how = How.XPATH , using = "//i[@class='a-icon a-icon-star a-star-3-5']")
  public List<WebElement> threeFiveStarRating;

  @FindBy(how = How.XPATH , using = "//i[@class='a-icon a-icon-star a-star-3']")
  public List<WebElement> threeStarRating;

  //Results Headers
  @FindBy(how = How.TAG_NAME , using = "h2")
  public WebElement resultsHeaders;

  public ResultsPagev2(WebDriver driver){
    this.driver = driver;
    //Using the wait in the constructor
    wait=new WebDriverWait(driver, 5);
  }

  public void checkResultingBrands(String brand){

    WebDriverWait wait=new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='result_20']/div/div[3]/"
        + "div[2]/span[2]")));
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

  public void waitForResultsToLoad(){
    wait.until(ExpectedConditions.visibilityOf(resultsHeaders));
  }

  public Select resultDropdown(){
    Select dropdown = new Select(sortResults);
    return dropdown;
  }

  public boolean checkResultsOrdering(){
    int i = 0;
    boolean p = false;

    while(!driver.findElements(By.xpath("//li[@id='result_" + i + "']")).isEmpty() && i < 10){
      String str = driver.findElement(By.xpath("//li[@id='result_" + i + "']")).getText();
      String parts[] = str.split("£");
      String part1 = parts[1];
      String part1x = StringUtils.substringBefore(part1, " (");
      String part1xx = part1x.replace(",", "");
      String part1xxx = part1xx.replaceAll("[^0-9\\.]+", "");
      String part1xxxx = part1xxx.replaceAll("[.]$" , "");

      double numPrice = Double.parseDouble(part1xxxx);
      log.debug("Price Result: " + numPrice);
      if(numPrice < 500.00){
        p = true;
      }
      i++;
    }
    return p;
  }

}
