package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyAccountPage extends PageBase
{
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText="Change password")
	WebElement changePasswordLink ; 
	
	@FindBy(id = "OldPassword")
    WebElement oldPasswordTxt;
	
    @FindBy(id = "NewPassword")
    WebElement newPasswordTxt;
    
    @FindBy(id = "ConfirmNewPassword")
    WebElement confirmPasswordTxt;
    
    @FindBy(css = "button.button-1.change-password-button")
    WebElement ChangePasswordBtn;
    
    @FindBy(css = "div.result")
    public WebElement resultLbl;
    
    @FindBy(xpath="//*[@id=\"bar-notification\"]/div/span")
    WebElement closeBtn ;
    
    @FindBy (css="a.ico-logout")
    WebElement logoutBtn;
	
	public void openChangePasswordPage() 
	{
		clickButton(changePasswordLink);
	}
	
	
	public void closeBtn() 
	{
		clickButton(closeBtn);
	}
	
	public void LogoutBtn() 
	{
		clickButton(logoutBtn);
	}
	

	public void ChangePassword(String oldpassword, String newpassword) {
        setTextElementText(oldPasswordTxt, oldpassword);
        setTextElementText(newPasswordTxt, newpassword);
        setTextElementText(confirmPasswordTxt, newpassword);
        clickButton(ChangePasswordBtn);
        clickButton(closeBtn);
        clickButton(logoutBtn);
    }

}
