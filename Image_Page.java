package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Image_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//img[@itemprop='image']")
	private WebElement image;

	public Image_Page(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getImage() {
		return image;
	}

}
