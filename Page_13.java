package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_13 {

	public WebDriver driver;

	@FindBy(xpath = "//span[text()='I confirm my order']")
	private WebElement myorder;

	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement jscript;

	public Page_13(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	public WebElement getMyorder() {
		return myorder;
	}

	public WebElement getJscript() {
		return jscript;
	}

}
