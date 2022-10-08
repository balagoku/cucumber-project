package org.Automationproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Automation_demoRunnerclass extends Automation_demosite_baseclass {
	
public static WebDriver driver =getbrowser("chrome");
public static Login_page login = new Login_page(driver);

public static Automation_pom manager = new Automation_pom(driver);
	public static void casual_dresses() {
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
	}

	public static void evening_dresses() {
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
	}

	public static void Summer_dresses() {
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
	}

	public static void main(String[] args) {
		
		Url("http://automationpractice.com/index.php");

	
		WebElement sign_in = manager.getLoginpage().getSign_in();
		explicitWait(sign_in, 10);
		on_click(sign_in);

		WebElement username = manager.getLoginpage().getUsername();
		sendkeys(username, "bala143342@gmail.com");

		WebElement password = manager.getLoginpage().getPassword();
		sendkeys(password, "bala143342");

		WebElement loginBtn=manager.getLoginpage().getLogin_btn();
		on_click(loginBtn);

		casual_dresses();
		evening_dresses();
		Summer_dresses();
		close();
	}
}
