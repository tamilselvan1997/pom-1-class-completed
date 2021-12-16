package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Single_Frame {

	public WebDriver driver;
	
	
	@FindBy(xpath="//iframe[@frameborder='0']")
	private WebElement frame;


	public Single_Frame(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}


	public WebElement getFrame() {
		return frame;
	}

}
