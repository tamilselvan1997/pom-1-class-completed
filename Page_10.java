package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_10 {
	
public WebDriver driver;
	
	
	@FindBy(id="cgv")
	 private WebElement ten;


	public Page_10(WebDriver driver2) {
		this.driver =driver2;
		
		PageFactory.initElements(driver,this);
	}


	public WebElement getTen() {
		return ten;
	}



}
