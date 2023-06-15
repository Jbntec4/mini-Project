package flights;

import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HiglightStep {
	InspectHighlightedObjects HiglightStepobj;
	@Given("User navigates to Register Page {string}")
	public void registerpage(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constant.driver = new ChromeDriver();
		Thread.sleep(2000);
		Constant.driver.manage().window().maximize();
		Constant.driver.get(url);
		Thread.sleep(2000);
		HiglightStepobj=new InspectHighlightedObjects();
	}

	@When("User enters Full Name {string}")
	public void entersFullName(String name) {
		HiglightStepobj.enterUsename(name);
	}

	@When("User enters Address {string}")
	public void EntersAddress(String adress) {
		HiglightStepobj.enterAdress(adress); 
	}

	@When("User enters city {string}")
	public void entersCity(String city) {
		HiglightStepobj.enterCity(city);
	}

	@When("User etners state {string}")
	public void etnersState(String state) {
		HiglightStepobj.enterState(state);
	}

	@When("User enters Zipcode {string}")
	public void entersZipcode(String zipCode) {
		HiglightStepobj.enterZipCode(zipCode);
	}

	@When("User selects cardType {string}")
	public void selectsCardType(String cardType) throws InterruptedException {
		HiglightStepobj.selectTypeCard(cardType);
	}

	@When("User enters cardnumber {string}")
	public void uenterCardNumber(String cardNumber) {
		HiglightStepobj.enterCrreditCardNumber(cardNumber);
	}

	@When("User enters month {string}")
	public void entersMonth(String month) {
		HiglightStepobj.creditCardMonth(month);
	}

	@When("enters Year {string}")
	public void entersYear(String year) {
		HiglightStepobj.creditCrdYear(year);
		
	}

	@When("User enters NameonCard {string}")
	public void entersNameonCard(String nameCard) {
		HiglightStepobj.enterNameOnCard(nameCard);
	}

	@When("User clicks the remebmerbox")
	public void clicksRemebmerbox() {
		HiglightStepobj.remeberChekBox();
	}

	@When("User clicks the purcahse flight Button")
	public void clickspurcahseflightbutton() {
		HiglightStepobj.purchaseBtn();
	}

	@Then("User verifies success message {string}")
	public void user_verifies_success_message(String message) throws InterruptedException {
		
	    System.out.println(message);
	    Thread.sleep(2000);
	    Constant.driver.quit();
	}

}
