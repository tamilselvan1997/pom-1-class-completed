package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_6 {
	
	public WebDriver driver;
	
	
	@FindBy(name="Submit")
	 private WebElement page;


	public Page_6(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}


	public WebElement getPage() {
		return page;
	}

}
