package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.LoginPage_PF;

public class loginDemoSteps {

	WebDriver driver = null;
	LoginPage_PF login;

	@Given("browser is open")
	public void browser_is_open() {
		String projPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projPath+
				"/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS); 
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); 
		driver.manage().window().maximize();
	}



	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://app.testim.io/#/signin");

	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password) {
		login = new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		//		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys(username);
		//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	}


	@And("user click on login button")
	public void user_click_on_login_button() {
		login.clickOnLogin();
		//		driver.findElement(By.xpath("//div[@class='SignInPage_formButtons_1IH5I_5JblBhZ2Ut']")).click();

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside the -user is navigated to the home page ");
		
		driver.close();
		driver.quit();

	}


}
