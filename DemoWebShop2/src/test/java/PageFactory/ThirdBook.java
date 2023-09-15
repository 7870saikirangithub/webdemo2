package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdBook {
	@FindBy(xpath="//div[contains(@class,'item-box')][3]")
	WebElement thirdbook;

	public ThirdBook(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickBook3() {
		thirdbook.click();
	}
}
