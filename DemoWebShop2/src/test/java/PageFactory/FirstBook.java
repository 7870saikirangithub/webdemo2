package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstBook {
@FindBy(xpath="//div[contains(@class,'item-box')][1]")
WebElement firstbook;

public FirstBook(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void clickBook1() {
	firstbook.click();
}
}
