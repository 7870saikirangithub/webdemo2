package StepDefination;


	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.FifthBook;
import PageFactory.FirstBook;
import PageFactory.HomePage;
import PageFactory.ThirdBook;
import PageFactory.VerifyFirstBook;
import PageFactory.VerifyThirdBook;
import io.cucumber.java.After;
	import io.cucumber.java.Before;
	import io.cucumber.java.Scenario;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;
	
	import org.apache.log4j.Level;
	import org.apache.log4j.PropertyConfigurator;
	import org.apache.log4j.Logger;


	public class SharedSteps extends Tools{
		//WebDriver driver;

		@Before
		public void setUp(Scenario scenario) {
			Driver.init();
			
		}

		@After
		public void tearDown() {
			driver.quit();
		}
	}

	class Tools {
		protected static WebDriver driver;
	}

	class Driver extends Tools{
		public static RequestSpecification httprequest;
		public static Response response;
		
		public static Logger logger;
		 protected static HomePage homepage;
		 protected static FirstBook firstbook;
		 protected static VerifyFirstBook verifyfirstbook;
		 protected static ThirdBook thirdbook;
		 protected static  VerifyThirdBook verifythirdbook;
		 protected static   FifthBook fifthbook ;
	
		public static void init() {
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://demowebshop.tricentis.com/");
		    homepage=new HomePage(driver);
		     firstbook = new FirstBook(driver);
		     verifyfirstbook = new VerifyFirstBook(driver);
		     thirdbook = new ThirdBook(driver);
		      verifythirdbook = new VerifyThirdBook(driver);
		      fifthbook = new FifthBook(driver);
	        logger = Logger.getLogger("LogDemo");
			PropertyConfigurator.configure("log4j.properties");
			logger.setLevel(Level.DEBUG);}

}
