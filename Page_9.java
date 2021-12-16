package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_9 {

	 public WebDriver driver;
		
		
		@FindBy(xpath="//div[@id='center_column']/form/p/button/span")
		 private WebElement page;


		public Page_9(WebDriver driver2) {
			this.driver=driver2;
			
			PageFactory.initElements(driver, this);
		}


		public WebElement getPage() {
			return page;
		}

}
