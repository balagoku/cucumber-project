package stepdefinition;

import org.Automationproject.Automation_demosite_baseclass;
import org.Automationproject.Automation_pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runnerClass.Runner_automation;

public class Stepdef_automation extends Automation_demosite_baseclass{
	public static WebDriver driver = Runner_automation.driver;
	public static Automation_pom manager = new Automation_pom(driver);
	@When("user click sigin button")
	public void user_click_sigin_button() {
		WebElement sign_in = manager.getLoginpage().getSign_in();
		explicitWait(sign_in, 10);
		on_click(sign_in);
	}

	@When("user enter username")
	public void user_enter_username() {
		WebElement username = manager.getLoginpage().getUsername();
		sendkeys(username, "bala143342@gmail.com");
	}


	@When("user enter password")
	public void user_enter_password() {
		WebElement password = manager.getLoginpage().getPassword();
		sendkeys(password, "bala143342");
	}

	@Then("user click login button")
	public void user_click_login_button() {
		WebElement loginBtn=manager.getLoginpage().getLogin_btn();
		on_click(loginBtn);
	}

	@When("user select causual dress")
	public void user_select_causual_dress() {
		WebElement dresses = manager.getCausual().getDresses();
		moveTo_Element(dresses);

		WebElement causaldresses = manager.getCausual().getCausaldresses();
		moveTo_Elementand_click(causaldresses);

		WebElement dress = manager.getCausual().getDress();
		moveTo_Element(dress);

		WebElement viewcasual = manager.getCausual().getViewcasual();
		moveTo_Elementand_click(viewcasual);

		frame(0);
		WebElement quantity = manager.getCausual().getQuantity();
		explicitWait(quantity, 15);

		WebElement select = manager.getCausual().getSelect();
		select_byindex(select, 1);

        WebElement a = manager.getCausual().getA();
		explicitWait(a, 15);
		on_click(a);

		frame_default();
		WebElement checkout = manager.getCausual().getCheckout();
		explicitWait(checkout, 15);
		on_click(checkout);

		WebElement checkoutmain = manager.getCausual().getCheckoutmain();
		explicitWait(checkoutmain, 15);
		on_click(checkoutmain);

		WebElement checkoutmain1 = manager.getCausual().getCheckoutmain1();
		explicitWait(checkoutmain1, 15);
		on_click(checkoutmain1);


		WebElement checkbox = manager.getCausual().getCheckbox();
		on_click(checkbox);

		WebElement checkoutmain2 = manager.getCausual().getCheckoutmain2();
		explicitWait(checkoutmain2, 15);
		on_click(checkoutmain2);

		WebElement paybycheck = manager.getCausual().getPaybycheck();
		explicitWait(paybycheck, 15);
		on_click(paybycheck);

		WebElement confirmorder = manager.getCausual().getConfirmorder();
		explicitWait(confirmorder, 15);
		on_click(confirmorder);

		WebElement backtoorder = manager.getCausual().getBacktoorder();
		explicitWait(backtoorder, 15);
		on_click(backtoorder);
		
		WebElement signout = driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?mylogout=']"));
	    on_click(signout);
	}

	@When("user select evening dress")
	public void user_select_evening_dress() {
		WebElement dresses = manager.getEvening().getDresses();
		moveTo_Element(dresses);

		WebElement eveningdresses = manager.getEvening().getEveningdresses();
		moveTo_Elementand_click(eveningdresses);

		WebElement dress = manager.getEvening().getDress();
		moveTo_Element(dress);

		WebElement viewcasual = manager.getEvening().getViewcasual();
		moveTo_Elementand_click(viewcasual);

		frame(0);
		WebElement quantity = manager.getEvening().getQuantity();
		explicitWait(quantity, 15);

		WebElement select = manager.getEvening().getSelect();
		select_byindex(select, 1);

        WebElement a = manager.getEvening().getA();
		explicitWait(a, 15);
		on_click(a);

		frame_default();
		WebElement checkout = manager.getEvening().getCheckout();
		explicitWait(checkout, 15);
		on_click(checkout);

		WebElement checkoutmain = manager.getEvening().getCheckoutmain();
		explicitWait(checkoutmain, 15);
		on_click(checkoutmain);

		WebElement checkoutmain1 = manager.getEvening().getCheckoutmain1();
		explicitWait(checkoutmain1, 15);
		on_click(checkoutmain1);


		WebElement checkbox = manager.getEvening().getCheckbox();
		on_click(checkbox);

		WebElement checkoutmain2 = manager.getEvening().getCheckoutmain2();
		explicitWait(checkoutmain2, 15);
		on_click(checkoutmain2);

		WebElement paybycheck = manager.getEvening().getPaybycheck();
		explicitWait(paybycheck, 15);
		on_click(paybycheck);

		WebElement confirmorder = manager.getEvening().getConfirmorder();
		explicitWait(confirmorder, 15);
		on_click(confirmorder);

		WebElement backtoorder = manager.getEvening().getBacktoorder();
		explicitWait(backtoorder, 15);
		on_click(backtoorder);
		
		WebElement signout = driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?mylogout=']"));
	    on_click(signout);
	}

	@When("user select summer dress")
	public void user_select_summer_dress() {
		WebElement dresses = manager.getSummer().getDresses();
		moveTo_Element(dresses);

		WebElement summerdresses = manager.getSummer().getSummerdresses();
		moveTo_Elementand_click(summerdresses);

		WebElement dress = manager.getSummer().getDress();
		moveTo_Element(dress);

		WebElement viewcasual = manager.getSummer().getViewcasual();
		moveTo_Elementand_click(viewcasual);

		frame(0);
		WebElement quantity = manager.getSummer().getQuantity();
		explicitWait(quantity, 15);

		WebElement select = manager.getSummer().getSelect();
		select_byindex(select, 1);

        WebElement a = manager.getSummer().getA();
		explicitWait(a, 15);
		on_click(a);

		frame_default();
		WebElement checkout = manager.getSummer().getCheckout();
		explicitWait(checkout, 15);
		on_click(checkout);

		WebElement checkoutmain = manager.getSummer().getCheckoutmain();
		explicitWait(checkoutmain, 15);
		on_click(checkoutmain);

		WebElement checkoutmain1 = manager.getSummer().getCheckoutmain1();
		explicitWait(checkoutmain1, 15);
		on_click(checkoutmain1);


		WebElement checkbox = manager.getSummer().getCheckbox();
		on_click(checkbox);

		WebElement checkoutmain2 = manager.getSummer().getCheckoutmain2();
		explicitWait(checkoutmain2, 15);
		on_click(checkoutmain2);

		WebElement paybycheck = manager.getSummer().getPaybycheck();
		explicitWait(paybycheck, 15);
		on_click(paybycheck);

		WebElement confirmorder = manager.getSummer().getConfirmorder();
		explicitWait(confirmorder, 15);
		on_click(confirmorder);

		WebElement backtoorder = manager.getSummer().getBacktoorder();
		explicitWait(backtoorder, 15);
		on_click(backtoorder);
		
		WebElement signout = driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?mylogout=']"));
	    on_click(signout);
	}

}
