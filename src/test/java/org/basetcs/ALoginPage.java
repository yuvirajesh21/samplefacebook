package org.basetcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ALoginPage extends Basemaven{
	public ALoginPage() {
		PageFactory.initElements(driver, this);
		
	}
@FindBy(id="username")
private WebElement txtusrname;

@FindBy(id="password")
private WebElement txtpass;
@FindBy(id="login")
private WebElement txtlogin;
public WebElement getTxtusrname() {
	return txtusrname;
}
public WebElement getTxtpass() {
	return txtpass;
}
public WebElement getTxtlogin() {
	return txtlogin;
}
}
