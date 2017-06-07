package mooltipass.automatedTest.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AirBnB extends AbstractPage{
	
	public AirBnB (WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "email-login-email")
	private WebElement email;

	@FindBy(id = "email-login-password")
	private WebElement password;

	@FindBy(xpath = "//button[@class='container_1l26xld-o_O-container_rounded_sa8zo9-o_O-container_block_zdxht7-o_O-container_sizeRegular_1flp9iz-o_O-container_1hd6v8d']")
	private WebElement submitLogin;
	

	@FindBy(xpath = "//a[@href='/login']")
	private WebElement loginBtn;

	@FindBy(xpath = "//a[@href='/dashboard']")
	private WebElement dashBoard;
	
	@FindBy(xpath = "//a[@href='/logout']")
	private WebElement logoutBtn;

	@FindBy(xpath = "//a[@class='container_ov54o4-o_O-container_notBlock_1xdomts-o_O-container_sizeRegular_1t4vkpr-o_O-container_z4957l']")
	private WebElement logoutApprove;

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
		dashBoard.click();
		
	}
	public void logout(){
		logoutBtn.click();
	}
	public void approveLogout()
	{
		waitUntilAppears(logoutApprove);
		logoutApprove.click();
	}
	public boolean checkLogin(){

		waitUntilAppears(By.xpath("//a[@href='/dashboard']"));
		return isElementPresent(By.xpath("//a[@href='/dashboard']"));
	}
	public boolean checkAtLoginPage(){
		return isElementPresent(By.id("email-login-email"));
	}
}