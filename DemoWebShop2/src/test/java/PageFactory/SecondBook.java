package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SecondBook {
@FindBy(xpath="//div[contains(@class,'item-box')][2]")
WebElement SecondBook;

public SecondBook(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void clickBook2() {
	SecondBook.click();
}
public void testWebElementNotAvailable() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.example.com");

	  //The element is not present on the page.
	  WebElement element = driver.findElement(By.id("(//div[contains(@class,'button')])[4]"));
	  Assert.assertNull(element);
	}

}