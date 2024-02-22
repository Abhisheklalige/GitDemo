package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	@FindBy(xpath="//input[@autocomplete='username']")
	WebElement txt_username;

	@FindBy(xpath="//input[@type='password']")
	WebElement txt_password;

	@FindBy(xpath="//div[@class='SignInPage_formButtons_1IH5I_5JblBhZ2Ut']")
	WebElement btn_loginbuttton;

	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	

	public void enterUsername(String username) {

		txt_username.sendKeys(username);

	}

	public void enterPassword(String password) {

		txt_password.sendKeys(password);

	}


	public void clickOnLogin(){

		btn_loginbuttton.click();

	}









}
