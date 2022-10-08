package org.Automationproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	public WebDriver driver;
@FindBy(xpath = "//a[@class='login']")
private WebElement sign_in;

@FindBy(xpath = "//input[@id='email']")
private WebElement username;

@FindBy(xpath = "//input[@id='passwd']")
private WebElement password;

@FindBy(xpath = "//button[@id='SubmitLogin']")
private WebElement login_btn;

public Login_page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public WebElement getSign_in() {
	return sign_in;
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin_btn() {
	return login_btn;
}


}
