package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import static UtilityLayer.UtilsClass.*;

public class RegisterPage extends BaseClass {

 @FindBy(name="firstname")
 private WebElement fname;

    @FindBy(name="lastname")
  private WebElement lname;


  @FindBy(name="reg_email__")
  private WebElement email;
  
  @FindBy(name="reg_email_confirmation__")
  private WebElement cemail;
  

    @FindBy(name="reg_passwd__")
     private WebElement rpass;
    
   

    @FindBy(name="birthday_day")
    private WebElement date;
    
    @FindBy(name="birthday_month")
    private WebElement month;
    
    @FindBy(name="birthday_year")
    private WebElement year;
    
    
    public RegisterPage()
    {
    	PageFactory.initElements(driver,this);
    }
    
    public void loginFunctionality(String fName,String lName,String Email,String Cemail,String Password,String Date,String Month,String Year)
    {
    	sendKeys(fname, fName);
    	sendKeys(lname, lName);
    	sendKeys(email, Email);
    	sendKeys(cemail, Cemail);
    	sendKeys(rpass, Password);
    	sendKeys(date, Date);
    	sendKeys(month, Month);
    
    	sendKeys(cemail, Year);
    	
    	
    	
    }

}
