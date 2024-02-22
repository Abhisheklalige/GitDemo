package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	protected WebDriver driver ;

	private By txt_username = By.xpath("//input[@autocomplete='username']");
	private By txt_password = By.xpath("//input[@type='password']");
	private By btn_login = By.xpath("//div[@class='SignInPage_formButtons_1IH5I_5JblBhZ2Ut']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username ) {
		driver.findElement(txt_username).sendKeys(username);

	}

	public void enterPassword(String password ) {
		driver.findElement(txt_password).sendKeys(password);

	}
	public void clickLogin( ) {
		driver.findElement(btn_login).click();;

	}


}
