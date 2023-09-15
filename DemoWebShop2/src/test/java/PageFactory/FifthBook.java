package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FifthBook {
	@FindBy(xpath="//div[contains(@class,'item-box')][5]")
	WebElement fifthbook;

	public FifthBook(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickBook5() {
		fifthbook.click();
	}
}
