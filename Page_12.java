package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_12 {
	
public WebDriver driver;
	
	
	@FindBy(xpath="//a[@class='cheque']")
	 private WebElement cheque;


	public Page_12(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}


	public WebElement getCheque() {
		return cheque;
	}



}
