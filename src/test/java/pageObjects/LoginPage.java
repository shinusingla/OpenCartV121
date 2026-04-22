package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }       
    @FindBy(id="input-email")
    private WebElement emailField;
    
    @FindBy(id="input-password")
    private WebElement passwordField;
    
    @FindBy(xpath="//input[@value='Login']")
    private WebElement loginButton;
    
    public void setEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }
    
    public void setPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    
    public void clickLogin() {
        loginButton.click();
    }
    
}
