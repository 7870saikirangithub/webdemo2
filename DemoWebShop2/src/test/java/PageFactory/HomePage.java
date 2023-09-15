package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText= "Books")
	WebElement book;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
	}
	public void clickBooks() {
		book.click();
	}
}
