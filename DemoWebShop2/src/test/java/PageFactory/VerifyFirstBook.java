package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyFirstBook {

	@FindBy(id= "add-to-cart-button-13")
	WebElement verify1;
	
	public VerifyFirstBook(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
public void verifyBook1() {
	verify1.click();
}
public String getAddToCart() {
	String text = verify1.getText();
	return text;
}
}
