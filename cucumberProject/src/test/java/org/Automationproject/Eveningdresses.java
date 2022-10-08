package org.Automationproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Eveningdresses {
	public WebDriver driver;
	@FindBy(xpath = "(//a[text()='Dresses'])[2]")
	private WebElement dresses;

	@FindBy(xpath = "(//a[text()='Evening Dresses'])[2]")
	private WebElement eveningdresses;

	@FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement dress;

	@FindBy(xpath = "//a[@class='quick-view']")
	private WebElement viewcasual;

	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement quantity;

	@FindBy(xpath = "//select[@name='group_1']")
	private WebElement select;

	@FindBy(xpath = "//button[@type='submit'and@name='Submit']")
	private WebElement a;

	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement checkout;

	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement checkoutmain;

	@FindBy(xpath = "//button[@type='submit'and @name='processAddress']")
	private WebElement checkoutmain1;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;

	@FindBy(xpath = "//button[@type='submit'and@class='button btn btn-default standard-checkout button-medium']")
	private WebElement checkoutmain2;

	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement paybycheck;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement confirmorder;

	@FindBy(xpath = "//a[@class='button-exclusive btn btn-default']")
	private WebElement backtoorder;

	

	public Eveningdresses(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getEveningdresses() {
		return eveningdresses;
	}

	public WebElement getDress() {
		return dress;
	}

	public WebElement getViewcasual() {
		return viewcasual;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getA() {
		return a;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getCheckoutmain() {
		return checkoutmain;
	}

	public WebElement getCheckoutmain1() {
		return checkoutmain1;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCheckoutmain2() {
		return checkoutmain2;
	}

	public WebElement getPaybycheck() {
		return paybycheck;
	}

	public WebElement getConfirmorder() {
		return confirmorder;
	}

	public WebElement getBacktoorder() {
		return backtoorder;
	}
}
