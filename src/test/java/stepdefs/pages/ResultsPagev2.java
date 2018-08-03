package stepdefs.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class ResultsPagev2 {
  private static Logger log = LogManager.getLogger(ResultsPagev2.class.getName());

  WebDriver driver;
  WebDriverWait wait;

  //Amazon Logo
  @FindBy(how = How.NAME , using = "s-ref-checkbox-ASUS")
  public WebElement brandName;



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
}
