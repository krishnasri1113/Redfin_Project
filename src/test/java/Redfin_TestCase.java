import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redfin_TestCase {
	public static void main(String[] args) {
		WebDriver driver=null;
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.get("https://www.redfin.com");
       driver.manage().window().maximize();
      WebDriverWait wait=new WebDriverWait(driver, 30);
      WebElement search=driver.findElement(By.xpath("(//input[@name='searchInputBox'])[1]"));
      wait.until(ExpectedConditions.visibilityOf(search));
      search.sendKeys("sunnyvale");
      //search.click();
      WebElement searchplaceselect=driver.findElement(By.xpath("(//button[@data-rf-test-name='searchButton'][@aria-label='submit search'])[1]"));
      wait.until(ExpectedConditions.visibilityOf(searchplaceselect));
      searchplaceselect.click();
      WebElement selectplace=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'resultsView')]//div[1]//div[1]//div[2]//a[1]")));
      //wait.until(ExpectedConditions.visibilityOf(selectplace));
      selectplace.click();
      WebElement gettext=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='textContent']")));
      //wait.until(ExpectedConditions.visibilityOf(gettext));
      String actualresult=gettext.getText();
      String expectedresult="Sunnyvale";
      assertEquals(actualresult, expectedresult);
      WebElement minprice=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'field select Select quickMinPrice withFlyout withOptions mounted selected clickable optional')]")));
      //wait.until(ExpectedConditions.visibilityOf(price));
      minprice.click();
      WebElement minpricevalue=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'$800k')]")));
      minpricevalue.click();
     // wait.until(ExpectedConditions.visibilityOf(minprice));
      //JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView()",minprice );//developers
      //WebElement minpri=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='quickMinPrice']//option[contains(text(),'$150k')]")));
         // minpri.click();
   
      WebElement maxprice=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'field select Select quickMaxPrice withFlyout withOptions mounted selected clickable optional')]")));
      maxprice.click();
      WebElement maxpricevalue=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'$950')]")));
      maxpricevalue.click();
      WebElement table=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='modeOptionInnard table']")));
      table.click();
      WebElement htmltable=driver.findElement(By.xpath("//div[@class='TableView time-on-redfin'//table//tbody"));
		List<WebElement> rows=htmltable.findElements(By.tagName("th"));
		System.out.println("no of rows :"+rows.size());
		for(int rnum=0;rnum<rows.size();rnum++)
		{
			System.out.println(rows.get(rnum).getText());
		
	}

}
}
