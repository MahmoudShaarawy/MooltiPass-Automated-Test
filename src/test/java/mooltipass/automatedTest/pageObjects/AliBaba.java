package mooltipass.automatedTest.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AliBaba extends AbstractPage{
	
	public AliBaba (WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//div[@class='sc-hd-ms-group-sign']//a[@data-val='ma_signin']")
	private WebElement loginBtn;
	@FindBy(id = "fm-login-id")
	private WebElement email;

	@FindBy(id = "fm-login-password")
	private WebElement password;
	
	@FindBy(id = "fm-login-submit")
	private WebElement submitLogin;
	@FindBy(xpath = "//a[@data-val='My Alibaba']")
	private WebElement dashBoard;
	@FindBy(xpath = "//a[@href='//usmy.alibaba.com/user/sign/sign_out.htm/?spm=a2700.8293689.0.0.sNsOrt&tracelog=hd_signout']")
	private WebElement logoutBtn;
	

	public void enterEmail(String value){
		waitUntilAppears(email);
		email.sendKeys(value);
	}

	public void enterPassword(String value){

		waitUntilAppears(password);
		password.sendKeys(value);
	}
	
	public void goToLogin(){
		waitUntilAppears(loginBtn);		
		loginBtn.click();
	}
	
	public void submit(){
	submitLogin.click();
	}
	public void goTodDashboard()
	{
		waitUntilAppears(dashBoard);
		clickWithAction(loginBtn);
		
	}
	public void logout(){
		logoutBtn.click();
	}
	
	public boolean checkLogin(){

		waitUntilAppears(By.xpath("//a[@data-val='My Alibaba']"));
		return isElementPresent(By.xpath("//a[@data-val='My Alibaba']"));
	}
	public boolean checkAtLoginPage(){
		return isElementPresent(By.id("fm-login-id"));
	}
	
	
}
