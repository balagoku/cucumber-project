package org.Automationproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Automation_pom {
	public WebDriver driver;
	private Login_page loginpage;
	private Causualdresses causual;
	private Eveningdresses evening;
	private Summerdresses summer;
	
	public Automation_pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public Login_page getLoginpage() {
		if (loginpage == null) {
			loginpage = new Login_page(driver);
		}

		
		return loginpage;
	}
	public Causualdresses getCausual() {
		if (causual == null) {
			causual = new Causualdresses(driver);
		}

		return causual;
	}
	public Eveningdresses getEvening() {
		if (evening == null) {
			evening = new Eveningdresses(driver);
		}

		return evening;
	}
	public Summerdresses getSummer() {
		if (summer == null) {
			summer = new Summerdresses(driver);
		}

		return summer;
	}
	
	
	}

