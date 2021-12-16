package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_7 {

	public WebDriver driver;

	@FindBy(xpath = "//span[contains(text(),'Proceed')]")
	private WebElement seven;

	public Page_7(WebDriver driver2) {
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getSeven() {
		return seven;
	}
}
