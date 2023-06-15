package flights;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;



//Step 1. reate a java class for the page of InspectHighlightedObjects
public class InspectHighlightedObjects {
	public static void main(String[] args) throws InterruptedException {
		setUp();
		Constant.driver.get("https://blazedemo.com/purchase.php ");
		InspectHighlightedObjects obj=new InspectHighlightedObjects();
		obj.enterUsename("yoel");
		Thread.sleep(2000);
		obj.enterAdress("123");
		Thread.sleep(2000);
		obj.enterCity("springf");
		Thread.sleep(2000);
		obj.enterState("VA");
		Thread.sleep(2000);
		obj.enterZipCode("1234");
		Thread.sleep(2000);
		obj.selectTypeCard("Visa");
		Thread.sleep(2000);
		obj.enterCrreditCardNumber("2347869876");
		Thread.sleep(2000);
		obj.creditCardMonth("6");
		Thread.sleep(2000);
		obj.creditCrdYear("2023");
		Thread.sleep(2000);
		obj.enterNameOnCard("james");
		Thread.sleep(2000);
		obj.remeberChekBox();
		Thread.sleep(2000);
		obj.purchaseBtn();
		Thread.sleep(2000);
		obj.verifyingText("Thank you for your purchase today!");
		Constant.driver.quit();
		
	}
	
	public static void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constant.driver = new ChromeDriver();
		Thread.sleep(3000);
		// maximize the browser
		Constant.driver.manage().window().maximize();
		Constant.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	//inspect webelement and store in web object
	@FindBy(id="inputName")WebElement nameField;
	@FindBy(id="address")WebElement addressField;
	@FindBy(id="city")WebElement cityField;//city
	@FindBy(id="state")WebElement stateField;
	@FindBy(id="zipCode")WebElement zipCodeField;
	@FindBy(id="cardType")WebElement cardTypeDropDownList;
	@FindBy(id="creditCardNumber")WebElement creditCardNumberField;
	@FindBy(id="creditCardMonth")WebElement creditCardCardMonthField;
	@FindBy(id="creditCardYear")WebElement creditCardYearField;
	@FindBy(id="nameOnCard")WebElement nameonCardField;
	@FindBy(id="rememberMe")WebElement remebremeCheckBox;
	@FindBy(xpath="//input[@class='btn btn-primary']")WebElement purchasebutton;
	@FindBy(xpath="/html/body/div[2]/div/h1")WebElement displayedText;
	
	//creating page constructot and calling intiElements from page factory
	public InspectHighlightedObjects() {
		PageFactory.initElements(Constant.driver, this);
		
	}
	
	//Step 4 creat 1 method for each web objects. the mehotd should perform action
			// for that elelmnts
	
	public void enterUsename(String username) {
		nameField.sendKeys(username);
	}
	public void enterAdress(String adress) {
		addressField.sendKeys(adress);
	}
	public void enterCity(String city) {
		cityField.sendKeys(city);
	}
	public void enterState(String state) {
		stateField.sendKeys(state);
	}
	public void enterZipCode(String zipCode) {
		zipCodeField.sendKeys(zipCode);
	}
	public void selectTypeCard(String cardType) throws InterruptedException {
		
		Select select= new Select(cardTypeDropDownList);
		select.selectByVisibleText(cardType);
		cardTypeDropDownList.click();
	}
	public void enterCrreditCardNumber(String cardNumber) {
		creditCardNumberField.sendKeys(cardNumber);
	}
	public void creditCardMonth(String cardMonth) {
		creditCardCardMonthField.clear();
		creditCardCardMonthField.sendKeys(cardMonth);
	}
	public void creditCrdYear(String cardYear) {
		creditCardYearField.clear();
		creditCardYearField.sendKeys(cardYear);
	}
	public void enterNameOnCard(String cardName) {
		nameonCardField.sendKeys(cardName);
	}
	
	
	public void remeberChekBox() {
		remebremeCheckBox.click();
	}
	public void purchaseBtn() {
		purchasebutton.click();
	}
	public void verifyingText(String message) {
		String expString ="Thank you for your purchase today!";
		if(expString.equals(displayedText.getText())) {
			System.out.println(message);
		}else {
			System.out.println("not verified");
		}
		
	}
}

