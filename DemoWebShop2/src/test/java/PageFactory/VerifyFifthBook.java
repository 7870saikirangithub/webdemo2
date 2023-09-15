package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyFifthBook {
	@FindBy(id= "add-to-cart-button-22")
	WebElement verify5;
	
	public VerifyFifthBook(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
public void verifyBook5() {
	verify5.click();
}
public String getAddToCart() {
	String text = verify5.getText();
	return text;
}
}
