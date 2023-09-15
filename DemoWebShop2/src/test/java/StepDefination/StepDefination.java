package StepDefination;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import PageFactory.FifthBook;
import PageFactory.FirstBook;
import PageFactory.FourthBook;
import PageFactory.HomePage;

import PageFactory.SecondBook;
import PageFactory.SixthBook;
import PageFactory.ThirdBook;
import PageFactory.VerifyFirstBook;
import PageFactory.VerifyThirdBook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import org.apache.log4j.Level;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;


public class StepDefination extends Driver {
	
	
	@Given("a user is on the landing page of demowrbshop")
	public void a_user_is_on_the_landing_page_of_demowrbshop() {
	
	}

	@When("he clicks on books in the navigation bar")
	public void he_clicks_on_books_in_the_navigation_bar() {
		
	    homepage.clickBooks();
	    logger.info("click on the Books");
	}

	@When("he clicks on the firstbook")
	public void he_clicks_on_the_firstbook() {
	   FirstBook firstbook = new FirstBook(driver);
	    
	firstbook.clickBook1();
	    logger.info("Clicks on the FirstBook");
	}

	@When("he verify the {string}  button  in the first book")
	public void he_verify_the_button_in_the_first_book(String string) {
	    VerifyFirstBook verifyfirstbook = new VerifyFirstBook(driver);
	    verifyfirstbook.verifyBook1();
	    WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button-13")); // Adjust the locator as needed
        assertTrue(addToCartButton.isDisplayed());
       logger.info("verify firstbook");
	}

	@When("Again clicks on books in the navigation bar")
	public void again_clicks_on_books_in_the_navigation_bar() {
		HomePage homepage = new HomePage(driver);
	    homepage.clickBooks();
	}

	@SuppressWarnings("deprecation")
	@When("he clicks on the secondbook")
	public void he_clicks_on_the_secondbook() {

	    WebElement addtocartbutton = driver.findElement(By.xpath("(//div[contains(@class,'button')])[4]"));
	    
	    
	    
	   String Expected= addtocartbutton.getText();
	   String Actual = "Add To Cart";
	   if (!Expected.equals(Actual)) {
		    System.out.println("Add to cart is not available in product 2");
	   }

	    
	}

	@When("he verify the {string} button in second book")
	public void he_verify_the_button_in_second_book(String string) {
		HomePage homepage = new HomePage(driver);
	    homepage.clickBooks();
	    logger.info("verify SecondBook");
	    
	}

	@When("he clicks on the thirdbook")
	public void he_clicks_on_the_thirdbook() {
	    ThirdBook thirdbook = new ThirdBook(driver);
	    thirdbook.clickBook3();
	    logger.info("click SecondBook");
	}

	@When("he verify the {string} button in third book")
	public void he_verify_the_button_in_third_book(String string) {
	    VerifyThirdBook verifythirdbook = new VerifyThirdBook(driver);
	    verifythirdbook.verifyBook3();
	    WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button-45")); // Adjust the locator as needed
        assertTrue(addToCartButton.isDisplayed());
        logger.info("verify ThirdBook");
	    
	}

	@When("he clicks on the fourthbook")
	public void he_clicks_on_the_fourthbook() {
		HomePage homepage = new HomePage(driver);
	    homepage.clickBooks();

	    WebElement addtocartbutton = driver.findElement(By.xpath("(//div[contains(@class,'button')])[6]"));
	    
	    
	    
		   String Expected= addtocartbutton.getText();
		   String Actual = "Add To Cart";
		   if (!Expected.equals(Actual)) {
			    System.out.println("Add to cart is not available in product 4");
		   }
	    
	}

	@When("he verify the {string} button in fourth book")
	public void he_verify_the_button_in_fourth_book(String string) {
		HomePage homepage = new HomePage(driver);
	    homepage.clickBooks();
	    logger.info("clicks FourthBook");
	}

	@When("he clicks on the fifthbook")
	public void he_clicks_on_the_fifthbook() {
	   FifthBook fifthbook = new FifthBook(driver);
	   fifthbook.clickBook5();
	}

	@When("he verify the {string} button in fifth book")
	public void he_verify_the_button_in_fifth_book(String string) {
		HomePage homepage = new HomePage(driver);
	    homepage.clickBooks();
	    logger.info("clicks FifthBook");
	
	}

	@When("he clicks on the sixthbook")
	public void he_clicks_on_the_sixthbook() {
		WebElement addtocartbutton = driver.findElement(By.xpath("(//div[contains(@class,'button')])[8]"));
	    
	    
	
		   String Expected= addtocartbutton.getText();
		   String Actual = "Add To Cart";
		   if (!Expected.equals(Actual)) {
			    System.out.println("Add to cart is not available in product 6");
			    //assertTrue(addToCartButton.isDisplayed());
			    logger.info("clicks sixthBook");
		   }
	}

	@When("he verify the {string} button in sixth book")
public void he_verify_the_button_in_sixth_book(String string) {
		 logger.info("verify sixthBook");
	}

	@Then("confirm all the books having \"AddToCart\"button")
	public void confirm_all_the_books_having_add_to_cart_button() {
	   
	}
}
