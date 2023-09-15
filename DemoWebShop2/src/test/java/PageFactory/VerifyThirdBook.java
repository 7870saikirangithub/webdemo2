package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyThirdBook {
	@FindBy(id= "add-to-cart-button-45")
	WebElement verify3;
	
	public VerifyThirdBook(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
public void verifyBook3() {
	verify3.click();
}
public String getAddToCart() {
	String text = verify3.getText();
	return text;
}
}
