package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_11 {
	
public WebDriver driver;
	
	
	@FindBy(name="processCarrier")
	 private WebElement elevan;


	public Page_11(WebDriver driver2) {
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);
	}
	


	public WebElement getElevan() {
		return elevan;
	}


	
	
	



}
